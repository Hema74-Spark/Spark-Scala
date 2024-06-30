object logic_build_18 {
  def main(args:Array[String]):Unit= {
    var sum=0
    var j=0
    for (i<-24 to 100 by 2){
      sum=sum+i
      j=j+1
    }
    var avg=sum/j
    print(avg)

  }

}
