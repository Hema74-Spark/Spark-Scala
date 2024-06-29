object Divisible_3_OR_8_14 {
  def main(args:Array[String]):Unit= {
    val num=24
      if(num%3==0 || num%8==0){
        print("The given number is divisible by 3 or 8")
      }
      else{
        print("The given number is not divisible by 3 or 8")
      }
  }

}
