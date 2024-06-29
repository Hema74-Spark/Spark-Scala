object Divisible_2_OR_5_16 {
  def main(args:Array[String]):Unit= {
    val div=25
    if(div%2==0 || div%5==0){
      print("The given number is divisible by 2 or 5")
    }
    else{
      print("The given number is not divisible by 2 or 5")
    }
  }

}
