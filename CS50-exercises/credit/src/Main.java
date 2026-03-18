import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Credit card = new Credit();
    Scanner scan = new Scanner(System.in);
    boolean loop = true;

    do {
        System.out.print("Digit an card number: ");
        card.setCardNumber(scan.nextLong());
        card.cardValidation();


    } while (loop);
}
}