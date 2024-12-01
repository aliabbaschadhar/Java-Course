package exceptionHandling_13;

public class Exceptions {
    public static void main(String[] args) {
        int arr[] = new int[5];
        // try {
        // System.out.println(arr[8]); // If a line executes error in try block the code
        // after that line will not be
        // // executed
        // int result = 5 / 0; // Not executed
        // } catch (ArrayIndexOutOfBoundsException eArrayIndexOutOfBoundsException) {
        // System.out.println("Tried to acccess the out of bounds element");
        // } catch (ArithmeticException eArithmeticException) {
        // System.out.println(eArithmeticException.getStackTrace()); // Keeps trace of
        // that error happened at what line
        // System.out.println(eArithmeticException.getMessage());// shows the error
        // message
        // System.out.println(eArithmeticException);
        // }

        // try {
        // int result = 5 / 0;
        // System.out.println(arr[8]);
        // } catch (ArrayIndexOutOfBoundsException | ArithmeticException |
        // NullPointerException e) {
        // System.out.println("Handline exception");
        // System.out.println(e.getMessage());
        // } catch (RuntimeException e) {
        // System.out.println("run time exception occured");
        // }

        try {
            // int result = 5 / 0;
            System.out.println(arr[8]);
        } catch (Exception e) {
            // Exception is the parent of all other exception classes
            System.out.println("All exception are handled");
        } finally {
            // The finally block ALWAYS executes whether an exception occurs or not
            // It's commonly used for cleanup operations like:
            // - Closing database connections
            // - Closing file streams
            // - Releasing network resources
            // - Cleaning up any resources that must be handled regardless of errors
            System.out.println("This will always execute!");
        }

        System.out.println("Hello guys");
    }
}