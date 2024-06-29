object Age_Group_15 {
  def main(args:Array[String]):Unit= {
    val age_group=15
    if(age_group<13){
      print("Child")
    }
    else if(age_group>= 13 && age_group<= 19){
      print("Teenager")
    }
    else if(age_group >= 20) {
      print("Adult")
    }
  }

}
