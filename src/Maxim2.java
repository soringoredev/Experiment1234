import java.util.Scanner;

public class Maxim2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu varsta ta: ");
        int varsta = scanner.nextInt();

        System.out.println("Ai " + varsta + " ani.");

        scanner.close();
    }
}