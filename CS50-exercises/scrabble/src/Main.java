public class Main {
    public static void main(String[] args) {
        int[] points = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
        String word = "java";
        char[] wordArray = word.toCharArray();
        int sum = 0;

        for (int i = 0; i < wordArray.length; i++) {
            int wordArrayIndex = wordArray[i] - 'a';
            sum += points[wordArrayIndex];
        }
        System.out.println(sum);

    }
}
