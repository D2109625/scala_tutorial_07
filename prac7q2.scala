object CalculateSquare {
  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5)
    val output = calculateSquare(input)
    println(s"Input: [${input.mkString(", ")}]")
    println(s"Output: [${output.mkString(", ")}]")
  }

  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(num => num * num)
  }
}
