object P3 {

  def main(args: Array[String]): Unit = {
    val K = args.head.toInt;
    val ls = args.tail.toList;
    val res = getelem(K-1, ls);
    println(res);
  }

  def getelem[A](n:Int, ls:List[A]):A = {
    if (n > 0) {ls match {
      case Nil => throw new Exception("exhausted list!")
      case f::Nil => throw new Exception("exhausted list!")
      case f::tail => getelem(n-1, tail)
    }
  }
  else if (n == 0) {
    ls match {
      case f::tail => f
      case Nil => throw new Exception("exhausted list!")
    }
  }
  else {
    throw new Exception("whoa!")
  }

  }
}

