object Logic_build_22 {
  def main(args:Array[String]):Unit= {
    for(i<-100 to 10000 by 100){
      print(i)
      if(i!=10000){
        print(",")
      }
    }
  }

}
