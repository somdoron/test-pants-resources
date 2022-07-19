scala_sources(name="example")

deploy_jar(name="app", dependencies=[":example", "src/main/resources" ], main="example.Hello")

jvm_artifact(
  name="org.scala-lang-scala-library",
  group="org.scala-lang",
  artifact="scala-library",
  version="2.13.8",
)