import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Readability read = new Readability();

        System.out.print("Text: ");
        read.setText(scan.nextLine());

        read.calculate();
        read.getIndex();
        read.printGrade();

        scan.close();

    }
}