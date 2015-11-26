package controllers;

import helpers.SessionsAndCookies;
import models.User;
import play.Logger;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.page;

/**
 * Created by edvin.mulabdic on 26/11/15.
 */
public class Users extends Controller{
    private static final Form<User> userForm = Form.form(User.class);

    public Result saveUser(){
        Form<User> boundForm = userForm.bindFromRequest();
        User user = boundForm.get();
        user.save();
        return redirect(routes.Application.index());

    }

    public Result login(){
        Form<User> boundForm = userForm.bindFromRequest();

        String email = boundForm.field("email").value();
        String password = boundForm.field("password").value();

        User user = User.authenticate(email, password);
        Logger.info("Usersi " + user);
        if(user != null){
            return ok(page.render());
        }
//        SessionsAndCookies.setCookies(user);
        return redirect(routes.Application.index());
    }



}
