import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

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

    public String encrypt(String mensaje) throws NoSuchPaddingException, NoSuchAlgorithmException,
            InvalidKeyException, IllegalBlockSizeException, BadPaddingException {

        // Pasamos el mensaje a array de bytes
        byte[] mensajeEnBytes = mensaje.getBytes();

        /*
        Crea una instancia de Cipher para realizar operaciones de cifrado y descifrado
        usando el algoritmo AES (Advanced Encryption Standard)
        */
        Cipher encriptacionCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");

        /*
        Inicializo encriptacionCipher con el modo de encriptación y la clave secreta
         */
        encriptacionCipher.init(Cipher.ENCRYPT_MODE, claveSecreta);

        /*
        Encriptamos el mensaje
         */
        byte[] mensajeEncriptadoBytes = encriptacionCipher.doFinal(mensajeEnBytes);

    }


}
