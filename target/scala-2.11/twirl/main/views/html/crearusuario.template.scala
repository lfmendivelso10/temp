
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object crearusuario_Scope0 {
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

class crearusuario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""


"""),_display_(/*4.2*/main("Crear un nuevo usuario")/*4.32*/ {_display_(Seq[Any](format.raw/*4.34*/("""
"""),format.raw/*5.1*/("""<h1 class="well">Crear usuario</h1>
<div class="content">
<div class="row" align="center">

<form id="formcreausu" name="formcreausu" method="post" action="/crearusuario" data-parsley-validate class="form-horizontal form-label-left">

    <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="username">Nombre <span class="required">*</span>
                        </label>
        <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" id="username" name="username" required="required" class="form-control col-md-7 col-xs-12">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="email">E-mail <span class="required">*</span>
                        </label>
        <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="email" id="email" name="email" required="required" class="form-control col-md-7 col-xs-12">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="password">Contraseña <span class="required">*</span>
                        </label>
        <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="password" id="password" name="password" required="required" class="form-control col-md-7 col-xs-12">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12">Artista <span class="required">*</span>
                        </label>
        <div class="col-md-6 col-sm-6 col-xs-12">
            <select id="artista" name="artista" class="form-control col-md-7 col-xs-12">
                <option value="0" selected>NO</option>
                <option value="1">SI</option>                    
            </select>
        </div>
    </div>
    <div class="ln_solid"></div>
    <div class="form-group">
        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
            <button type="submit" class="btn btn-success">Crear cuenta</button>
        </div>
    </div>

</form>
</div>
</div>
""")))}),format.raw/*52.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object crearusuario extends crearusuario_Scope0.crearusuario
              /*
                  -- GENERATED --
                  DATE: Wed May 10 22:31:58 COT 2017
                  SOURCE: C:/Users/Luchitogaro/workspace/nocopyrightsounds/app/views/crearusuario.scala.html
                  HASH: 38edabc91aedd72bf84c4038a6d3cb1b5f224229
                  MATRIX: 752->1|848->3|880->10|918->40|957->42|985->44|3167->2196
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|83->52
                  -- GENERATED --
              */
          