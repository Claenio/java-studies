import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mario pyramid = new Mario();

        do{
            System.out.print("Set a value of height (1-10): ");
            pyramid.setHeight(input.nextInt());
        } while (pyramid.getHeight() <= 0 || pyramid.getHeight() > 10);

        pyramid.printPyramid();




    }

}