import org.apache.spark.SparkContext

object Second {
  def main(args:Array[String]):Unit={

    val sc=new SparkContext("local[*]","Hema")
    val rdd1=sc.textFile("C:/Users/divya/OneDrive/Documents/Second_Sc.txt")
    val rdd2=rdd1.flatMap(x=>x.split(" "))
    val rdd3=rdd2.map(x=>(x,1))
    val rdd4=rdd3.reduceByKey((x,y)=>x+y)
    rdd4.collect.foreach(println)

    scala.io.StdIn.readLine()
  }

}