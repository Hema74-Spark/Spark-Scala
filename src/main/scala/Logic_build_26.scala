object Logic_build_26 {
  def main(args:Array[String]):Unit= {
    for(i<-1 to 35){
      if(i%2!=0){
        print(i)
        if(i!=35){
          print(",")
        }
      }
      else{
        print("Even,")
      }
    }
  }

}
