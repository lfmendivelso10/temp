package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Luis Gaviria
 * Test del modelo Usuario
 */
public class UsuarioTest {

    private final static String EMAIL = "prueba@usuario.com";
    private final static String NOMBRE = "prueba";
    private final static String PASSWORD = "123456";
    private final static boolean ARTIST = true;

    public static Usuario usuarioStub(){
        return new Usuario(EMAIL, PASSWORD, NOMBRE, ARTIST);
    }

    @Test
    public void probarObjetos(){
        Usuario u = usuarioStub();

        assertEquals("El correo no coincide", u.getEmail(), EMAIL);
        assertEquals("La contrasenia no coincide", u.getPaswd(), PASSWORD);
        assertEquals("El nombre no coincide", u.getNombre(), NOMBRE);
        assertEquals("El campo artista no coincide", u.isArtist(), ARTIST);

        u.setNombre("otro");

        assertEquals("El valor no corresponde al actualizado", u.getNombre(), "otro");
    }
}
