public class Caesar{

    public String encrypt(String text, int key){
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++){
            char letter = text.charAt(i);

            if (Character.isLetter(letter)){
                char base = Character.isUpperCase(letter) ? 'A' : 'a';

                int position = (letter - base + key) % 26;
                if (position < 0) {
                    position += 26;
                }
                result[i] = (char) (base + position);
            } else {
                result[i] = letter;
            }

        }
        return new String(result);
    }

    public String decrypt(String encryptedText, int key){
        return encrypt(encryptedText, - key);
    }


}