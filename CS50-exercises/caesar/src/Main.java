import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Caesar caesar = new Caesar();
        Scanner scan = new Scanner(System.in);
        boolean menuLoop = true;
        int key = 0;

        while (menuLoop){
            int option = 0;
            String text = "";
            System.out.println("""
                    1 - Encrypt a text
                    2 - Decrypt the text
                    3 - quit
                    """);
            System.out.print("Select: ");
            option = scan.nextInt();
            scan.nextLine();

            switch (option){
                case 1:
                    System.out.print("Enter a text: ");
                    text = scan.nextLine();
                    System.out.print("Enter a key: ");
                    key = scan.nextInt();
                    String encrypted = caesar.encrypt(text, key);
                    System.out.println("\n" + "Encrypted text: " + encrypted + "\n");
                    break;

                case 2:
                    String textToDecrypt = "";
                    System.out.print("Text: ");
                    textToDecrypt = scan.nextLine();
                    System.out.print("Key: ");
                    key = scan.nextInt();
                    System.out.println("\n" + "Decrypted text: " + caesar.decrypt(textToDecrypt, key) + "\n");
                     break;

                case 3:
                    System.out.println("Exiting...");
                    menuLoop = false;
                    break;

                default:
                    System.out.println("Invalid option");

            }
        }
        scan.close();
    }
}
