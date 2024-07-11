object STRINGS_1 {
  def main(args: Array[String]): Unit = {
    var str = "Hello"
    var chr = 'H'
    var count = 0
    for (i <- 0 until str.length) {
      if (str(i) == chr) {
        count=count+1
      }

    }
    print(chr+" "+count)
  }
}
