import java.util.Scanner;

/**
 * PairSum.java
 *
 * Searches a user-supplied array for a unique pair of numbers whose
 * sum equals a target value, using the Brute Force (nested loop) method.
 *
 * Time Complexity: O(n^2) - every pair of elements is checked once.
 * Space Complexity: O(n) - for storing the input array.
 */
public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

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

        // Step 3: Get the target sum
        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

        // Step 4: Brute force nested-loop search for a matching pair
        boolean found = false;
        int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < numbers.length && !found; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    firstIndex = i;
                    secondIndex = j;
                    found = true;
                    break;
                }
            }
        }

        // Step 5: Display results
        System.out.println("\n--- Pair Sum Results ---");
        if (found) {
            int a = numbers[firstIndex];
            int b = numbers[secondIndex];
            System.out.println("Pair Found!");
            System.out.println("Indices: [" + firstIndex + ", " + secondIndex + "]");
            System.out.println("Values : " + a + " and " + b);
            System.out.println("Equation: " + a + " + " + b + " = " + target);
        } else {
            System.out.println("No pair found that sums to " + target + ".");
        }
        System.out.println("------------------------");

        scanner.close();
    }
}