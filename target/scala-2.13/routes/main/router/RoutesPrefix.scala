// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Mutwol/Documents/GitHub/therhapsody/conf/routes
// @DATE:Wed Jun 26 16:08:39 EAT 2019


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
