import com.typesafe.sbtscalariform.ScalariformPlugin
import de.johoop.jacoco4sbt.JacocoPlugin.jacoco
import de.johoop.jacoco4sbt.JacocoPlugin.jacoco
import sbt._
import Keys._
import play.Project._
import sbt.Keys._
import sbt.Keys._

object ApplicationBuild extends Build {

    val appName         = "integrationtest-scala"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      // Add your project dependencies here,
    )

    val main = play.Project(appName, appVersion, appDependencies)
      .settings(ScalariformPlugin.defaultScalariformSettings: _*)
      .settings(jacoco.settings: _*)
      .settings(parallelExecution in jacoco.Config := false)

}
