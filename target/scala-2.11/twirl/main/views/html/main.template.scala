
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

     object main_Scope1 {
import helper._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.32*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""'>

        <!-- Bootstrap -->
        <link rel="stylesheet" media="screen" href='"""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*11.110*/("""'>
        <script src='"""),_display_(/*12.23*/routes/*12.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*12.78*/("""' type="text/javascript"></script>

        <link rel="shortcut icon" type="image/png" href='"""),_display_(/*14.59*/routes/*14.65*/.Assets.versioned("images/favicon.png")),format.raw/*14.104*/("""'>
        <script src='"""),_display_(/*15.23*/routes/*15.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*15.70*/("""' type="text/javascript"></script>
    </head>

     <nav class="navbar navbar-default">
         <div class="row">
             """),_display_(/*20.15*/helper/*20.21*/.form(action = routes.Users.login())/*20.57*/{_display_(Seq[Any](format.raw/*20.58*/("""
         """),format.raw/*21.10*/("""<div class="col-md-2">
             First name
             <input name="firstname">
         </div>
         <div class="col-md-6">
             Last name
             <input name="lastname">
         </div>
             <div class="col-md-3">
                 <input class="submit-btn" type="submit" value="Register">
             </div>
             """)))}),format.raw/*32.15*/("""
         """),format.raw/*33.10*/("""</div>
         </nav>




    <body>
        """),_display_(/*40.10*/content),format.raw/*40.17*/("""
    """),format.raw/*41.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}
}

/**/
object main extends main_Scope0.main_Scope1.main
              /*
                  -- GENERATED --
                  DATE: Thu Nov 26 16:57:15 CET 2015
                  SOURCE: /Users/edvin.mulabdic/Desktop/Edvin/app/views/main.scala.html
                  HASH: fd884cbd6b4688c899bc3e4b3188e985d9caf009
                  MATRIX: 791->18|916->48|943->49|1030->110|1055->115|1143->177|1157->183|1219->224|1330->308|1345->314|1417->364|1469->389|1484->395|1554->444|1675->538|1690->544|1751->583|1803->608|1818->614|1880->655|2037->785|2052->791|2097->827|2136->828|2174->838|2559->1192|2597->1202|2671->1249|2699->1256|2731->1261
                  LINES: 30->2|35->2|36->3|40->7|40->7|41->8|41->8|41->8|44->11|44->11|44->11|45->12|45->12|45->12|47->14|47->14|47->14|48->15|48->15|48->15|53->20|53->20|53->20|53->20|54->21|65->32|66->33|73->40|73->40|74->41
                  -- GENERATED --
              */
          