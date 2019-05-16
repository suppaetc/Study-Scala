import scala.io.StdIn.readDouble ;object task3_1 {
  def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
    // put your code here
   val x = readDouble()
    val p  =(1/(sigma*math.sqrt(2*math.Pi))*math.pow(math.E,(-(math.pow((x-mu),2)/(2*(math.pow(sigma,2)))))))
    p
  }


}
