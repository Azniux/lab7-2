
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Home")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
  """),format.raw/*4.3*/("""<h3>
    Core Design Core Design Core Design Core Design Core Design Core Design Core Design 
  </h3>
  <h4> We specialise We specialise We specialise We specialise We specialise </h4>
  <ul>
    <li>Web</li>
    <li>Content</li>
    <li>Web</li>
    <li>Ecommerce</li>
    <li>Security</li>
    <li>Search</li>
  </ul>
  <p>
    Please <a href=""""),_display_(/*17.22*/routes/*17.28*/.HomeController.contact),format.raw/*17.51*/("""">contact us</a> to discuss your requirements
  </p>
""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 23 12:28:52 GMT 2017
                  SOURCE: /media/sf_student/lab7-2innit/play-java-seed/app/views/index.scala.html
                  HASH: 64204753fc36f614c245c41c4987e87a3c558410
                  MATRIX: 941->1|1037->3|1065->6|1085->18|1124->20|1153->23|1527->370|1542->376|1586->399|1670->453
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|49->17|49->17|49->17|51->19
                  -- GENERATED --
              */
          