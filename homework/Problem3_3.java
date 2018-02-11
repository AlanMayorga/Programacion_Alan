/******************************************
*Alan Osvaldo Mayorga Vega
*Problem3_3.java
*This program calculates how much a person saves in a year
********************************************/
import javax.swing.JOptionPane;
public class Problem3_3
{
  public static void main(String[] args)
  {
    double cantidadAhorrada = 0, ahorroMensual;
    for (int i = 1; i<=12; i++)
    {
      ahorroMensual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a ahorrar en el mes " + i));
      JOptionPane.showMessageDialog(null, "La cantida ahorrada en el mes " + i + " es: " + ahorroMensual);
      cantidadAhorrada += ahorroMensual;
    }
    JOptionPane.showMessageDialog(null, "La cantidad ahorrada en el año es: " + cantidadAhorrada);
  }
}
