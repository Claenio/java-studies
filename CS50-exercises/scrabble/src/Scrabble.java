public class Scrabble {

    int[] points = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
    String input = "Java?";
    String word = input.toLowerCase();
    private char[] wordArray = word.toCharArray();
    int sum = 0;

    public int calculate() {
        for (int i = 0; i <= wordArray.length; i++) {
            int wordArrayIndex = wordArray[i] - 'a';
            if (wordArrayIndex >= 26 || wordArrayIndex < 0) {
                wordArrayIndex = 0;
            } else {
                sum += points[wordArrayIndex];
            }
        }
        return sum;
    }



}
