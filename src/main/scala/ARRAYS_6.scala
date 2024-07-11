object ARRAYS_6 {
  def main(args:Array[String]):Unit= {
    var arr=Array(10,20,30,40,50)
    var len=arr.length

    var sum=0
    for(i<-0 until arr.length){
      sum=sum+arr(i)
    }
    var avg = sum /len
    print(avg)
  }

}
