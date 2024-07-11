object ARRAYS_3 {
  def main(args:Array[String]):Unit= {

    var arr=Array("Hello","world")


      for(i<- 0 to arr.length-1){
        //print(arr(i)+" ")
        var rev =""
        //print(rev)
        for(j<-arr(i).length-1 to 0 by -1){
          rev = rev+arr(i)(j)

        }
        print(rev+" ")

    }
  }

}
