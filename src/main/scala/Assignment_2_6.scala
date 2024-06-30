object Assignment_2_6 {
  def main(args:Array[String]):Unit= {
    for(i<-1 to 9 by 2){
      for(j<-1 to i){
        print("* ")
      }
      println()
    }
    for(i<-7 to 1 by -2){
      for(j<-1 to i){
        print("* ")
      }
      println()
    }
  }

}
