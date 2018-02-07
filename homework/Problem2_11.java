/**********************************************
* Alan Osvaldo Mayorga Vega
* Problem2_11.java
* This program calculates the new credit limit that a person will have on their card
***********************************************/
import javax.swing.JOptionPane;
public class Problem2_11
{
  public static void main(String[] args)
  {
    int tipoTarjeta;
    double limiteActualCredito, aumentoCredito= 0, nuevoLimite = 0;
    tipoTarjeta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de tarjeta"));
    limiteActualCredito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el limite actual de la tarjeta"));
    switch (tipoTarjeta)
    {
      case 1:
      aumentoCredito = limiteActualCredito*0.25;
      break;

      case 2:
      aumentoCredito = limiteActualCredito*0.35;
      break;

      case 3:
      aumentoCredito = limiteActualCredito*0.40;

      default:
      aumentoCredito = limiteActualCredito*0.50;
      break;
    }//end switch
    nuevoLimite = limiteActualCredito+aumentoCredito;
    JOptionPane.showMessageDialog(null, "El aumento de credito es: " + aumentoCredito + "\nEl nuevo limite de credito es: " + nuevoLimite);
  }
}
