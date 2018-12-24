object s99 extends App
{
  def p02 (data: List[Int]) : Int =
  {
    data(data.length - 2)
  }

  def p01 (data: List[Int]) : Int =
  {
    data.last
  }

  def p03 (data: List[Int], idx: Int): Int =
  {
    data(idx - 1)
  }


  println("p01(last items):" + p01(List(1,2,3,4,5,6,7,8,9)))
  println("p02(last but 0 items):" + p02(List(1,2,3,4,5,6,7,8,9)))
  println("p03(last but 0 items):" + p03(List(1,2,345,4,5,6,7,8,9), 3))
}
