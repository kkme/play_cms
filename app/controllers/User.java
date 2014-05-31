package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

/**
 * Created by thanhthaile on 5/31/2014.
 */
public class User extends Controller {
    public static Result index(){
        return ok(index.render("ok! let go"));
    }
}
