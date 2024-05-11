import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
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

        claveSecreta = generadorClaveSecreta.generateKey();
    }

    public String encrypt(String mensaje) throws NoSuchPaddingException, NoSuchAlgorithmException {

        // Pasamos el mensaje a array de bytes
        byte[] mensajeEnBytes = mensaje.getBytes();

        /* Crea una instancia de Cipher para realizar operaciones de cifrado y descifrado
        usando el algoritmo AES (Advanced Encryption Standard)
        */
        Cipher encriptacionCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");

    }

}
