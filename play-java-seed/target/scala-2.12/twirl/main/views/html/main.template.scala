
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(pageID: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.33*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en" id=""""),_display_(/*10.22*/pageID),format.raw/*10.28*/("""">
    <head>
        <title>Core Design - """),_display_(/*12.31*/pageID),format.raw/*12.37*/("""</title>
        <link rel="stylesheet" type="text/css" media="screen" 
        href=""""),_display_(/*14.16*/routes/*14.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.63*/("""">
        <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
    <div id="Container">
        <div id="Logo">
            <h1>Core Design</h1>
            <h3>
                <em>Website Design and Development Services</em>
            </h3>
        </div>
        <nav class="navbar navbar-default">
                <div class="container-fluid">
                  <div class="navbar-header">
                    <a class="navbar-brand" href="#">WebSiteName</a>
                  </div>
            <ul class="nav navbar-nav"> 
                <li """),_display_(/*38.22*/if(pageID == "Home")/*38.42*/{_display_(Seq[Any](format.raw/*38.43*/("""class="active"""")))}),format.raw/*38.58*/("""><a href=""""),_display_(/*38.69*/routes/*38.75*/.HomeController.index()),format.raw/*38.98*/("""" class="home">Home</a></li>
                <li """),_display_(/*39.22*/if(pageID == "About")/*39.43*/{_display_(Seq[Any](format.raw/*39.44*/("""class="active"""")))}),format.raw/*39.59*/("""><a href=""""),_display_(/*39.70*/routes/*39.76*/.HomeController.about()),format.raw/*39.99*/("""" class="about">About Us</a></li>
                <li """),_display_(/*40.22*/if(pageID == "Services")/*40.46*/{_display_(Seq[Any](format.raw/*40.47*/("""class="active"""")))}),format.raw/*40.62*/("""><a href=""""),_display_(/*40.73*/routes/*40.79*/.HomeController.services()),format.raw/*40.105*/("""" class="services">Services</a></li>
                <li """),_display_(/*41.22*/if(pageID == "Clients")/*41.45*/{_display_(Seq[Any](format.raw/*41.46*/("""class="active"""")))}),format.raw/*41.61*/("""><a href=""""),_display_(/*41.72*/routes/*41.78*/.HomeController.clients),format.raw/*41.101*/("""" class="clients">Llients</a></li>
                <li """),_display_(/*42.22*/if(pageID == "Contact")/*42.45*/{_display_(Seq[Any](format.raw/*42.46*/("""class="active"""")))}),format.raw/*42.61*/("""><a href=""""),_display_(/*42.72*/routes/*42.78*/.HomeController.contact),format.raw/*42.101*/("""" class="contact">Contact Us</a></li>
            </ul>
            </div>
            </nav>
        
        <div id ="Content">
            """),_display_(/*48.14*/content),format.raw/*48.21*/("""
        """),format.raw/*49.9*/("""</div>]
        <div id="Footer">
            <h6>
                <em>Copyright &copy; 2015 Core Design</em>
            </h6>
        </div>
    </div>
</body>
</html>"""))
      }
    }
  }

  def render(pageID:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pageID)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pageID) => (content) => apply(pageID)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 23 12:37:04 GMT 2017
                  SOURCE: /media/sf_student/lab7-2innit/play-java-seed/app/views/main.scala.html
                  HASH: ecaacaa8c66ac085bccbba8dad30b43f4080ed82
                  MATRIX: 1206->260|1332->291|1360->293|1424->330|1451->336|1522->380|1549->386|1663->473|1678->479|1740->520|2676->1429|2705->1449|2744->1450|2790->1465|2828->1476|2843->1482|2887->1505|2964->1555|2994->1576|3033->1577|3079->1592|3117->1603|3132->1609|3176->1632|3258->1687|3291->1711|3330->1712|3376->1727|3414->1738|3429->1744|3477->1770|3562->1828|3594->1851|3633->1852|3679->1867|3717->1878|3732->1884|3777->1907|3860->1963|3892->1986|3931->1987|3977->2002|4015->2013|4030->2019|4075->2042|4246->2186|4274->2193|4310->2202
                  LINES: 33->7|38->7|40->9|41->10|41->10|43->12|43->12|45->14|45->14|45->14|69->38|69->38|69->38|69->38|69->38|69->38|69->38|70->39|70->39|70->39|70->39|70->39|70->39|70->39|71->40|71->40|71->40|71->40|71->40|71->40|71->40|72->41|72->41|72->41|72->41|72->41|72->41|72->41|73->42|73->42|73->42|73->42|73->42|73->42|73->42|79->48|79->48|80->49
                  -- GENERATED --
              */
          