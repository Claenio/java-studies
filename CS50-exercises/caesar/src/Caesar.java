public class Caesar {
    int key = 2;
    String text = "Hello!";
    char[] textArray = text.toCharArray();

    public String Encypher(){
        int textArrayCode = 0;
        for (int i = 0; i < textArray.length; i++) {
            if (Character.isLetter(textArray[i])) {
                textArrayCode = (int)textArray[i];
                textArray[i] = (char)(textArrayCode + key);
                //System.out.println(textArray[i]);
            }
        }
        //System.out.println(textArray);
        String str = new String(textArray);
        return str;
    }
    public void Decypher(){
        for (int i = 0; i < textArray.length; i++) {
            int textArrayCode = textArray[i] - key;
            textArray[i] = (char)textArrayCode;
        }
        System.out.println(textArray);
    }

}
