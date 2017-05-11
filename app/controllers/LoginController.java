package controllers;


import models.Usuario;
import org.mindrot.jbcrypt.BCrypt;
import play.data.*;
import play.mvc.*;

/**
 * @author Luis Gaviria
 * Clase para controlar las sesiones de usuario
 */
public class LoginController extends Controller {

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
     * Función para realizar el inicio de sesión
     * @return Redirecciona a la vista principal
     */
    public Result login() {
        DynamicForm form = formFactory.form().bindFromRequest();

        String email = form.get("email");
        String password = form.get("password");

        Usuario user = Usuario.find.where().eq("email", email).findUnique();
        if (user != null && BCrypt.checkpw(password, user.paswd)) {

            // email/password OK, so now we set the session variable and only go to authenticated pages.
            session().clear();
            session("idUser", String.valueOf(user.id));
            session("email", user.email);
            session("nombre", user.nombre);
            session("isArtist", String.valueOf(user.isArtist));

            return redirect("/");
            //return ok("Resultado: " + email + "," + password);
        } else {
            return ok("Error");
        }
    }

    /**
     * Función para cerrar la sesión de usuario
     * @return Redirecciona a la vista principal
     */
    public Result logout() {
        session().clear();
        return redirect("/");
    }

}
