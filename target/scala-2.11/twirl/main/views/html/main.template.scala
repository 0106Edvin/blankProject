
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

             """),_display_(/*20.15*/helper/*20.21*/.form(action = routes.Users.login())/*20.57*/{_display_(Seq[Any](format.raw/*20.58*/("""
                 """),format.raw/*21.18*/("""<label>Email</label>
                 <input name="email">
                 <label>Password</label>
                 <input name="password" type="password" >

                 <button>LOGIN</button>

             """)))}),format.raw/*28.15*/("""
         """),format.raw/*29.10*/("""</nav>

    <body>
        """),_display_(/*32.10*/content),format.raw/*32.17*/("""
    """),format.raw/*33.5*/("""</body>
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
                  DATE: Thu Nov 26 23:18:50 CET 2015
                  SOURCE: E:/blankProject/app/views/main.scala.html
                  HASH: c90d517d424bcdab952c8c4062f4ea1bc5a8b1f7
                  MATRIX: 791->19|916->49|944->51|1035->116|1060->121|1149->184|1163->190|1225->231|1339->318|1354->324|1426->374|1479->400|1494->406|1564->455|1687->551|1702->557|1763->596|1816->622|1831->628|1893->669|2029->778|2044->784|2089->820|2128->821|2175->840|2427->1061|2466->1072|2524->1103|2552->1110|2585->1116
                  LINES: 30->2|35->2|36->3|40->7|40->7|41->8|41->8|41->8|44->11|44->11|44->11|45->12|45->12|45->12|47->14|47->14|47->14|48->15|48->15|48->15|53->20|53->20|53->20|53->20|54->21|61->28|62->29|65->32|65->32|66->33
                  -- GENERATED --
              */
          