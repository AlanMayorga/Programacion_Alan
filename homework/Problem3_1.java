/******************************************
*Alan Osvaldo Mayorga Vega
*Problem3_1.java
*This program calculates the sum of ten amounts
********************************************/
import javax.swing.JOptionPane;
public class Problem3_1
{
  public static void main(String[] args)
  {
    double numero, suma=0;
    int c=1;
    while (c<=10)
    {
      numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero " + c));
      suma += numero;
      c++;
    }
    JOptionPane.showMessageDialog(null, "La suma de los numero es: " + suma);
  }
}
