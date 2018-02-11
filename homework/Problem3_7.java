/*******************************************************************
*Alan Osvaldo Mayorga Vega
*Problem3_7.java
*this program calculates how many purchases were greater than 1000, howmany were greater than 500 but less than or equal to 1000, and how many were less than or equal to 500 and the amount of what is sold in each category and globally.
********************************************************************/
import javax.swing.JOptionPane;
public class Problem3_7
{
  public static void main(String[] args)
  {
    int venta, numeroVentas, mayores1000 = 0, mayores500 = 0, menores500 = 0;
    double montoMayores1000 = 0, montoMayores500 = 0, montoMenores500 = 0, montoGlobal = 0;
    numeroVentas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ventas"));
    for ( int i = 1; i<=numeroVentas; i++)
    {
      venta = Integer.parseInt(JOptionPane.showInputDialog("Ingerse el monto de la venta " + i));
      if (venta>1000)
      {
        mayores1000 += 1;
        montoMayores1000 += venta;
      }
      else if (venta>500 && venta<=1000)
      {
        mayores500 += 1;
        montoMayores500 += venta;
      }
      else if (venta<=500)
      {
        menores500 += 1;
        montoMenores500 += venta;
      }
    }//end for
    montoGlobal = montoMayores1000+montoMenores500+montoMayores500;
    JOptionPane.showMessageDialog(null, "El numero de ventas mayores a $1000 es: " + mayores1000 + "\nEl numero de ventas mayores a $500 es: " + mayores500 + "\nEl numero de ventas menores a $500 es: " + menores500 + "\nEl monto global es: " + montoGlobal);
  }
}
