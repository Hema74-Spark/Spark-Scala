object Positive_not_divby3_25 {

  def main(args:Array[String]):Unit= {
    val number=15
    if(number<0 && number%3!=0){
      print("The given number is non-positive and not divisible by 3")
    }
    else{
      print("The number is positive and divisible by 3")
    }
  }

}
