object Logic_build_15 {
  def main(args:Array[String]):Unit= {

    for(i<-2 to 16){
      var next_number=i+1
      print(i+"*"+next_number)

      if(i!=16) {
      print(",")
      }

    }
    println()
    for(i<-2 to 16){
      var next_number=i+1
      print(i*next_number)
      if(i!=16) {
        print(",")
      }
    }


  }

}
