/**********************************************
* Alan Osvaldo Mayorga Vega
* TemperatureConver.java
* This program converts from Fahrenheit to Celcius
***********************************************/
public class  TemperatureConverter
{
  public static void main(String[] args)
  {
    final double FREEZING_POINT = 32.0;
    final double CONVERSION_FACTOR = 5.0 / 9.0;
    double fahrenheit = 50, celcius = 0;
    celcius=CONVERSION_FACTOR*(fahrenheit-FREEZING_POINT);
    System.out.println(fahrenheit+" degrees Fahrenheit = "+celcius+" degrees Celcius");
  }//end main
}//end TemperatureConver
