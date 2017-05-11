
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Usuario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[Usuario]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),_display_(/*3.2*/main("NoCopyrightSounds")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""

"""),format.raw/*5.1*/("""<h2 class="well" align="center">Bienvenido a NoCopyrightSounds """),_display_(/*5.65*/session/*5.72*/.get("nombre")),format.raw/*5.86*/("""</h2>

<div class="content">
  """),_display_(/*8.4*/for(user <- users) yield /*8.22*/{_display_(Seq[Any](format.raw/*8.23*/("""
  """),format.raw/*9.3*/("""<div class="row">
    <table class="table table-hover">
      <tr>
        <td colspan="2" align="center">
          <h4><span> <b> Artista: """),_display_(/*13.36*/user/*13.40*/.nombre),format.raw/*13.47*/("""</b></span></h4>
        </td>
      </tr>
      """),_display_(/*16.8*/for(cancion <- user.getCanciones()) yield /*16.43*/ {_display_(Seq[Any](format.raw/*16.45*/("""
      """),format.raw/*17.7*/("""<tr>
          <td colspan="1">
            <p> <b>Nombre: </b> """),_display_(/*19.34*/cancion/*19.41*/.nombre),format.raw/*19.48*/("""</p>
            <br>
            <p style="text-align:justify;"> <b>Descripción: </b> """),_display_(/*21.67*/cancion/*21.74*/.descripcion),format.raw/*21.86*/("""</p>
            <br>
            <p style="text-align:justify;"> <b>Calificación: </b> <h4>5/5</h4> </p>
          </td>
          <td colspan="1">
            <iframe width="250" height="150"
                    src=""""),_display_(/*27.27*/cancion/*27.34*/.urlEmbebed()),format.raw/*27.47*/("""">
            </iframe>
          </td>
      </tr>
      """)))}),format.raw/*31.8*/("""
    """),format.raw/*32.5*/("""</table>
  </div>
  """)))}),format.raw/*34.4*/("""
"""),format.raw/*35.1*/("""</div>
""")))}),format.raw/*36.2*/("""
"""))
      }
    }
  }

  def render(users:List[Usuario]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((List[Usuario]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu May 11 00:34:29 COT 2017
                  SOURCE: C:/Users/Luchitogaro/workspace/nocopyrightsounds/app/views/index.scala.html
                  HASH: 277d705e35e78f09be2ad03207747ec1c702685c
                  MATRIX: 752->1|869->23|897->26|930->51|969->53|997->55|1087->119|1102->126|1136->140|1193->172|1226->190|1264->191|1293->194|1462->336|1475->340|1503->347|1579->397|1630->432|1670->434|1704->441|1796->506|1812->513|1840->520|1955->608|1971->615|2004->627|2251->847|2267->854|2301->867|2391->927|2423->932|2474->953|2502->954|2540->962
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|39->8|39->8|39->8|40->9|44->13|44->13|44->13|47->16|47->16|47->16|48->17|50->19|50->19|50->19|52->21|52->21|52->21|58->27|58->27|58->27|62->31|63->32|65->34|66->35|67->36
                  -- GENERATED --
              */
          