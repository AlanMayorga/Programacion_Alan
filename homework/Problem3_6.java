/*******************************************************************
*Alan Osvaldo Mayorga Vega
*Problem3_6.java
*this program determines the total hours an employee works and the salary that will be paid for the hours worked
********************************************************************/
import javax.swing.JOptionPane;
public class Problem3_6
{
  public static void main(String[] args)
  {
    double pagoHora = 0, sueldoSemanal = 0;
    int horasTotales = 0, horasDia;
    pagoHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el pago por hora"));
    for ( int i = 1; i<= 6; i++)
    {
      horasDia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas en el dia " + i));
      horasTotales += horasDia;
    }
    sueldoSemanal = horasTotales*pagoHora;
    JOptionPane.showMessageDialog(null, "El sueldo es: " + sueldoSemanal);
  }
}
