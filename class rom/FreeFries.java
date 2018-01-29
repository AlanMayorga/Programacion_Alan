/******************************************
*Alan Osvaldo Mayorga Vega
*FreeFries.java
*This program reads points scored by home team and the opposing team and determines IF the fans win free
*******************************************/
import javax.swing.JOptionPane;//para utilizar modo grafico
public class FreeFries
{
  public static void main(String[] args)
  {
    int homePoints, opponentPoints;
    homePoints = Integer.parseInt(JOptionPane.showInputDialog("Enter home points"));
    opponentPoints = Integer.parseInt(JOptionPane.showInputDialog("Enter opponent points"));
    if (homePoints>opponentPoints && homePoints>=100)
    {
      JOptionPane.showMessageDialog(null, "A free order of french fries for white tigers fans");
    }
  }
}
