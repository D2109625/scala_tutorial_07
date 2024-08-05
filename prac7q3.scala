object FilterPrime {
  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val output = filterPrime(input)
    println(s"Input: [${input.mkString(", ")}]")
    println(s"Output: [${output.mkString(", ")}]")
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime)
  }

  def isPrime(num: Int): Boolean = {
    if (num <= 1) return false
    if (num == 2) return true
    !(2 until num).exists(i => num % i == 0)
  }
}
