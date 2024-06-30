object Assignment_2_8 {
  def main(args:Array[String]):Unit= {
    for(i<-1 to 1){
      for(j<-1 to 2){
        print(" *   ")
      }
    }
    println()
    for(i<-1 to 1){
      for(j<-1 to 2){
        if(j!=1){
          print(" ")
        }
        for(k<- 1 to 2){
          print("* ")
        }
      }
    }
    println()
    for(i<-1 to 1){
      for(j<-1 to 5){
        print("* ")
      }
    }
    println()
    for(i<-1 to 1) {
      for (j <- 1 to 2) {
        if (j != 1) {
          print(" ")
        }
        for (k <- 1 to 2) {
          print("* ")
        }
      }
    }
    println()
    for(i<-1 to 1){
      for(j<-1 to 2){
        print(" *   ")
      }
    }
  }
}
