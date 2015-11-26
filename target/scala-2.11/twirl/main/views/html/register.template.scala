
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
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

     object register_Scope1 {
import helper._

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Edvin Mulabdic")/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""
    """),format.raw/*3.5*/("""<div class="container">
    <div>
        <h1>Registration</h1>
        <h3>Please fill the input fields</h3>
    </div>
    """),_display_(/*8.6*/helper/*8.12*/.form(action = routes.Users.saveUser())/*8.51*/{_display_(Seq[Any](format.raw/*8.52*/("""
    """),format.raw/*9.5*/("""<div>
        <div>
            <input name="email" placeholder="Email">
        </div>
        <div>
            <input name="firstname" placeholder="First name">
        </div>
        <div>
            <input name="lastname" placeholder="Last name">
        </div>
        <div>
            <input name="password" placeholder="Password">
        </div>
        <div>
            <button>REGISTER</button>
        </div>
    </div>
    """)))}),format.raw/*26.6*/("""
    """),format.raw/*27.5*/("""</div>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}
}

/**/
object register extends register_Scope0.register_Scope1.register
              /*
                  -- GENERATED --
                  DATE: Thu Nov 26 23:02:09 CET 2015
                  SOURCE: E:/blankProject/app/views/register.scala.html
                  HASH: 09086e20a7cc96cf988fad12f6cec2ec286a3f4b
                  MATRIX: 880->19|910->41|948->42|980->48|1136->179|1150->185|1197->224|1235->225|1267->231|1753->687|1786->693
                  LINES: 35->2|35->2|35->2|36->3|41->8|41->8|41->8|41->8|42->9|59->26|60->27
                  -- GENERATED --
              */
          