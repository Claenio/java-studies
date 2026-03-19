import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Population population = new Population();
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter population start size: ");
            population.setStartSizePopulation(scan.nextInt());
        }while (population.getStartSizePopulation() < 9);
        do {
            System.out.print("Enter population end size: ");
            population.setEndSizePopulation(scan.nextInt());
        } while (population.getEndSizePopulation() <= population.getStartSizePopulation());

        population.calculateYears();



    }
}
