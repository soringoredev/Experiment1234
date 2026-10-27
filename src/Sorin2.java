import java.util.Scanner;

public class Sorin2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age > 17) {
            System.out.println("You are an adult ...");
            System.out.println("name: " + name);
            System.out.println("age: " + age);
        } else {
            System.out.println("You are a child ...");
            System.out.println("name: " + name);
            System.out.println("age: " + age);
        }

    }
}
