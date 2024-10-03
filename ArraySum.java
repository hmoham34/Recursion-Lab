public class ArraySum {
    // Recursive method to sum values in the array
    public int sumOfArray(Integer[] a, int index) {
        // Base case: if index is less than 0, stop recursion
        if (index < 0) {
            return 0;
        } 
        // Recursive case: sum the current element with the sum of the rest
        return a[index] + sumOfArray(a, index - 1);
    }
}
