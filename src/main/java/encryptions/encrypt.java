package encryptions;

public class encrypt {
    private String encrypted = "";

    public String encoding(String plainText, int key) throws Exception {
        int n = plainText.length();

        if(key < 1 || key > 25) throw new Exception("The key must be between 1 and 25");

        for(int i=0;i<n;i++){
            char letter = plainText.charAt(i);
            if(Character.isLetter(letter)) {
                if (Character.isUpperCase(letter)) {
                    char r = (char) (letter + key);
                    if (r > 'Z') {
                        encrypted += (char) (letter - (26 - key));
                    } else {
                        encrypted += r;
                    }
                } else if (Character.isLowerCase(letter)) {
                    char r = (char) (letter + key);
                    if (r > 'z') {
                        encrypted += (char) (letter - (26 - key));
                    } else {
                        encrypted += r;
                    }
                }

            }else {
                encrypted += letter;
            }
        }

        return  encrypted;

    }

    public String getEncrypted() {
        return encrypted;
    }
}
