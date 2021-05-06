package com.github.ivellien.pgquery.parser

object Main {
  def main(args: Array[String]): Unit = {
    val input: String =
      "SELECT (x)"
    println(PgQueryParser.wrapper.pgQueryParse(input))
    println(PgQueryParser.json(input))
    println(PgQueryParser.parseTree(input))
    println(PgQueryParser.prettify(input))
  }
}