object FilterEvenNumbers {
  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val output = filterEvenNumbers(input)
    println(s"Input: [${input.mkString(", ")}]")
    println(s"Output: [${output.mkString(", ")}]")
  }

  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(num => num % 2 == 0)
  }
}


