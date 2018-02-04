/*******************************************************
*Alan Osvaldo Mayora Vega
*Problem2_7.java
*This Program determines how much a producer will receive for the grapes he delivers in a shipment
*******************************************************/
import javax.swing.JOptionPane;
public class Problem2_7
{
  public static void main(String[] args)
  {
    String tipoUva;
    int tamaUva, kilosProduccion = 0;
    double precioUva, ganancia = 0;
    tipoUva = JOptionPane.showInputDialog("Ingese el tipo de uva");
    tamaUva = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamano de la uva"));
    kilosProduccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los kilos producidos"));
    precioUva = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el presio de la uva"));
    if (tipoUva=="A" || tipoUva=="a")
    {
      if (tamaUva==1)
      {
        precioUva = precioUva+0.20;
      }
      if (tamaUva==2)
      {
        precioUva = precioUva+0.30;
      }
    }//end if
    if (tipoUva=="B" || tipoUva=="b")
    {
      if (tamaUva==1)
      {
        precioUva = precioUva-0.30;
      }
      if (tamaUva==2)
      {
        precioUva = precioUva-0.50;
      }
    }//end if
    ganancia = precioUva*kilosProduccion;
    JOptionPane.showMessageDialog(null, "La ganacia obtenida es: " + ganancia);
  }
}
