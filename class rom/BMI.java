/************************************************
*Alan Osvaldo Mayorga Vega
*BMI.java
*This program calculates the body mass index
*************************************************/
import javax.swing.JOptionPane;
public class BMI
{
  public static void main(String[] args)
  {
    float weight, height;
    final double KILOGRAMS_PER_POUND = 0.45359237;
    final double METERS_PER_INCH = 0.0254;
    weight = Float.parseFloat(JOptionPane.showInputDialog("Enter your weight in pounds"));
    height = Float.parseFloat(JOptionPane.showInputDialog("Enter your height in inches"));
    double weightInKilograms = weight*KILOGRAMS_PER_POUND;
    double heightInMeters = height* METERS_PER_INCH;
    double bmi = weightInKilograms/(Math.pow(heightInMeters,2));
    if (bmi<16)
    {
      JOptionPane.showMessageDialog(null, "You are seriously underweight");
    }//end if
    else if (bmi<18)
    {
      JOptionPane.showMessageDialog(null, "You are underweight");
    }//end else if
    else if (bmi<24)
    {
      JOptionPane.showMessageDialog(null, "You are normal weight");
    }//end else if
    else if (bmi<29)
    {
      JOptionPane.showMessageDialog(null, "You are overweight");
    }//end else if
    else if (bmi<35)
    {
      JOptionPane.showMessageDialog(null, "You are seriously overweight");
    }//end else if
    else
    {
      JOptionPane.showMessageDialog(null, "You are gravely overweight");
    }//end else
  }
}
