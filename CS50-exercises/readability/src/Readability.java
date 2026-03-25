public class Readability {
    private String text;
    private char[] textArray;
    private int letters, words, sentences;

    public void setText(String text){
        this.text = text;
        this.textArray = text.toCharArray();
    }

    public void calculate(){
        this.letters = 0;
        this.words = 1;
        for (int i = 0; i < textArray.length; i++){
            int asciiLetter = textArray[i];
            if (Character.isLetter(textArray[i])){
                letters++;
            }else if(asciiLetter == ' '){
                words++;
            }else if(asciiLetter == '.' || asciiLetter == '!' || asciiLetter == '?'){
                sentences++;
            }else {
                letters += 0;
            }
        }
    }

    public int getIndex(){
        double l = ((double)letters / words) * 100;
        double s = ((double)sentences / words) * 100;
        double result = (0.0588 * l) - (0.296 * s) - 15.8;
        return (int)Math.round(result);
    }

    public void printGrade(){
        if (getIndex() <= 1){
            System.out.println("Before the grade 1.");
        } else if (getIndex() >= 16) {
            System.out.println("Grade 16+.");
        } else {
            System.out.printf("Grade: %d.", (int)getIndex());
        }
    }


}