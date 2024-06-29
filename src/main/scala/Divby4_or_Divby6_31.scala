object Divby4_or_Divby6_31 {
  def main(args:Array[String]):Unit= {
    val num=22
    if(num%4==0 || num%6==0){
      print("The number is divisible by 4 or 6")
    }
    else{
      print("The number is not divisible by 4 or 6")
    }
  }

}
