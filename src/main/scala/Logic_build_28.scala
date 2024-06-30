object Logic_build_28 {
  def main(args:Array[String]):Unit= {
    for(i<-1 to 25) {
      if (i % 2 != 0 && i % 5 != 0) {
        print(i + ",")
      }
      else if(i%5==0){
        print("Divisible by 5")
        if(i!=25)
          {
            print(",")
          }
      }
    }
    }
  }

