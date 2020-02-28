package io.github.izgzhen.msbase

import com.fasterxml.jackson.databind.{ObjectMapper, SerializationFeature}
import com.fasterxml.jackson.module.scala.{DefaultScalaModule, ScalaObjectMapper}

/* Created at 2/26/20 by zhen */
object JsonUtil {
  val mapper = new ObjectMapper() with ScalaObjectMapper
  mapper.registerModule(DefaultScalaModule)
  mapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true)

  def toJson(value: Any): String = {
    mapper.writerWithDefaultPrettyPrinter.writeValueAsString(value)
  }

  def fromJSON[T](json: String)(implicit m : Manifest[T]) : T = {
    mapper.readValue[T](json)
  }
}
