public class Scrabble {
    private int[] points = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
    private String input;
    private String word;
    private char[] wordArray;

    public void setInput(String input){
        this.input = input;
        this.word = input.toLowerCase();
        wordArray = word.toCharArray();
    }
    public String getInput(){
        return word;
    }

    public int calculate() {
        int sum = 0;
        for (int i = 0; i < wordArray.length; i++) {
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