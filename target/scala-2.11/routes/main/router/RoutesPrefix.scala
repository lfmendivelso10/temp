
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Luchitogaro/workspace/nocopyrightsounds/conf/routes
// @DATE:Wed May 10 23:27:36 COT 2017


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
