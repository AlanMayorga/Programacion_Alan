/************************************************************************
*Alan Osvaldo Mayorga Vega
*Rectangle.java
*This implements a rectangle with constructors
*************************************************************************/
import javax.swing.*;
public class Rectangle
{
  //Atributs or Properties
  private double heigth;
  private double width;

  public Rectangle()
  {
    this.heigth = 10;
    this.width = 20;
  }
  public Rectangle(double heigth, double width)
  {
    this.heigth = heigth;
    this.width = width;
  }

  public double getArea()
  {
    return this.heigth * this.width;
  }

  public static void main (String[] args)
  {
    Rectangle rectangle = new Rectangle();
    JOptionPane.showMessageDialog(null, "The area is: " + rectangle.getArea());

    Rectangle rectangle2 = new Rectangle(5, 10);
    JOptionPane.showMessageDialog(null, "The rectangle2's area is: " + rectangle2.getArea());
  }
}
