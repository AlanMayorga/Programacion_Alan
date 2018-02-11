/*******************************************************************
*Alan Osvaldo Mayorga Vega
*Problem3_8.java
*this program calculates how much a person must pay monthly and how much to pay after 20 months
********************************************************************/
import javax.swing.JOptionPane;
public class Problem3_8
{
  public static void main(String[] args)
  {
    double pagoMes = 10, pagoTotal = 0;
    for ( int i = 1; i<=20; i++)
    {
      pagoTotal += pagoMes;
      JOptionPane.showMessageDialog(null, "El pago del mes " + i + " es: " + pagoMes);
      pagoMes *= 2;
    }
    JOptionPane.showMessageDialog(null, "El pago total despues de los 20 meses es: " + pagoTotal);
  }
}
