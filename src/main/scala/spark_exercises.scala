import org.apache.spark.sql.SparkSession

object spark_exercises {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder
      .master("local[*]")
      .appName("spark exercises")
      .getOrCreate()

    // Your Spark codes are here
    // spark: sparkSession object (like sqlContext in Spark 1.x)
    // sc: sparkContext object (Spark 1.x compatible)

    // What is the difference between RDD, dataframe and dataset

    // Read txt file sample.txt and show me the first 30 rows
    val myfile = spark.read.option("header", "true").csv("data/sample.txt")
    myfile.show(30)

    // Convert time column to seconds

    // Join it with sample_2.txt keeping all rows

    // Compute the average pulse by name that matches

    // Transform this dataframe to a dataset of [Thing] (we don't care about the row index)


    spark.stop()

  }
}