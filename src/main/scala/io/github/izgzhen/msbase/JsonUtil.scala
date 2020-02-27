package io.github.izgzhen.msbase

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.{DefaultScalaModule, ScalaObjectMapper}

/* Created at 2/26/20 by zhen */
object JsonUtil {
  val mapper = new ObjectMapper() with ScalaObjectMapper
  mapper.registerModule(DefaultScalaModule)

  def toJson(value: Any): String = {
    mapper.writerWithDefaultPrettyPrinter.writeValueAsString(value)
  }

  def fromJSON[T](json: String)(implicit m : Manifest[T]) : T = {
    mapper.readValue[T](json)
  }
}
