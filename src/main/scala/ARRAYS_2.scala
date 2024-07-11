object ARRAYS_2 {
  def main(args:Array[String]):Unit= {

    var sum=0
    val arr=Array(10,20,30,40,50)
    for (i<- 0 until arr.length){
      sum=sum+arr(i)
    }
    println(sum)
  }

}
