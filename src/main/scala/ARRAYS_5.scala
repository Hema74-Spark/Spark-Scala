object ARRAYS_5 {
  def main(args:Array[String]):Unit= {
    var arr=Array(10,20,30,40,50)
    var arr1=Array(60,70,80,90,100)
    val arr3 = arr++arr1
    println(arr3.length)
    for(i<-0 until arr3.length){
      print(arr3(i)+" ")
    }

  }

}
