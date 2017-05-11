
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object canciones_Scope0 {
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

class canciones extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Usuario,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: Usuario):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""


"""),_display_(/*4.2*/main("Crear un nuevo usuario")/*4.32*/ {_display_(Seq[Any](format.raw/*4.34*/("""
"""),format.raw/*5.1*/("""<div class="x_title">
    <h2 class="well">Canciones <small>Crear canción</small></h2>
    <div class="clearfix"></div>
</div>
<div class="content">
<div class="row" align="center">

<form id="formcancion" name="formcancion" method="post" action="/addCancion" data-parsley-validate class="form-horizontal form-label-left">

    <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="username">Nombre <span class="required">*</span>
                        </label>
        <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="hidden" id="idUser" name="idUser" value=""""),_display_(/*18.68*/user/*18.72*/.id),format.raw/*18.75*/("""" class="form-control col-md-7 col-xs-12">
            <input type="text" id="nombre" name="nombre" required="required" class="form-control col-md-7 col-xs-12">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="descripcion">Descripcion <span class="required">*</span>
                        </label>
        <div class="col-md-6 col-sm-6 col-xs-12">
            <textarea id="descripcion" name="descripcion" required="required" rows="5" class="form-control col-md-7 col-xs-12"></textarea>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="url">URL Canción <span class="required">*</span>
                        </label>
        <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" id="url" name="url" required="required" class="form-control col-md-7 col-xs-12">
        </div>
    </div>

    <div class="ln_solid"></div>
    <div class="form-group">
        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
            <button type="submit" class="btn btn-success">Agregar</button>
        </div>
    </div>

</form>
</div>
</div>
<br>
<br>
<div class="content">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel">
                <div class="x_title">
                    <h2 class="well">Canciones <small>Relación de sus canciones</small></h2>
                    <div class="clearfix"></div>
                </div>
                <div class="x_content">
                    <table class="table table-hover">
                        <thead>
                        <tr>
                            <th>Nombre</th>
                            <th>Descripción</th>
                            <th>URL canción</th>
                            <th>Acciones</th>
                        </tr>
                        </thead>
                        <tbody>
                            """),_display_(/*67.30*/for(cancion <- user.getCanciones()) yield /*67.65*/ {_display_(Seq[Any](format.raw/*67.67*/("""
                            """),format.raw/*68.29*/("""<tr>
                                <td>
                                    """),_display_(/*70.38*/cancion/*70.45*/.nombre),format.raw/*70.52*/("""
                                """),format.raw/*71.33*/("""</td>
                                <td>
                                    """),_display_(/*73.38*/cancion/*73.45*/.descripcion),format.raw/*73.57*/("""
                                """),format.raw/*74.33*/("""</td>
                                <td>
                                    """),_display_(/*76.38*/cancion/*76.45*/.urlCancion),format.raw/*76.56*/("""
                                """),format.raw/*77.33*/("""</td>
                                <td>
                                    <a href="/delCancion/"""),_display_(/*79.59*/cancion/*79.66*/.id),format.raw/*79.69*/("""" title="Eliminar"><i class="fa fa-times fa-2x"></i></a>
                                </td>
                            </tr>
                            """)))}),format.raw/*82.30*/("""
                        """),format.raw/*83.25*/("""</tbody>
                    </table>

                </div>
            </div>
        </div>

</div>
""")))}),format.raw/*91.2*/("""
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
object canciones extends canciones_Scope0.canciones
              /*
                  -- GENERATED --
                  DATE: Thu May 11 00:33:31 COT 2017
                  SOURCE: C:/Users/Luchitogaro/workspace/nocopyrightsounds/app/views/canciones.scala.html
                  HASH: f87086f3ad5943ab20d7bd5dbe2d0da3bc56ad5b
                  MATRIX: 754->1|864->16|896->23|934->53|973->55|1001->57|1663->692|1676->696|1700->699|3777->2749|3828->2784|3868->2786|3926->2816|4034->2897|4050->2904|4078->2911|4140->2945|4249->3027|4265->3034|4298->3046|4360->3080|4469->3162|4485->3169|4517->3180|4579->3214|4709->3317|4725->3324|4749->3327|4941->3488|4995->3514|5138->3627
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|49->18|49->18|49->18|98->67|98->67|98->67|99->68|101->70|101->70|101->70|102->71|104->73|104->73|104->73|105->74|107->76|107->76|107->76|108->77|110->79|110->79|110->79|113->82|114->83|122->91
                  -- GENERATED --
              */
          