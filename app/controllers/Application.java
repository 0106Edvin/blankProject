package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.register;

public class Application extends Controller {

    public Result index() {
        return ok(index.render());
    }
    public Result register(){
        return ok(register.render());
    }

}
