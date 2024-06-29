object Multiple_Range_check_6 {
  def main(args:Array[String]):Unit= {
    val Range= 20

    if((Range>=1 && Range <=10) || (Range>= 20 && Range <=30)){
      print("The given number is in the range [1, 10] or [20, 30]")
    }
    else{
      print("The given number is not in the range [1, 10] or [20, 30]")
    }

  }
}
