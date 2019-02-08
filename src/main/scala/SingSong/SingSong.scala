package SingSong

case class Animal(name: String, moto: Option[String])

object SingSong {
  val introSentence = "There was an old lady who swallowed a"
  def middleSentence(catcher: String, catched: String) = s"She swallowed the $catcher to catch the $catched"
  def endSentence(animal: String) = s"I don't know why she swallowed a ${animal} - perhaps she'll die!"

  def computeStart(group: List[Animal]) = {
    val res = s"$introSentence ${group.head.name}"
    if (group.size == 1) res +".\n"
    else res + ";\n"
  }

  def computeMiddleLines(acc: String, group: List[Animal]): String = {
    group match {
      case x :: Nil => s"${acc};\n"
      case x :: xs => {
        val end = xs.size match {
          case 1 => None
          case _ => Some(",\n")
        }
        computeMiddleLines(acc + middleSentence(x.name, xs.head.name) + end.getOrElse(""), xs)
      }
    }
  }

  def computeMiddle(group: List[Animal]): String =
    group match {
      case _ :: Nil => ""
      case _ => computeMiddleLines("", group)
    }

  def computeEnd(group: List[Animal]) = endSentence(group.last.name)

  def computeCouplet(group: List[Animal]) =
    computeStart(group) + group.head.moto.map(_ + "\n").getOrElse("") + computeMiddle(group) + computeEnd(group)

  def singsong(animals: List[Animal]) =
    s"""
       |${animals.init.inits.toList.reverse.tail.map(group => computeCouplet(group.reverse)).mkString("\n\n")}
       |
       |${introSentence} ${animals.last.name}...
       |...She's dead, of course!`""".stripMargin
}
