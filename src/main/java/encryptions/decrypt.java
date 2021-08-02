package encryptions;

public class decrypt {
    private String decrypted="";
    private String encrypted;
    private int key;

    public decrypt(String encrypted, int key){
        this.encrypted = encrypted;
        this.key = key;
    }

    public void Decode() throws Exception {
        if(key < 1 || key > 25) throw new Exception("The key must be between 1 and 25");
        int n = encrypted.length();

        for (int i=0;i<n;i++){
            char letter = encrypted.charAt(i);
            if(Character.isLetter(letter)){
                if (Character.isUpperCase(letter)){
                    char r = (char)(letter - key);
                    if(r > 'Z'){
                        decrypted += (char)(letter-(26+key));
                    }else {
                        decrypted += r;
                    }
                }else if(Character.isLowerCase(letter)){
                    char r = (char)(letter-key);
                    if(letter > 'z'){
                        decrypted+= (char)(letter-(26+key));
                    }else {
                        decrypted+=r;
                    }
                }
            }else {
                decrypted+=letter;
            }

        }
    }

    public String getDecrypted() {
        return decrypted;
    }
}
