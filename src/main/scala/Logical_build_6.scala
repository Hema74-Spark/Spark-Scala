object Logical_build_6 {
  def main(args:Array[String]):Unit= {
    var num=30
    if(num>=90 && num<100){
      print("Super Smart")
    }
    else if (num>=80 && num<90){
      print("Smart")
    }
    else if(num>=70 && num<80){
      print("smart enough")
    }
    else if (num>=60 && num<70){
      print("just smart")
    }
    else if(num>=35 && num<60){
      print("no smart")
    }
    else if (num>=0 && num<35){
      print("dump")
    }
    else {
      print("Invalid Input")
    }
  }

}
