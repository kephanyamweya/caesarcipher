import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarCipherTest {
    @Test
    public void testEncodeWithKey2() {
        int Key = 2;
        String plainText = "hi";
        String expectedResultMessage = "jk";
        String actualResultMessage = CaesarCipher.encoding(plainText, Key);

        assertEquals(expectedResultMessage, actualResultMessage);
    }

    @Test
    public void testEncodeWithKey13() {
        int Key = 13;
        String plainText = "lookinggood";
        String expectedResultMessage = "ybbxvattbbq";
        String actualResultMessage = CaesarCipher.encoding(plainText, Key);

        assertEquals(expectedResultMessage, actualResultMessage);
    }




    @Test
    public void testDecodeWithKey2() {
        int Key = 2;
        String cipherText= "hello";
        String expectedResultMessage = "fcjjm";
        String actualResultMessage = CaesarCipher.decoding(cipherText,Key);

        assertEquals(expectedResultMessage, actualResultMessage);
    }


}