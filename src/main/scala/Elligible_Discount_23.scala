object Elligible_Discount_23 {
  def main(args:Array[String]):Unit= {
    val purch_amt=180
    val loyalty_card=true
    if(purch_amt>200 || loyalty_card==true){
      print("The person is eligible for discount or membership benefits")
    }else{
      print("The person is not eligible")
    }
  }

}
