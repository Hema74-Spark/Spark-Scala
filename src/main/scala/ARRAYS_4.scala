object ARRAYS_4 {
  def main(args:Array[String]):Unit= {
    var arr=Array(10.2,5.6,100.40,70.5,11.2)
    var max=arr(0)
    for(i<-0 until arr.length){

        if(arr(i)>max) {
          max = arr(i)

        }
      }
    print(max)

    }




}
