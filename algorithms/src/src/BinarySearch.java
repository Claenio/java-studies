public class BinarySearch {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int myNum = 3;
        int low = 0;
        int high = array.length - 1;

        while(high >= low){
            int middle = (low + high)/2;
            if(array[middle] == myNum){
                System.out.printf("Found number %d, at index %d.", myNum, middle);
                break;
            } else if(array[middle] < myNum){
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        if(low > high){
            System.out.println("Number not found!");
        }
    }
}
