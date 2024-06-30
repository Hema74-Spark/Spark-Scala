object Palindrome_13 {

  def main(args:Array[String]):Unit= {
    var str="Hema"
    var rev=""
    for(i<-str.length-1 to 0 by -1){
      rev=rev+str(i)
      //print(rev)
    }
    if(str==rev){
      print("The given string is Palindrome")
    }
    else{
      print("The given string is not palindrome")
    }

  }

}
