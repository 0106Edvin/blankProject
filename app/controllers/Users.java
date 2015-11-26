package controllers;

import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by edvin.mulabdic on 26/11/15.
 */
public class Users extends Controller{
    private static final Form<User> userForm = Form.form(User.class);

    public Result login(){
        Form<User> boundForm = userForm.bindFromRequest();

        String name = boundForm.field("firstname").value();
        String lastname = boundForm.field("lastname").value();

        User user = boundForm.get();
        user.save();
        return redirect(routes.Application.index());

    }


}
