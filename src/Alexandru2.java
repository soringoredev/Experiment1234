import java.util.Scanner;

public class Alexandru2 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu numele tau: ");
        String nume = input.nextLine();
        System.out.println("Salut " + nume + "!");
        input.close();
    }

}
