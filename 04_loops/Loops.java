import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // 1. For Loop - when you know the number of iterations
        System.out.println("1. Basic For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // 2. Enhanced For Loop (For-Each) - iterating through arrays/collections
        System.out.println("\n2. Enhanced For Loop:");
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // 3. While Loop - when number of iterations is not known beforehand
        System.out.println("\n3. While Loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println("While count: " + count);
            count++;
        }

        // 4. Do-While Loop - executes at least once
        System.out.println("\n4. Do-While Loop:");
        int num = 1;
        do {
            System.out.println("Do-While number: " + num);
            num++;
        } while (num <= 5);

        // 5. Nested Loops - loop inside another loop
        System.out.println("\n5. Nested Loop (Creating a pattern):");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 6. Loop with break statement
        System.out.println("\n6. Loop with break:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // exits the loop when i equals 6
            }
            System.out.println("Number before break: " + i);
        }

        // 7. Loop with continue statement
        System.out.println("\n7. Loop with continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // skips the rest of the loop body when i equals 3
            }
            System.out.println("Number with continue: " + i);
        }

        // 8. Infinite Loop with break condition
        System.out.println("\n8. Controlled Infinite Loop:");
        int counter = 1;
        while (true) {
            System.out.println("Iteration: " + counter);
            if (counter == 5) {
                break;
            }
            counter++;
        }

        // 9. Loop with multiple conditions
        System.out.println("\n9. Loop with multiple conditions:");
        for (int i = 1, j = 10; i <= 5; i++, j--) {
            System.out.println("i: " + i + ", j: " + j);
        }

        // 10. Loop through 2D array
        System.out.println("\n10. Loop through 2D array:");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nEnter number of which you want to print table of: ");
        Scanner sc = new Scanner(System.in);
        int tableNumber = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNumber + " * " + i + " = " + tableNumber * i);
        }
        sc.close();
        int k = 0;
        outerLoop: // labeled loop
        while (k >= 10) {
            while (k >= 5) {
                if (k == 3)
                    break outerLoop; // When this will execute the break statement will not only break from innerloop
                                     // it also remove from the outer loop using label in loops;
                System.out.println(k);
            }
            k++;
        }
    }
}
