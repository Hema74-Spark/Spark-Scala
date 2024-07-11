object ARRAYS_7 {
  def main(args:Array[String]):Unit= {
    var arr = Array("Hello","How","are","you")
    var str = "are"
    for(i<-0 until arr.length){
      if(arr(i)==str){
        print("The given string is available in the Array "+arr(i))
      }

    }
  }

}
