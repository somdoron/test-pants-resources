package example

import scala.jdk.CollectionConverters._

object Hello {
  def main(args: Array[String]): Unit = {
    val resource = Thread.currentThread().getContextClassLoader().getResource("db/migration/V1.sql")
    println(resource)

    val urls = Thread.currentThread().getContextClassLoader().getResources("db/migration").asScala.toList
    println(urls)
  }
}
