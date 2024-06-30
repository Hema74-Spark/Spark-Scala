object Logic_build_21 {
  def main(args:Array[String]):Unit= {
    for(i<-10 to -5 by -1){
      var prev_number=i-1
      print(i+"@"+prev_number)
      if(i!= -5){
        print(",")
      }
    }
  }

}
