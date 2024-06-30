object factorial_8 {
  def main(args:Array[String]):Unit= {
    var n=7
    var m=1
    for(i<-1 to n){
      m=m*n
      n=n-1
    }
    print(m)
  }

}
