package models;

import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.validation.*;

/**
 * @author Luis Gaviria
 * Clase para mapear la entidad Canciones
 */
@Entity
@Table(name="Canciones") 
public class Canciones extends Model {

    /**
     * Identificador de la entidad
     */
    @Id
    @GeneratedValue
    public int id;

    /**
     * Usuario al que pertenecen las canciones
     */
    @ManyToOne
    public Usuario user;

    /**
     * Nombre del usuario
     */
    public String nombre;

    /**
     * Descripción general de la canción
     */
    public String descripcion;

    /**
     * URL para cargar la canción
     */
    public String urlCancion;

    public static Finder<Long, Canciones> find = new Finder<Long,Canciones>(Canciones.class);

    /**
     * Constructor de la clase
     * @param user Usuario de las canciones
     * @param nombre nombre de la cancion
     * @param descripcion descripción general de la canción
     * @param urlCancion URL de la canción para cargar
     */
    public Canciones(Usuario user, String nombre, String descripcion, String urlCancion) {
        this.user = user;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlCancion = urlCancion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlCancion() {
        return urlCancion;
    }

    public void setUrlCancion(String urlCancion) {
        this.urlCancion = urlCancion;
    }

    public static Finder<Long, Canciones> getFind() {
        return find;
    }

    public static void setFind(Finder<Long, Canciones> find) {
        Canciones.find = find;
    }

    /**
     * Reemplaza parte de la URL de la canción para que se pueda observar como contenido embebido
     * @return String con la URL convertida
     */
    public String urlEmbebed(){
        return urlCancion.replace("watch?v=", "embed/");
    }
}
