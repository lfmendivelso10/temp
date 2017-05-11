
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /* * This template is called from the `index` template. This template * handles the rendering of the page header and body
tags. It takes * two arguments, a `String` for the title of the page and an `Html` * object to insert into the body of the
page. */
  def apply/*4.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.32*/("""

"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
    """),format.raw/*10.58*/("""
    """),format.raw/*11.5*/("""<meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script type="application/x-javascript">
        addEventListener("load", function() """),format.raw/*14.45*/("""{"""),format.raw/*14.46*/(""" """),format.raw/*14.47*/("""setTimeout(hideURLbar, 0); """),format.raw/*14.74*/("""}"""),format.raw/*14.75*/(""", false); function hideURLbar()"""),format.raw/*14.106*/("""{"""),format.raw/*14.107*/(""" """),format.raw/*14.108*/("""window.scrollTo(0,1); """),format.raw/*14.130*/("""}"""),format.raw/*14.131*/("""
    """),format.raw/*15.5*/("""</script>
    <title>"""),_display_(/*16.13*/title),format.raw/*16.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*17.50*/routes/*17.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*17.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*18.55*/routes/*18.61*/.Assets.versioned("images/favicon.png")),format.raw/*18.100*/("""">
    <!-- Bootstrap Core CSS -->
    <link href=""""),_display_(/*20.18*/routes/*20.24*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*20.70*/("""" rel='stylesheet' type='text/css' />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*22.18*/routes/*22.24*/.Assets.versioned("stylesheets/style.css")),format.raw/*22.66*/("""" rel='stylesheet' type='text/css' />
    <!-- Graph CSS -->
    <link href=""""),_display_(/*24.18*/routes/*24.24*/.Assets.versioned("stylesheets/font-awesome.css")),format.raw/*24.73*/("""" rel="stylesheet ">
    <!-- jQuery -->
    <!-- lined-icons -->
    <link rel="stylesheet " href=""""),_display_(/*27.36*/routes/*27.42*/.Assets.versioned("stylesheets/icon-font.css")),format.raw/*27.88*/("""" type='text/css' />
    <!-- //lined-icons -->
    <!-- Meters graphs -->
    <script src=""""),_display_(/*30.19*/routes/*30.25*/.Assets.versioned("javascripts/jquery-2.1.4.js")),format.raw/*30.73*/(""""></script>
</head>

<body class="sticky-header left-side-collapsed ">
    <section>
    <!-- left side start-->
    <div class="left-side sticky-left-side">

        <!--logo and iconic logo start-->
        <div class="logo">
            <h1><a href="/">NCS</a></h1>
        </div>
        <div class="logo-icon text-center">
            <a href="/">NC </a>
        </div>
        <!-- /w3l-agile -->
        <!--logo and iconic logo end-->
        <div class="left-side-inner">

            <!--sidebar nav start-->
            <ul class="nav nav-pills nav-stacked custom-nav">
                <li class="active"><a href="/"><i class="lnr lnr-home"></i><span>Home</span></a></li>
                <li><a href="#"><i class="camera"></i> <span>Radio</span></a></li>
                """),_display_(/*53.18*/if(session.get("isArtist") != null && session.get("isArtist").equals("true"))/*53.95*/{_display_(Seq[Any](format.raw/*53.96*/("""
                """),format.raw/*54.17*/("""<li><a href="/perfil"><i class="lnr lnr-users"></i> <span>Perfil</span></a></li>
                """)))}),format.raw/*55.18*/("""
            """),format.raw/*56.13*/("""</ul>
            <!--sidebar nav end-->
        </div>
    </div>
    <!-- /w3layouts-agile -->
    <!-- /w3l-agile -->
    <!-- signup -->
    <div class="modal fade" id="myModal5" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content modal-info">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                </div>
                <div class="modal-body modal-spa">
                    <div class="sign-grids">
                        <div class="sign">
                            <div class="sign-left">
                                <ul>
                                    <li><a class="fb" href="#"><i></i>Sign in with Facebook</a></li>
                                    <li><a class="goog" href="#"><i></i>Sign in with Google</a></li>
                                    <li><a class="linkin" href="#"><i></i>Sign in with Linkedin</a></li>
                                </ul>
                            </div>
                            <div class="sign-right">
                                <form action="#" method="post">

                                    <h3>Create your account </h3>
                                    <input type="text" value="Name" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*83.126*/("""{"""),format.raw/*83.127*/("""this.value = 'Name';"""),format.raw/*83.147*/("""}"""),format.raw/*83.148*/("""" required="">
                                    <input type="text" value="Mobile number" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*84.135*/("""{"""),format.raw/*84.136*/("""this.value = 'Mobile number';"""),format.raw/*84.165*/("""}"""),format.raw/*84.166*/(""""
                                        required="">
                                    <input type="text" value="Email id" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*86.130*/("""{"""),format.raw/*86.131*/("""this.value = 'Email id';"""),format.raw/*86.155*/("""}"""),format.raw/*86.156*/(""""
                                        required="">
                                    <input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*88.134*/("""{"""),format.raw/*88.135*/("""this.value = 'Password';"""),format.raw/*88.159*/("""}"""),format.raw/*88.160*/(""""
                                        required="">

                                    <input type="submit" value="CREATE ACCOUNT">
                                </form>
                            </div>
                            <div class="clearfix"></div>
                        </div>
                        <p>By logging in you agree to our <span>Terms and Conditions</span> and <span>Privacy Policy</span></p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- //signup -->
    <!-- /w3l-agile -->
    <!-- left side end-->
    <!-- main content start-->
    <div class="main-content">
        <!-- header-starts -->
        <div class="header-section">
            <!--toggle button start-->
            <a class="toggle-btn  menu-collapsed"><i class="fa fa-bars"></i></a>
            <!--toggle button end-->
            <!--notification menu start -->
            <div class="menu-right">
                <div class="profile_details">
                    <div class="col-md-4 serch-part">
                        <div id="sb-search" class="sb-search">
                            <form action="#" method="post">

                                <input class="sb-search-input" placeholder="Search" type="search" name="search" id="search">
                                <input class="sb-search-submit" type="submit" value="">
                                <span class="sb-icon-search"> </span>
                            </form>
                        </div>
                    </div>
                    <!-- search-scripts -->
                    <script src=""""),_display_(/*126.35*/routes/*126.41*/.Assets.versioned("javascripts/classie.js")),format.raw/*126.84*/(""""></script>
                    <script src=""""),_display_(/*127.35*/routes/*127.41*/.Assets.versioned("javascripts/uisearch.js")),format.raw/*127.85*/(""""></script>
                    <script>
                        new UISearch(document.getElementById('sb-search'));
                    </script>
                    <!-- //search-scripts -->
                    <!---->
                    <div class="col-md-4 login-pop">

                        """),_display_(/*135.26*/if(session.get("nombre") == null)/*135.59*/ {_display_(Seq[Any](format.raw/*135.61*/("""
                        """),format.raw/*136.25*/("""<div id="loginpop">
                            <a href="#" id="loginButton"><span>Login <i class="arrow glyphicon glyphicon-chevron-right"></i></span></a>
                                <div id="loginBox">
                                    <form action="/login" method="post" id="loginForm">
                                        <fieldset id="body">
                                            <fieldset>
                                                <label for="email">Email</label>
                                                <input type="text" name="email" id="email">
                                            </fieldset>
                                            <fieldset>
                                                <label for="password">Password</label>
                                                <input type="password" name="password" id="password">
                                            </fieldset>
                                            <input type="submit" id="login" value="Entrar">
                                            <a class="btn btn-primary" href="crearusuario">Crear</a>
                                            </fieldset>
                                        <span><a href="#">Forgot your password?</a></span>
                                    </form>
                                </div>
                        </div>
                        """)))}/*156.27*/else/*156.31*/{_display_(Seq[Any](format.raw/*156.32*/("""
                        """),format.raw/*157.25*/("""<a class="top-sign" href="/logout"><span>Salir<i class="fa fa-sign-in"></i></span></a>
                        """)))}),format.raw/*158.26*/("""
                    """),format.raw/*159.21*/("""</div>
                    <div class="clearfix"> </div>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
        <!--notification menu end -->
        <!-- //header-ends -->
        <!-- /w3l-agileits -->
        <!-- //header-ends -->
        <div id="page-wrapper">
            <div class="inner-content">
                """),_display_(/*171.18*/content),format.raw/*171.25*/("""
            """),format.raw/*172.13*/("""</div>
        </div>
        <div class="clearfix"></div>
        <!--body wrapper end-->
    </div>
    <!--footer section start-->
    <footer>
        <p> 2017 Developed by Luis Gaviria. All Rights Reserved | Design by <a href="https://w3layouts.com/" target="_blank">w3layouts.</a></p>
    </footer>
    <!--footer section end-->
    <!-- /w3l-agile -->
    <!-- main content end-->
    </section>

    <script src=""""),_display_(/*186.19*/routes/*186.25*/.Assets.versioned("javascripts/jquery.nicescroll.js")),format.raw/*186.78*/(""""></script>
    <script src=""""),_display_(/*187.19*/routes/*187.25*/.Assets.versioned("javascripts/scripts.js")),format.raw/*187.68*/(""""></script>
    <!-- Bootstrap Core JavaScript -->
    <script src=""""),_display_(/*189.19*/routes/*189.25*/.Assets.versioned("javascripts/bootstrap.js")),format.raw/*189.70*/(""""></script>
    </body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/* * This template is called from the `index` template. This template * handles the rendering of the page header and body
tags. It takes * two arguments, a `String` for the title of the page and an `Html` * object to insert into the body of the
page. */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu May 11 00:42:22 COT 2017
                  SOURCE: C:/Users/Luchitogaro/workspace/nocopyrightsounds/app/views/main.scala.html
                  HASH: 3b236306bc92930ad75b8dd360698c4ae2844824
                  MATRIX: 997->256|1122->286|1150->288|1223->386|1255->391|1515->623|1544->624|1573->625|1628->652|1657->653|1717->684|1747->685|1777->686|1828->708|1858->709|1890->714|1939->736|1965->741|2050->799|2065->805|2127->846|2211->903|2226->909|2287->948|2366->1000|2381->1006|2448->1052|2554->1131|2569->1137|2632->1179|2737->1257|2752->1263|2822->1312|2950->1413|2965->1419|3032->1465|3152->1558|3167->1564|3236->1612|4046->2395|4132->2472|4171->2473|4216->2490|4345->2588|4386->2601|5888->4074|5918->4075|5967->4095|5997->4096|6175->4245|6205->4246|6263->4275|6293->4276|6506->4460|6536->4461|6589->4485|6619->4486|6836->4674|6866->4675|6919->4699|6949->4700|8619->6342|8635->6348|8700->6391|8774->6437|8790->6443|8856->6487|9184->6787|9227->6820|9268->6822|9322->6847|10762->8268|10776->8272|10816->8273|10870->8298|11014->8410|11064->8431|11467->8806|11496->8813|11538->8826|11988->9248|12004->9254|12079->9307|12137->9337|12153->9343|12218->9386|12315->9455|12331->9461|12398->9506
                  LINES: 29->4|34->4|36->6|40->10|41->11|44->14|44->14|44->14|44->14|44->14|44->14|44->14|44->14|44->14|44->14|45->15|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|50->20|50->20|50->20|52->22|52->22|52->22|54->24|54->24|54->24|57->27|57->27|57->27|60->30|60->30|60->30|83->53|83->53|83->53|84->54|85->55|86->56|113->83|113->83|113->83|113->83|114->84|114->84|114->84|114->84|116->86|116->86|116->86|116->86|118->88|118->88|118->88|118->88|156->126|156->126|156->126|157->127|157->127|157->127|165->135|165->135|165->135|166->136|186->156|186->156|186->156|187->157|188->158|189->159|201->171|201->171|202->172|216->186|216->186|216->186|217->187|217->187|217->187|219->189|219->189|219->189
                  -- GENERATED --
              */
          