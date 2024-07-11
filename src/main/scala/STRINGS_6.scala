object STRINGS_6 {
  def main(args:Array[String]):Unit= {
    var str="madam"
    var str2=""
    for(i<-str.length-1 to 0 by -1){
      str2=str2+str(i)

    }
    if(str==str2){
      print(str+" is a palindrome ")
    }
    else{
      print(str+" is not palindrome")
    }
  }

}
