import java.util.Scanner;

/**
 * FindMax.java
 *
 * Finds the maximum value in a user-supplied array and the index
 * at which it occurs, using a simple linear search.
 *
 * Time Complexity: O(n) - the array is scanned exactly once.
 * Space Complexity: O(n) - for storing the input array.
 */
public class FindMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Basic validation so the program doesn't crash on bad input
        while (size <= 0) {
            System.out.print("Array size must be greater than 0. Please re-enter: ");
            size = scanner.nextInt();
        }

        // Step 2: Create the array and collect elements
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        // Step 3: Linear search for the maximum value and its index
        int maxValue = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }

        // Step 4: Display results
        System.out.println("\n--- Find Maximum Results ---");
        System.out.print("Array: [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("Maximum Value : " + maxValue);
        System.out.println("Found at Index: " + maxIndex);
        System.out.println("-----------------------------");

        scanner.close();
    }
}