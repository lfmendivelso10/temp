
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object perfil_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class perfil extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Usuario,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: Usuario):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""


"""),_display_(/*4.2*/main("Perfil de artista")/*4.27*/ {_display_(Seq[Any](format.raw/*4.29*/("""
"""),format.raw/*5.1*/("""<div class="content">
<div class="row" align="center">

    <h1 class="well"> Perfil</h1>

    <form id="formperfil" name="formperfil" method="post" action="/modPerfil" data-parsley-validate class="form-horizontal form-label-left">

        <div class="form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="username">Nombre <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
                <input type="hidden" id="idUser" name="idUser" required="required" class="form-control col-md-7 col-xs-12" value=""""),_display_(/*16.132*/user/*16.136*/.id),format.raw/*16.139*/("""">
                <input type="text" id="username" name="username" required="required" class="form-control col-md-7 col-xs-12" value=""""),_display_(/*17.134*/user/*17.138*/.nombre),format.raw/*17.145*/("""">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="email">E-mail</label>
            <div class="col-md-6 col-sm-6 col-xs-12">
                <input type="email" id="email" name="email" class="form-control col-md-7 col-xs-12" value=""""),_display_(/*23.109*/user/*23.113*/.email),format.raw/*23.119*/("""" readOnly>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12">Artista</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
                <input type="text" id="artista" name="artista" class="form-control col-md-7 col-xs-12" value=""""),_display_(/*30.112*/user/*30.116*/.isArtistSt()),format.raw/*30.129*/("""" readOnly>
            </div>
        </div>
        <div class="ln_solid"></div>
        <div class="form-group">
            <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                <a href="/cancPerfil/"""),_display_(/*36.39*/user/*36.43*/.id),format.raw/*36.46*/("""" class="btn btn-warning">Canciones</a>
                <button type="submit" name="modificar" id="modificar" class="btn btn-primary">Modificar</button>
                <a href="/delPerfil/"""),_display_(/*38.38*/user/*38.42*/.id),format.raw/*38.45*/("""" class="btn btn-danger">Eliminar</a>
            </div>
        </div>

    </form>


</div>
</div>
""")))}),format.raw/*47.2*/("""
"""))
      }
    }
  }

  def render(user:Usuario): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((Usuario) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object perfil extends perfil_Scope0.perfil
              /*
                  -- GENERATED --
                  DATE: Wed May 10 22:31:59 COT 2017
                  SOURCE: C:/Users/Luchitogaro/workspace/nocopyrightsounds/app/views/perfil.scala.html
                  HASH: 1c37f1d3e5690be6f242be7caf2cf614ecce2960
                  MATRIX: 748->1|858->16|890->23|923->48|962->50|990->52|1624->658|1638->662|1663->665|1828->802|1842->806|1871->813|2233->1147|2247->1151|2275->1157|2659->1513|2673->1517|2708->1530|2965->1760|2978->1764|3002->1767|3221->1959|3234->1963|3258->1966|3399->2077
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|47->16|47->16|47->16|48->17|48->17|48->17|54->23|54->23|54->23|61->30|61->30|61->30|67->36|67->36|67->36|69->38|69->38|69->38|78->47
                  -- GENERATED --
              */
          