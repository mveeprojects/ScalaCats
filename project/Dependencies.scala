import sbt._

object Dependencies {
  val catsVersion = "2.7.0"

  val cats: Seq[ModuleID] = Seq(
    "org.typelevel" %% "cats-core" % catsVersion
  )
}
