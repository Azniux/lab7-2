
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/lab7-2innit/play-java-seed/conf/routes
// @DATE:Thu Nov 23 12:24:50 GMT 2017


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
