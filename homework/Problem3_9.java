/*******************************************************************
*Alan Osvaldo Mayorga Vega
*Problem3_9.java
*this program calculates the weekly salary of N workers and how much did the company for the N employees
********************************************************************/
import javax.swing.JOptionPane;
public class Problem3_9
{
  public static void main(String[] args)
  {
    double pagoHora, pagoEmpleado = 0, pagoGlobal = 0;
    int numeroEmpleados, horasTrabajadasSemanal;
    numeroEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleados a calcular"));
    for ( int i = 1; i<=numeroEmpleados; i++)
    {
      pagoHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el pago por hora"));
      horasTrabajadasSemanal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas en al semana"));
      pagoEmpleado = pagoHora*horasTrabajadasSemanal;
      JOptionPane.showMessageDialog(null, "El pago al empleado " + i + " es: $" + pagoEmpleado);
      pagoGlobal += pagoEmpleado;
    }
    JOptionPane.showMessageDialog(null, "El total pagado a las empleados es: $" + pagoGlobal);
  }
}
