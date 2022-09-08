/**
 * class for task3
 */
public class TaskThree {

    /**
     * Main method for demo how work task
     * @param args - args
     */
    public static void main(String[] args) {
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel") + " - true"); // true
        System.out.println(fuzzySearch("cwhl", "cartwheel") + " - true"); // true
        System.out.println(fuzzySearch("cwhee", "cartWheel") + " - false"); // false
        System.out.println(fuzzySearch("cartwheel", "cartwheel") + " - true"); // true
        System.out.println(fuzzySearch("cwheeel", "cartwheel") + " - false"); // false
        System.out.println(fuzzySearch("lw", "cartwheel") + " - false"); // false
        System.out.println(fuzzySearch("lW", "cartwheel") + " - false"); // false
        System.out.println(fuzzySearch("lW", "cartwheelw") + " - false"); // false
        System.out.println(fuzzySearch("lwW", "cartwheelWw") + " - false"); // false
        System.out.println(fuzzySearch("lWWw", "cartwheelWWdw") + " - true"); // true
        System.out.println(fuzzySearch("0lWWw", "0lcartwheelWWdw") + " - true"); // true
        System.out.println(fuzzySearch("0lWWw", "00lcartwheelWWdw") + " - true"); // true
        System.out.println(fuzzySearch("lwW", "lw") + " - false"); // false
    }

    /**
     * method for fuzzy search
     *
     * @param target - target string
     * @param str - string for search
     * @return boolean value
     */
    public static boolean fuzzySearch(String target, String str){
        if (target.length() <= str.length()){

            int valueToSkip = 0, counterOfDuplicate = 0;
            char duplicateChar = 0;
            String result = "";

            for(char letter : target.toCharArray()){
                //count duplicate char
                if(duplicateChar == letter){
                    counterOfDuplicate++;
                } else {
                    counterOfDuplicate = 0;
                }
                //check char in str
                if(str.chars().skip(valueToSkip+counterOfDuplicate).anyMatch(c -> c == letter)) {

                    result +=letter;
                    if(result.equals(target)){
                        return true;
                    }
                    valueToSkip = str.indexOf(letter,valueToSkip);

                } else {
                    return false;
                }
                duplicateChar = letter;
            }
        }
        return false;
    }
}
