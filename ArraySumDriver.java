public class ArraySumDriver {
    private final static int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        int index = 0;

        // Initialize an array of size ARRAY_SIZE
        Integer[] myArray = new Integer[ARRAY_SIZE];
        // Create an instance of ArraySum to use the sumOfArray method
        ArraySum arraySum = new ArraySum();

        // Add values to the array
        myArray[index++] = 3;
        myArray[index++] = 5;
        myArray[index++] = 2;
        myArray[index++] = 6;

        // Compute the sum of the first 4 elements
        int sum = arraySum.sumOfArray(myArray, 3);
        System.out.println("Sum of first 4 elements: " + sum);

        // Add more values to the array
        myArray[index++] = 7;
        myArray[index++] = 1;

        // Compute the sum of all 6 elements
        sum = arraySum.sumOfArray(myArray, 5);
        System.out.println("Sum of all 6 elements: " + sum);
    }
}
