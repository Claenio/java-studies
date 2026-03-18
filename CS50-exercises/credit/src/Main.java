import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Credit card = new Credit();
    Scanner scan = new Scanner(System.in);
    boolean loop = true;

    do {
        System.out.print("Enter  an card number (or press 0 to leave): ");
        long input = scan.nextLong();

        if (input == 0){
            loop = false;
        } else {
            card.setCardNumber(input);
            card.cardValidation();
        }

    } while (loop);
}
}