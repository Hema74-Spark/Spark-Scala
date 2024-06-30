object Logic_basic_23 {
  def main(args:Array[String]):Unit= {
    for(i<-5 to 25 by 2){
      print(i+"^2")
      if(i!=25){
        print(",")
      }
    }
  }
}
