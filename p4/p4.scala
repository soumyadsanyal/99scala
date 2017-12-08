object P4 {

  def main(args:Array[String]):Unit = {
    val ls = args.toList;
    val res = countList(ls);
    println(res);
  }

  def countList[A](ls:List[A]):Int = {
    ls match {
      case Nil => 0
      case f::tail => 1 + countList(tail)
    }
  }
}

