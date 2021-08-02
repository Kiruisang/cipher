package encryptions;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;


public class encryptTest {
    @Test
    public  void encrypt_onlyString_exception() throws Exception {
        //arrange
        encrypt encrypt = new encrypt();

        //act
        String actual = encrypt.encoding("1",1);

        //assert
        assertTrue(actual instanceof String);

    }

    @Test
    public  void  encrypt_notNull_Exception() throws Exception {
        encrypt encrypt = new encrypt();
        String  actual = encrypt.encoding("AB",1);
        assertNotNull(actual);
    }

    @Test
    public void  encrypt_encryptText_string() throws Exception {
        encrypt encrypt = new encrypt();
        String  actual = encrypt.encoding("AB",1);
        assertEquals("BC",actual);
    }

    @Test
    public void  encrypt_boundaryLength_exception(){
        try {
            encrypt encrypt = new encrypt();
            String actual = encrypt.encoding("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG",27);

        }catch (Exception ex){
            assertEquals("The key must be between 1 and 25",ex.getMessage());
        }

    }
}
