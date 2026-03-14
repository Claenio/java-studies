import java .util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cash money = new Cash();

            System.out.print("Set a value: ");
            money.setCash(scan.nextInt());
            while (money.getCash() <= 0){
                System.out.print("Enter an integer: ");
                money.setCash(scan.nextInt());
            }


    }

}