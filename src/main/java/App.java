import encryptions.encrypt;
import encryptions.decrypt;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args){
        System.out.println("This is a Caesar Cipher");

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter text to encrypt");
            String inputText = bufferedReader.readLine();
            System.out.println("Enter the shift key");
            String inputKey = bufferedReader.readLine();
            int key = Integer.parseInt(inputKey);

            if(key < 1 || key > 25){
                System.out.println("The key must be between 1 and 25");
            }else{
                encrypt encrypt = new encrypt();
                String encrypted = encrypt.encoding(inputText,key);
                System.out.println("Your encrypted text is: ");
                System.out.println(encrypted);

                System.out.println("Would you like to decrypt the text above? , [Y/N]");
                String choice = bufferedReader.readLine();

                if(choice.toLowerCase().equals("y")){
                    decrypt decrypt = new decrypt(encrypted,key);
                    decrypt.Decode();
                    String decrypted = decrypt.getDecrypted();

                    System.out.println("Your decrypted text is: ");
                    System.out.println(decrypted);
                    System.out.println();
                    System.out.println("Thank you for using our service!");
                }else if(choice.toLowerCase().equals("n")){
                    System.out.println("Thank you for using our service!");
                }else {
                    System.out.println("Please enter Y/N");
                }
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
