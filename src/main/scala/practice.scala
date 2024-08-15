
// write a scala function to check if a given number is both even and positive sample number is 14
object practice {
  def main(args: Array[String]): Unit = {
    def isEvenAndPositive(number: Int): Boolean = {
      number > 0 && number % 2 == 0
    }

    // Sample usage
    val sampleNumber = 14
    println(s"Is $sampleNumber even and positive? ${isEvenAndPositive(sampleNumber)}")


  }

}
