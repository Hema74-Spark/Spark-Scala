object Logic_build_odd_11 {
  def main(args:Array[String]):Unit= {
    for(i<-251 to 51 by -1){
      if(i%2!=0){
        println(i)
      }
    }
  }

}