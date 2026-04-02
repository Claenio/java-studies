public class Main{
    public static void main(String[] args){
        int[] arrayNumbers = {9, 3, 4, 2, 1, 5, 8, 6, 0};
        int myNum = 0;

        //LINEAR ALGORITHM
        for(int i = 0; i < arrayNumbers.length; i++){
            if(arrayNumbers[i] == myNum){
                System.out.printf("Found with %d loops.", i+1);
                System.exit(0);
            }
        }
        System.out.println("Not found!");

    }
}