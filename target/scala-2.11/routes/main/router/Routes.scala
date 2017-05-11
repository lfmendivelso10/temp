
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Luchitogaro/workspace/nocopyrightsounds/conf/routes
// @DATE:Wed May 10 23:27:36 COT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  UsuariosController_3: controllers.UsuariosController,
  // @LINE:13
  LoginController_2: controllers.LoginController,
  // @LINE:28
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    UsuariosController_3: controllers.UsuariosController,
    // @LINE:13
    LoginController_2: controllers.LoginController,
    // @LINE:28
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, UsuariosController_3, LoginController_2, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, UsuariosController_3, LoginController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """crearusuario""", """controllers.UsuariosController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """crearusuario""", """controllers.UsuariosController.addUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """perfil""", """controllers.UsuariosController.perfilUsua()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cancPerfil/""" + "$" + """id<[^/]+>""", """controllers.UsuariosController.cancPerfil(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delPerfil/""" + "$" + """id<[^/]+>""", """controllers.UsuariosController.delPerfil(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modPerfil""", """controllers.UsuariosController.modPerfil()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addCancion""", """controllers.UsuariosController.addCancion()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delCancion/""" + "$" + """id<[^/]+>""", """controllers.UsuariosController.delCancion(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UsuariosController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("crearusuario")))
  )
  private[this] lazy val controllers_UsuariosController_index1_invoker = createInvoker(
    UsuariosController_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosController",
      "index",
      Nil,
      "GET",
      """ Usuarios""",
      this.prefix + """crearusuario"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UsuariosController_addUser2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("crearusuario")))
  )
  private[this] lazy val controllers_UsuariosController_addUser2_invoker = createInvoker(
    UsuariosController_3.addUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosController",
      "addUser",
      Nil,
      "POST",
      """""",
      this.prefix + """crearusuario"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_LoginController_login3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login3_invoker = createInvoker(
    LoginController_2.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "POST",
      """ Sesion""",
      this.prefix + """login"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_LoginController_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout4_invoker = createInvoker(
    LoginController_2.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UsuariosController_perfilUsua5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("perfil")))
  )
  private[this] lazy val controllers_UsuariosController_perfilUsua5_invoker = createInvoker(
    UsuariosController_3.perfilUsua(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosController",
      "perfilUsua",
      Nil,
      "GET",
      """ Perfiles""",
      this.prefix + """perfil"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UsuariosController_cancPerfil6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cancPerfil/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuariosController_cancPerfil6_invoker = createInvoker(
    UsuariosController_3.cancPerfil(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosController",
      "cancPerfil",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """cancPerfil/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UsuariosController_delPerfil7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delPerfil/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuariosController_delPerfil7_invoker = createInvoker(
    UsuariosController_3.delPerfil(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosController",
      "delPerfil",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """delPerfil/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UsuariosController_modPerfil8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modPerfil")))
  )
  private[this] lazy val controllers_UsuariosController_modPerfil8_invoker = createInvoker(
    UsuariosController_3.modPerfil(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosController",
      "modPerfil",
      Nil,
      "POST",
      """""",
      this.prefix + """modPerfil"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_UsuariosController_addCancion9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addCancion")))
  )
  private[this] lazy val controllers_UsuariosController_addCancion9_invoker = createInvoker(
    UsuariosController_3.addCancion(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosController",
      "addCancion",
      Nil,
      "POST",
      """ Canciones""",
      this.prefix + """addCancion"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_UsuariosController_delCancion10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delCancion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuariosController_delCancion10_invoker = createInvoker(
    UsuariosController_3.delCancion(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosController",
      "delCancion",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """delCancion/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:9
    case controllers_UsuariosController_index1_route(params) =>
      call { 
        controllers_UsuariosController_index1_invoker.call(UsuariosController_3.index())
      }
  
    // @LINE:10
    case controllers_UsuariosController_addUser2_route(params) =>
      call { 
        controllers_UsuariosController_addUser2_invoker.call(UsuariosController_3.addUser())
      }
  
    // @LINE:13
    case controllers_LoginController_login3_route(params) =>
      call { 
        controllers_LoginController_login3_invoker.call(LoginController_2.login())
      }
  
    // @LINE:14
    case controllers_LoginController_logout4_route(params) =>
      call { 
        controllers_LoginController_logout4_invoker.call(LoginController_2.logout())
      }
  
    // @LINE:17
    case controllers_UsuariosController_perfilUsua5_route(params) =>
      call { 
        controllers_UsuariosController_perfilUsua5_invoker.call(UsuariosController_3.perfilUsua())
      }
  
    // @LINE:18
    case controllers_UsuariosController_cancPerfil6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuariosController_cancPerfil6_invoker.call(UsuariosController_3.cancPerfil(id))
      }
  
    // @LINE:19
    case controllers_UsuariosController_delPerfil7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuariosController_delPerfil7_invoker.call(UsuariosController_3.delPerfil(id))
      }
  
    // @LINE:20
    case controllers_UsuariosController_modPerfil8_route(params) =>
      call { 
        controllers_UsuariosController_modPerfil8_invoker.call(UsuariosController_3.modPerfil())
      }
  
    // @LINE:23
    case controllers_UsuariosController_addCancion9_route(params) =>
      call { 
        controllers_UsuariosController_addCancion9_invoker.call(UsuariosController_3.addCancion())
      }
  
    // @LINE:24
    case controllers_UsuariosController_delCancion10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuariosController_delCancion10_invoker.call(UsuariosController_3.delCancion(id))
      }
  
    // @LINE:28
    case controllers_Assets_versioned11_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
