package encryptions;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;


public class decryptTest {
    @Test
    public  void  decrypt_notNull_Exception(){
        decrypt decrypt = new decrypt("ABCD",3);
        assertNotNull(decrypt);
    }

    @Test
    public  void  decrypt_onlyString_Exception(){
        decrypt decrypt = new decrypt("BC",1);
        decrypt.getDecrypted();
        assertTrue(decrypt.getDecrypted() instanceof String );
    }

    @Test
    public void  decrypt_boundaryLength_exception(){
        try {
            decrypt decrypt = new decrypt("THE QUICK BROWN FOX",30);
            decrypt.getDecrypted();

        }catch (Exception ex){
            assertEquals("The key must be between 1 and 25",ex.getMessage());
        }
    }

    @Test
    public  void decrypt_encryptedText_string() throws Exception {
        decrypt decrypt = new decrypt("BC",1);
        decrypt.Decode();
        String actual = decrypt.getDecrypted();
        String expected = "AB";

        assertEquals(expected,actual);

    }
}
