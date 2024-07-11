object ARRAYS_9 {
  def main(args:Array[String]):Unit= {
    var arr=Array(101,60,64,83,100,50)
    var max=arr(0)
    for(i<-0 until arr.length-1){
      for(j<-0 until arr.length-i-1){
        if(arr(j)>arr(j+1)){
          val temp=arr(j)
          arr(j)=arr(j+1)
          arr(j+1)=temp
        }

      }

    }
    arr.foreach(num=> println(num))
    print("The second largest number in the array "+arr(arr.length-2))
  }

}
