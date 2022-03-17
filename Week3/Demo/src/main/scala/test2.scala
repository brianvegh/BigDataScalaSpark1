import org.apache.spark.sql.SparkSession

object test2 {
  def main(args: Array[String]): Unit = {
    // create a spark session
    // for Windows
    //System.setProperty("hadoop.home.dir", "C:\\winutils")
    System.setProperty("hadoop.home.dir", "C:\\hadoop")
    val spark = SparkSession
      .builder
      .appName("hello hive")
      .config("spark.master", "local")
      .config("spark.sql.warehouse.dir", "hdfs://localhost:9000/user/hive/warehouse")
      .enableHiveSupport()
      .getOrCreate()
    println("created spark session")
    spark.sparkContext.setLogLevel("ERROR")
    spark.sql("SELECT Count(*) AS TOTALCOUNT FROM BevA").show()
  }
}
