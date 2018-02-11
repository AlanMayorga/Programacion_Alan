/******************************************
*Alan Osvaldo Mayorga Vega
*Problem3_4.java
*This program calculates how many quantities are less than zero, hoy many are greater than zero and how many are zero
********************************************/
import javax.swing.JOptionPane;
public class Problem3_4
{
  public static void main(String[] args)
  {
    double numero;
    int mayorCero = 0, menorCero = 0, c = 1, cantidadNumeros;
    cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("Ingerse la cantidad de numeros a calcular"));
    do
    {
      numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero " + c));
      if (numero>0)
      {
        mayorCero += 1;
      }
      else if (numero<=0)
      {
        menorCero += 1;
      }
      c ++;
    }while(c<=cantidadNumeros);
    JOptionPane.showMessageDialog(null, "El total de numeros mayores a cero es: " + mayorCero + "\nEl total de numeros menores o iguales a cero es: " + menorCero);
  }
}
