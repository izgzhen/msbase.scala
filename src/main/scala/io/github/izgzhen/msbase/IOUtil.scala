package io.github.izgzhen.msbase

import java.io.{BufferedWriter, File, FileWriter}

import scala.jdk.CollectionConverters._

/* Created at 5/3/20 by zhen */
object IOUtil {
  def writeLines(lines: List[String], dest: String): Unit = {
    val file = new File(dest)
    val bw = new BufferedWriter(new FileWriter(file))
    bw.write(lines.mkString("\n"))
    bw.close()
  }

  def writeLinesJava(lines: java.util.List[String], dest: String): Unit = {
    writeLines(lines.asScala.toList, dest)
  }

  def write(s: String, dest: String): Unit = {
    val file = new File(dest)
    val bw = new BufferedWriter(new FileWriter(file))
    bw.write(s)
    bw.close()
  }
}
