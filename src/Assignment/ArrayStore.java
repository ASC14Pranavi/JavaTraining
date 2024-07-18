package Assignment;

import java.util.Arrays;

public class ArrayStore {
    private int[] vals;
    public ArrayStore() {
        // Initialize the array with 10 integers
        this.vals = new int[] {15, 22, 32, 14, 15, 62, 7, 8, 9, 10};
    }

    // Display the elements of the array using a for loop
    public void displayUsingForLoop() {
        for (int i = 0; i < vals.length; i++) {
            System.out.println(vals[i]);
        }
    }

    // Display the elements of the array using a while loop
    public void displayUsingWhileLoop() {
        int i = 0;
        while (i < vals.length) {
            System.out.println(vals[i]);
            i++;
        }
    }

    // Sort the array
    public void sortArray() {
        Arrays.sort(vals);
    }

    // Accept a number and return the number of times it occurs in the array
    public int countnum(int number) {
        int count = 0;
        for (int val : vals) {
            if (val == number) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        ArrayStore arrayStore = new ArrayStore();

        System.out.println("Displaying array using for loop:");
        arrayStore.displayUsingForLoop();

        System.out.println("\nDisplaying array using while loop:");
        arrayStore.displayUsingWhileLoop();

        arrayStore.sortArray();
        System.out.println("\nArray after sorting:");
        arrayStore.displayUsingForLoop();

        int numberToCount = 15;
        int occurrences = arrayStore.countnum(numberToCount);
        System.out.println("\nNumber of occurrences of " + numberToCount + ": " + occurrences);

    }
}
