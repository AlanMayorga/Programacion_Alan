/**********************************************
* Alan Osvaldo Mayorga Vega
* Problem2_10.java
* This program calculates how much the patient must pay for the appointment and the amount for the treatment
***********************************************/
import javax.swing.JOptionPane;
public class Problem2_10
{
  public static void main(String[] args)
  {
    int numeroConsultas;
    double costoConsulta, costoTratamiento;
    numeroConsultas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de consultas"));
    if (numeroConsultas<=3)
    {
      costoConsulta = 200;
      costoTratamiento = numeroConsultas*costoConsulta;
    }
    else if (numeroConsultas<=5)
    {
      costoConsulta = 150;
      costoTratamiento = (numeroConsultas-5)*costoConsulta+600;
    }
    else if (numeroConsultas<=8)
    {
      costoConsulta = 100;
      costoTratamiento = (numeroConsultas-5)*costoConsulta+900;
    }
    else
    {
      costoConsulta = 50;
      costoTratamiento = (numeroConsultas-8)*costoConsulta+1200;
    }
    JOptionPane.showMessageDialog(null, "El costo de la consulta es: " + costoConsulta + "\nEl monto pagado por el tratamiento es: " + costoTratamiento);
  }
}
