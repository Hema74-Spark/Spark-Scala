object Odd_Number_Check_AND_3 {
  def main(args:Array[String]):Unit= {
    val Number = 27
    if(Number%2 !=0 && Number%3!=0){
      print("The given value is odd number and not divisible by 3")
    }
    else {
      print("The given number is not odd number and not divisible by 3")
    }
  }
}

