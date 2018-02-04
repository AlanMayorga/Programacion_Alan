/**********************************************
* Alan Osvaldo Mayorga Vega
* Problem2_9.java
* This program calculates how much a person making a call must pay for each concept
***********************************************/
import javax.swing.JOptionPane;
public class Problem2_9
{
  public static void main(String[] args)
  {
    double tiempo, pagoPorTiempo = 0, impuesto = 0, pagototal = 0;
    String dia, turno;
    tiempo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los minutos que duro la llamada"));
    dia = JOptionPane.showInputDialog("Ingerse el dia");
    turno = JOptionPane.showInputDialog("Ingese el turno");
    if (tiempo<=5)
    {
      pagoPorTiempo = tiempo*1;
    }
    else if (tiempo<=8)
    {
      pagoPorTiempo = (tiempo-5)*0.80+5;
    }
    else if (tiempo<=10)
    {
      pagoPorTiempo = (tiempo-8)*0.7+7.4;
    }
    else if (tiempo>=10)
    {
      pagoPorTiempo = (tiempo-9)*0.5+8.8;
    }
    if (dia=="domingo")
    {
      impuesto = pagoPorTiempo*0.05;
    }
    else if (turno=="matutino")
    {
      impuesto = pagoPorTiempo*0.15;
    }
    else if (turno=="vespertino")
    {
      impuesto = pagoPorTiempo*0.10;
    }
    pagototal = pagoPorTiempo+impuesto;
    JOptionPane.showMessageDialog(null, "El pago es: " + pagoPorTiempo + "\nEl impuestoes: " + impuesto + "\nEl total a pagar es: " + pagototal);
  }
}
