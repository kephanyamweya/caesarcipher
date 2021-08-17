import java.util.Scanner;

public class CaesarCipher {

   private static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encoding(String plainText, int Key) {
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++) {
            int charIndex = alphabet.indexOf(plainText.charAt(i)); //to know the index of the alphabets
            int newIndex = (charIndex + Key) % 26;
            char cipherCharacter = alphabet.charAt(newIndex); //character is at index what
            cipherText = cipherText + cipherCharacter;
        }
        return cipherText;

    }

    public static String decoding(String cipherText, int Key) {
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++) {
            int charIndex = alphabet.indexOf(cipherText.charAt(i));
            int newIndex = (charIndex - Key) % 26;
            if (newIndex < 0) { // to avoid negative index
                newIndex = alphabet.length() + newIndex;
            }
            char plainCharacter = alphabet.charAt(newIndex);
            plainText = plainText + plainCharacter;
        }
        return plainText;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Text --");
        String plain = scan.nextLine();

        System.out.print("Enter key --");
        int Key = scan.nextInt();

        String cipherText = encoding(plain,Key);

        System.out.println("The cipher text: " + cipherText);

        System.out.println("The decoded message is: "+ decoding(cipherText, Key));
    }
}
