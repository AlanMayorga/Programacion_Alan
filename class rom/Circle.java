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
    Circle circle = new Circle();
    circle.setRadius(3.14);
    JOptionPane.showMessageDialog(null, circle.getArea());
  }
}
