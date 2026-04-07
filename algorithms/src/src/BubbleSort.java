import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 4, 6, 0, 7};
        boolean control;

        for (int i = 0; i < array.length; i++) {
            control = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    control = false;
                }
            }
            if (control) {
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
