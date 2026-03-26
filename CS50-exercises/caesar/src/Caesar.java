public class Caesar {
    int key = 2;
    String text = "Hello!";
    char[] textArray = text.toCharArray();

    public void Encypher(){
        for (int i = 0; i < textArray.length; i++) {
            int textArrayCode = textArray[i] + key;
            textArray[i] = (char)textArrayCode;
        }
        System.out.println(textArray);
    }
    public void Decypher(){
        for (int i = 0; i < textArray.length; i++) {
            int textArrayCode = textArray[i] - key;
            textArray[i] = (char)textArrayCode;
        }
        System.out.println(textArray);
    }

}
