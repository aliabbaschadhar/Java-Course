import java.util.Scanner;//To take input from user

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your name:");
        String name = sc.next();
        System.out.println("Your name is "+name);
        System.out.println("Your age is :"+age);
        sc.close(); //must close t
    }
}
