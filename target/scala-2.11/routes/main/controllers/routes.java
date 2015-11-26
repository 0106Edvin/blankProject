
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/edvin.mulabdic/Desktop/Edvin/conf/routes
// @DATE:Thu Nov 26 16:49:14 CET 2015

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseUsers Users = new controllers.ReverseUsers(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseUsers Users = new controllers.javascript.ReverseUsers(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
