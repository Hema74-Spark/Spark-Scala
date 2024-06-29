object Eligibility_Discount_Free_trail_30 {

  def main(args:Array[String]):Unit= {
    val age=22
    val free_trail = true
    if(age<25 || free_trail==true){
      print("The person is eligible for discount or free trail")
    }
    else{
      print("The person is not eligible")
    }
  }

}
