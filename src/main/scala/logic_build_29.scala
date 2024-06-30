object logic_build_29 {
  def main(args:Array[String]):Unit= {

    for(i<- 5 to 51 by 2){
      var pattern=i*0.1
      var formatted_value = "%.1f".format(pattern)
      print(formatted_value+"^2")
      if(i!=51){
        print(",")
      }
    }
  }

}
