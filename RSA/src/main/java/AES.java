import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AES {

    private SecretKey claveSecreta;

    public void init() {
        KeyGenerator generadorClaveSecreta =  KeyGenerator.getInstance("AES");
    }

}
