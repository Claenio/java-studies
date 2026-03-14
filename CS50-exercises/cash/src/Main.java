import java .util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cash money = new Cash();

            System.out.print("Set a value(1 for $0.01, 10 for $0,10 100 for $1.00...: ");
            money.setCash(scan.nextInt());
            while (money.getCash() <= 0){
                System.out.print("Enter an integer: ");
                money.setCash(scan.nextInt());
            }

            money.count();

    }

}