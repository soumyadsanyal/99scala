object P1 {

  def main(args: Array[String]): Unit = {
    val ls = args.toList;
    val res = thelast(ls);
    println(res); 
  }

  def thelast[A](ls: List[A]): A = {
    ls match {
      case l::Nil => l
      case l::tail => thelast(tail)
      case _ => throw new Exception
    }
  }
}
    
