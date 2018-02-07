/************************************************************************
*Alan Osvaldo Mayorga Vega
*FloorSpaceDoWhile.java
*This Program calculates total floor space in a house
*************************************************************************/
import javax.swing.JOptionPane;
public class FloorSpaceDoWhile
{
  public static void main(String[] args)
  {
    double length, widgth;// room dimensions
    double floorSpace = 0; // house's total floor
    char response;// user's response
    do
    {
      length = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the room's length", "My input", JOptionPane.QUESTION_MESSAGE));
      widgth = Double.parseDouble(JOptionPane.showInputDialog("Enter the room's widgth"));
      response = JOptionPane.showInputDialog("Any more room? (y/n)").charAt(0);
      floorSpace += length * widgth;
    }while(response=='Y' || response=='y');
    JOptionPane.showMessageDialog(null, "The total floor space is: " + floorSpace, "Resultado", JOptionPane.WARNING_MESSAGE);
  }
}
