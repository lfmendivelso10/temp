package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Luis Gaviria
 * Test del modelo Canciones
 */
public class CancionesTest {
    private final static String NOMBRE = "prueba@usuario.com";
    private final static String DESCRIPCION = "prueba";
    private final static String URL = "123456";
    private final static Usuario ARTISTA = UsuarioTest.usuarioStub();

    private Canciones cancionesStub(){
        return new Canciones(ARTISTA, NOMBRE, DESCRIPCION, URL);
    }

    @Test
    public void probarObjetos(){
        Canciones c = cancionesStub();

        assertEquals("El artista no coincide", c.getUser(), ARTISTA);
        assertEquals("El nombre no coincide", c.getNombre(), NOMBRE);
        assertEquals("La descripcion no coincide", c.getDescripcion(), DESCRIPCION);
        assertEquals("La url no coincide", c.getUrlCancion(), URL);

        c.setUser(null);

        assertNotEquals("El valor no corresponde al actualizado", c.getUser(), ARTISTA);
    }
}
