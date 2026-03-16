import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cash money = new Cash();
        double dollars;
        int cents;


            while (money.getCash() <= 0){
                System.out.print("Enter a value: ");
                dollars =  (scan.nextDouble());
                cents = (int) Math.round(dollars * 100);
                money.setCash(cents);
            }

            money.count();

    }

}