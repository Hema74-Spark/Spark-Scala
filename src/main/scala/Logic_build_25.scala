object Logic_build_25 {
  def main(args:Array[String]):Unit= {
    for(i<- 4 to -12 by -1){
      print("5*"+i)
      if(i!= -12){
        print(",")
      }
    }
    println()
    var num=5
    for(i<- 4 to -12 by -1){
      print(num*i)
      if(i!= -12){
        print(",")
      }
    }
  }
}
