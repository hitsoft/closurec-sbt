libraryDependencies <+= sbtVersion(v =>"org.scala-sbt" % "scripted-plugin" % v)

addSbtPlugin("com.hanhuy.sbt" % "sbt-idea" % "1.6.0")

resolvers += Resolver.url(
  "bintray-sbt-plugin-releases",
  url("http://dl.bintray.com/content/sbt/sbt-plugin-releases"))(
  Resolver.ivyStylePatterns)

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.1.1")
