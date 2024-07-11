object ARRAYS_1 {
  def main(args:Array[String]):Unit= {
    val size=scala.io.StdIn.readInt()
    val arr= new Array[Int](size)
    for(i<-0 until arr.length){
      println("Enter the Array of "+i+"th Element ")
      arr(i)=scala.io.StdIn.readInt()

    }
    println("Printing the elements")
    for(i<-0 until arr.length){
      print(arr(i)+" ")
    }


  }

}
