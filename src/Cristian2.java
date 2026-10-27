import java.util.Scanner;

public class Cristian2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Introdu numele tau : ");
        String nume = scanner.nextLine();

        System.out.printf("Introdu varsta : ");
        String varsta = scanner.nextLine();

        System.out.printf("Te cheama " + nume + " " + varsta);
    }
}
