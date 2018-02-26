/********************************************
*Alan Osvaldo Mayorga Vega
*Circle.java
*This class calculates the area of a circle
**********************************************/
import javax.swing.*;
public class Circle
{
  //Properties
  private double radius;

  //Constructor
  public Circle()
  {
  }
  //Constructor circle overload
  public Circle(double radius)
  {
    this.radius = radius;
  }

  //methods
  public void setRadius(double radius)
  {
    this.radius = radius;
  }
  public double getRadius()
  {
    return this.radius;
  }

  public double getArea()
  {
    return Math.pow(this.radius,2)*Math.PI;
  }
  public static void main(String[] args)
  {
    double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius"));
    Circle circle = new Circle(radius);
    JOptionPane.showMessageDialog(null, "The circle's area with a radius of " + circle.getRadius() + " is " + circle.getArea());
  }
}
