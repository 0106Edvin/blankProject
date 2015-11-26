package helpers;

import models.User;
import play.mvc.Security;

import static play.mvc.Controller.response;
/**
 * Created by User on 11/26/2015.
 */
public class SessionsAndCookies extends Security.Authenticator {

    public static void setCookies(User user){
        response().setCookie("email", user.email);

        String firstname = "";
        String[] name = user.firstname.split(" ");

        for (String s : name) {
            firstname += s;
        }

        response().setCookie("firstname",firstname);
        response().setCookie("id", user.id.toString());
    }
}
