object Divisibility_by_4_OR_6_4 {

  def main(args:Array[String]):Unit= {

    val Number = 18
      if(Number%4==0 || Number%6==0){
        print("The given number is divisible by 4 or 6")
      }
      else{
        print("The given number is neither divisible by 4 nor 6")
      }
  }

}
