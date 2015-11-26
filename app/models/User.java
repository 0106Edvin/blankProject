package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;

/**
 * Created by edvin.mulabdic on 26/11/15.
 */
@Entity
public class User extends Model {

    @Id
    public Integer id;

    @Constraints.Required(message = "Please input your first name")
    @Constraints.MinLength(value = 2, message = "First name must be at least 2 letters long!")
    public String firstname;

    @Constraints.Required(message = "Please input your last name")
    @Constraints.MinLength(value = 2, message = "Last name must be at leastt 2 letters long!")
    public String lastname;

//    @Constraints.Required(message = "Please input email!")
//    @Column(unique = true)
//    public String email;
//
//    @Constraints.Required(message = "Please input password!")
//    @Constraints.MinLength(6)
//    public String password;


    public User(String password, String email, String lastname, String firstname) {
//        this.password = password;
//        this.email = email;
        this.lastname = lastname;
        this.firstname = firstname;
    }
}
