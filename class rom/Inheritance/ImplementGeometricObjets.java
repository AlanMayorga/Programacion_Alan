import javax.swing.*;
public class ImplementGeometricObjets
{
  public static void main(String [] args)
  {
    Circle circlelito = new Circle(3.5, "BLUE", true);
    /*
    JOptionPane.showMessageDialog(null, "The area is " + circlelito.getArea());
    JOptionPane.showMessageDialog(null, ("The circle was created on " + circlelito.getDateCreate()));

    Rectangle rectanglelito = new Rectangle(10, 20, "RED", true);
    JOptionPane.showMessageDialog(null, "The area is " + rectanglelito.getArea());
    JOptionPane.showMessageDialog(null, "The perimeter is " + rectanglelito.getPerimeter());
    JOptionPane.showMessageDialog(null, "The rectangle was created on " + rectanglelito.getDateCreate());
    */

    //polimorfismo
    JOptionPane.showMessageDialog(null, circlelito.toString());
  }
}
