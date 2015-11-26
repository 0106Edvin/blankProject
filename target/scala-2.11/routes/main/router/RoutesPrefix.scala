
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/edvin.mulabdic/Desktop/Edvin/conf/routes
// @DATE:Thu Nov 26 16:49:14 CET 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
