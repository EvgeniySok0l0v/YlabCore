/**
 * Main class for task1
 */
public class Main {
    private final int[][] array;
    private int maxValue;
    private int minValue;
    private double averageValue;

    public static void main(String[] args) {
        Main main = new Main(fillArray());
        //dsd
        main.getValuesForTask1();
        System.out.println(main);
    }

    public Main(int[][] array){
        this.array = array;
    }

    /**
     * Method for find:
     * max,min and average values
     */
    public void getValuesForTask1(){
        long sum = 0;
        int size = 0;
        this.maxValue = this.array[0][0];
        this.minValue = this.maxValue;

        for (int[] arr : this.array){
            for(int n : arr) {
                if (n >= this.maxValue) {
                    this.maxValue = n;
                }
                if(n < this.minValue){
                    this.minValue = n;
                }
                sum += n;
            }
            size += arr.length;
        }
        if (sum != 0)
            this.averageValue = (double) sum /size;
    }

    /**
     * Method for fill array
     * @return new int[5][5]
     */
    private static int[][] fillArray(){
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random()*10);
            }
        }
        return array;
    }

    @Override
    public String toString(){
        return "Max value: " + this.maxValue
                + "\nMin value: " + this.minValue
                + "\nAverage value: " + this.averageValue;
    }
}