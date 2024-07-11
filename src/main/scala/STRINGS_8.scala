object STRINGS_8 {
  def main(args:Array[String]):Unit= {
    var str="Hello this is Hema from Machilipatnam"
    var rev=""
    for(i<-str.length-1 to 0 by -1){
      rev=rev+str(i)

    }
    print(rev)
  }

}
