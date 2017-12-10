object P5 {

  def main(args:Array[String]):Unit = {
    val ls = args.toList;
    val res = revList(ls);
    println(res);
  }

  def revList[A](ls: List[A]):List[A] = {
    val res = ls.foldLeft(List[A]())((acc, x) => x::acc);
    res
  }
}
