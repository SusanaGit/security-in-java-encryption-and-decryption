import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class AES {

    private SecretKey claveSecreta;

    public void init() throws NoSuchAlgorithmException {
        KeyGenerator generadorClaveSecreta =  KeyGenerator.getInstance("AES");

        /*
        El tamaño de las claves secretas generadas por el objeto de KeyGenerator
        puede ser de 128, 192 o 256
         */
        int KEY_SIZE = 128;
        generadorClaveSecreta.init(KEY_SIZE);
    }

}
