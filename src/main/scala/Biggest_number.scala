object Biggest_number {
  def main(args:Array[String]):Unit= {
    var a=30
    var b=20
    var c=10
    if(a>b && a>c){
      print("A is the biggest number and the value is "+a)
    }
    else if(b>a && b>c){
      print("B is the biggest number and the value is "+b)
    }
    else if(c>a && c>b)
      {
        print("C is the biggest number and the value is "+c)
      }
  }

}
