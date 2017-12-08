case class CustomException(arg:String) extends Exception(arg)

object P2 {

  def main(args: Array[String]): Unit = {
    val ls = args.toList;
    val res = penultimate(ls);
    println(res);
  }

  def penultimate[A](ls: List[A]):A = {
    ls match {
      case p::u::Nil => p
      case u::Nil => throw new CustomException("less than two elements provided")
      case x::tail => penultimate(tail)
      case _ => throw new CustomException("empty list!")
    }
  }
}

      
