
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/blankProject/conf/routes
// @DATE:Thu Nov 26 23:03:47 CET 2015


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
