package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by edvin.mulabdic on 26/11/15.
 */
@Entity
public class User extends Model {
    public static Finder<String, User> finder = new Finder<>(User.class);

    @Id
    public Integer id;

    @Constraints.Required(message = "Please input your first name")
    @Constraints.MinLength(value = 2, message = "First name must be at least 2 letters long!")
    public String firstname;

    @Constraints.Required(message = "Please input your last name")
    @Constraints.MinLength(value = 2, message = "Last name must be at leastt 2 letters long!")
    public String lastname;

    @Constraints.Required(message = "Please input email!")
    @Column(unique = true)
    public String email;
    @Constraints.Required(message = "Please input password!")
    @Constraints.MinLength(6)
    public String password;


    public User(String password, String email, String lastname, String firstname) {
        this.password = password;
        this.email = email;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public static User authenticate(String email, String password){
        User user = finder.where().eq("email", email.toString()).findUnique();
        if(user != null && password.equals(user.password)){
            return user;
        }else{
            return null;
        }
    }

    @Override
    public String toString() {
        return String.format("%s, %s", firstname, lastname);
    }
}
