/**
 * This class demonstrates various ways to work with arrays in Java
 * including syntax, initialization, and common array operations
 */
public class Arrays {
    public static void main(String[] args) {
        System.out.println("JAVA ARRAYS TUTORIAL\n");

        // ============ 1. ARRAY SYNTAX AND INITIALIZATION ============
        System.out.println("1. Array Declaration and Initialization:\n");

        // Method 1: Declaration and initialization in separate steps
        int[] numbers; // Declaring array (preferred syntax)
        numbers = new int[5]; // Initializing with size 5 (all elements are 0 by default)

        // Use the numbers array by filling it with values
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10; // Fill array with 0, 10, 20, 30, 40
        }

        System.out.println("\nNumbers array:");
        printArray(numbers); // Will print: [0, 10, 20, 30, 40]

        // Method 2: Declaration and initialization in one line
        int[] scores = new int[3]; // Creates array of size 3

        // Method 3: Array initialization with values
        int[] marks = { 95, 85, 75, 65, 55 }; // Array literal syntax

        // Method 4: Alternative syntax (less common)
        // int grades[] = new int[] { 90, 80, 70 }; // Square brackets can be after
        // variable name

        // Printing initial arrays
        System.out.println("\nEmpty array after initialization (default values):");
        printArray(scores); // Will print: [0, 0, 0]

        System.out.println("\nArray initialized with values:");
        printArray(marks); // Will print: [95, 85, 75, 65, 55]

        // ============ 2. ACCESSING AND MODIFYING ARRAYS ============
        System.out.println("\n2. Array Access and Modification:\n");

        // Accessing elements (index starts from 0)
        int firstScore = marks[0]; // Gets first element (95)
        int lastScore = marks[marks.length - 1]; // Gets last element (55)
        System.out.println("First score: " + firstScore);
        System.out.println("Last score: " + lastScore);

        // Modifying elements
        marks[1] = 88; // Changes second element to 88
        System.out.println("\nArray after modification:");
        printArray(marks);

        // ============ 3. ARRAY ITERATION METHODS ============
        System.out.println("\n3. Different Ways to Iterate Arrays:\n");

        // Method 1: Standard for loop
        System.out.println("Using standard for loop:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        // Method 2: Enhanced for loop (for-each)
        System.out.println("\nUsing enhanced for loop (for-each):");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();

        // ============ 4. MULTIDIMENSIONAL ARRAYS ============
        System.out.println("\n4. Multidimensional Arrays:\n");

        // 2D Array Declaration and Initialization
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Alternative 2D array initialization
        // int[][] grid = new int[2][3]; // 2 rows, 3 columns

        // Accessing 2D array elements
        System.out.println("Accessing 2D array elements:");
        System.out.println("matrix[0][0] = " + matrix[0][0]); // First element (1)
        System.out.println("matrix[1][1] = " + matrix[1][1]); // Middle element (5)

        // Iterating 2D array
        System.out.println("\nPrinting 2D array:");
        print2DArray(matrix);

        // ============ 5. COMMON ARRAY OPERATIONS ============
        System.out.println("\n5. Common Array Operations:\n");

        int[] testArray = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Original array:");
        printArray(testArray);

        // Finding maximum value
        System.out.println("\nMaximum value: " + findMax(testArray));

        // Finding minimum value
        System.out.println("Minimum value: " + findMin(testArray));

        // Calculating average
        System.out.println("Average value: " + calculateAverage(testArray));

        // Reversing array
        reverseArray(testArray);
        System.out.println("\nArray after reversal:");
        printArray(testArray);
    }

    /**
     * Utility method to print 1D array
     */
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * Utility method to print 2D array
     */
    private static void print2DArray(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Find max
    private static int findMax(int[] arr) {
        if (arr == null || arr.length == 0)
            return Integer.MIN_VALUE;
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

    // Find min
    private static int findMin(int[] arr) {
        if (arr == null || arr.length == 0)
            return Integer.MAX_VALUE;
        int min = arr[0];
        for (int num : arr) {
            if (num < min)
                min = num;
        }
        return min;
    }

    /**
     * Calculates average of array elements
     * 
     * @param arr input array
     * @return average of all elements
     */
    private static double calculateAverage(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0.0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    /**
     * Reverses the elements of array in-place
     * 
     * @param arr array to reverse
     */
    private static void reverseArray(int[] arr) {
        if (arr == null || arr.length <= 1)
            return;
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}