package controllers;


import models.Canciones;
import models.Usuario;
import org.mindrot.jbcrypt.BCrypt;
import play.data.*;
import play.mvc.*;

/**
 * @author Luis Gaviria
 * Clase para controlar las acciones de los usuarios
 */
public class UsuariosController extends Controller {

    /**
     * Atributo para controlar los formularios dinámicamente
     */
    public DynamicForm formFactory;
	
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.crearusuario.render());
    }

    /**
     * Función para agregar Usuarios
     * @return Redirecciona a la vista principal
     */
    public Result addUser() {
        DynamicForm form = formFactory.form().bindFromRequest();

        String nombre = form.get("username");
        String email = form.get("email");
        String password = BCrypt.hashpw(form.get("password"), BCrypt.gensalt());
        int auxArtist = Integer.parseInt(form.get("artista"));
        boolean artista;
        if (auxArtist == 0){
            artista = false;
        }else{
            artista = true;
        }

        Usuario usu = new Usuario(email, password, nombre, artista );

        try{
            usu.save();
            session().clear();
            session("idUser", String.valueOf(usu.id));
            session("email", usu.email);
            session("nombre", usu.nombre);
            session("isArtist", String.valueOf(usu.isArtist));

            return redirect("/");
        }catch (Exception e){
            return ok("Error en el guardado de información " + e);
        }
    }

    /**
     * Función para cargar la vista del perfil del usuario
     * @return Carga la vista del perfil del usuario
     */
    public  Result perfilUsua(){

        if(session().get("isArtist") != null && session().get("isArtist").equals("true")) {

            int idUsua = Integer.parseInt(session().get("idUser"));
            Usuario user = Usuario.find.where().eq("id", idUsua).findUnique();

            return ok(views.html.perfil.render(user));
        }else{
            return redirect("/");
        }

    }

    /**
     * Modificar el perfil de un usuario
     * @return Redirecciona a la vista del perfil del usuario
     */
    public Result modPerfil() {
        DynamicForm form = formFactory.form().bindFromRequest();

        Long idUser = Long.parseLong(form.get("idUser"));
        String nombre = form.get("username");

        try{
            Usuario usuarioSave = Usuario.find.byId(idUser);

            if (usuarioSave != null) {
                usuarioSave.setNombre(nombre);
                usuarioSave.update();
                session("nombre", nombre);
            }
            return redirect("/perfil");

        }catch (Exception e){
            return ok("Error en el guardado de información " + e);
        }
    }

    /**
     * Eliminar el perfil del usuario
     * @param id Identificador del Usuario que se va a eliminar
     * @return Redirecciona a la vista principal
     */
    public Result delPerfil(Long id){
        Usuario usuarioSave = Usuario.find.byId(id);
        try {
            usuarioSave.delete();
            session().clear();
            redirect("/");
        }catch (Exception e){
            return  redirect("/perfil");
        }
        return redirect("/perfil");
    }

    /**
     * Cargar la vista de las canciones del artista
     * @param id Identificador del artista
     * @return Carga la vista de las canciones que tiene creadas el usuario
     */
    public Result cancPerfil(Long id){

        Usuario user = Usuario.find.byId(id);

        return ok(views.html.canciones.render(user));
    }

    /**
     * Eliminar una canción de un usuario específico
     * @param id Identificador de la canción que se desea eliminar
     * @return Carga la vista con las canciones del usuario
     */
    public Result delCancion(Long id){
        Canciones canTmp = Canciones.find.byId(id);
        try {
            Usuario usuarioSave = canTmp.getUser();
            canTmp.delete();
            return ok(views.html.canciones.render(usuarioSave));
        }catch (Exception e){
            return  ok("Error en la eliminación " + e);
        }
    }

    /**
     * Agregar una canción para el artista
     * @return Carga la vista con las canciones del usuario
     */
    public Result addCancion() {
        DynamicForm form = formFactory.form().bindFromRequest();

        Long idUser = Long.parseLong(form.get("idUser"));
        String nombre = form.get("nombre");
        String descripcion = form.get("descripcion");
        String url = form.get("url");

        try{
            Usuario usuarioSave = Usuario.find.byId(idUser);

            if (usuarioSave != null) {
                Canciones can = new Canciones(usuarioSave, nombre, descripcion, url);
                can.save();
            }
            return ok(views.html.canciones.render(usuarioSave));

        }catch (Exception e){
            return ok("Error en el guardado de información " + e);
        }
    }
}
