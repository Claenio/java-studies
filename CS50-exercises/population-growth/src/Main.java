import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Population population = new Population();
        Scanner scan = new Scanner(System.in);
        //VERIFICAR SE A POPULAÇÃO INICIAL É NO MÍNIMO 9
        //O TAMANHO FINAL DEVE SER NO MÍNIMO O TAMANHO INICIAL
        //CALCULAR QUANTOS ANOS VAI PRECISAR PARA ATINGIR A QUANTIDADE FINAL

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
