object ARRAYS_8 {
  def main(args:Array[String]):Unit= {
    var arr=Array(10,5,4,87,84)
    for(i<- 0 until arr.length){
      if(arr(i)%2!=0){
        print(arr(i)+" ")
      }
    }
  }

}
