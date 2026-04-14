import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] array = {7, 2, 5, 3, 1, 0};

        for(int i = 0; i < array.length; i++){
            int minNumberIndex = i;

            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[minNumberIndex]){
                    minNumberIndex = j;
                }
            }

            int tempNumber = array[i];
            array[i] = array[minNumberIndex];
            array[minNumberIndex] = tempNumber;
        }
        System.out.println(Arrays.toString(array));

    }
}
