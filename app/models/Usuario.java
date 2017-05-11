package models;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.validation.*;

/**
 * @author Luis Gaviria
 * Clase de representa al Usuario como entidad
 */
@Entity
@Table(name="Usuario") 
public class Usuario extends Model {

	/**
	 * Identificador de la entidad
	 */
    @Id
    @GeneratedValue
    public int id;

	/**
	 * Correo electrónico del usuario utilizado para el login
	 */
	@Constraints.Required
    public String email;

	/**
	 * Contraseña del usuario
	 */
	public String paswd;

	/**
	 * Nombre del artista y/o usuario
	 */
	public String nombre;

	/**
	 * Define si el usuario es artista o no
	 */
	public boolean isArtist;

    public static Finder<Long, Usuario> find = new Finder<Long,Usuario>(Usuario.class);

	/**
	 * Canciones asociadas al artista
	 */
	@OneToMany(mappedBy = "user", cascade=CascadeType.ALL)
    public List<Canciones> canciones = new ArrayList<Canciones>();

	public static Finder<Long, Usuario> getFind() {
		return find;
	}

	public static void setFind(Finder<Long, Usuario> find) {
		Usuario.find = find;
	}

	public List<Canciones> getCanciones() {
		return canciones;
	}

	public void setCanciones(List<Canciones> canciones) {
		this.canciones = canciones;
	}

	/**
	 * Contructor de la clase Usuario
	 * @param email Correo electrónico
	 * @param paswd Contraseña del usuario
	 * @param nombre Nombre del Usuario
	 * @param isArtist True si es artista, False si no es artista
	 */
	public Usuario(String email, String paswd, String nombre, boolean isArtist) {
		super();
		this.email = email;
		this.paswd = paswd;
		this.nombre = nombre;
		this.isArtist = isArtist;
	}

	/**
	 * Retorna el string representativo de los valores true y false
	 * @return String(SI ó NO)
	 */
	public String isArtistSt(){
		if (isArtist == true){
			return "SI";
		}else{
			return "NO";
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPaswd() {
		return paswd;
	}

	public void setPaswd(String paswd) {
		this.paswd = paswd;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isArtist() {
		return isArtist;
	}

	public void setArtist(boolean isArtist) {
		this.isArtist = isArtist;
	}
    
    
}
