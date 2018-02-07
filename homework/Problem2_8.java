/**********************************************
* Alan Osvaldo Mayorga Vega
* Problem2_8.java
* This program calculates how much should charge each student and how much you should pay the travel company for the service
***********************************************/
import javax.swing.JOptionPane;
public class Problem2_8
{
  public static void main(String[] args)
  {
    double pagoPorAlumno = 0, totalPagar = 0;
    int numeroAlumnos;
    numeroAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de alumnos"));
    if (numeroAlumnos>=100)
    {
      pagoPorAlumno = 65;
    }
    else if (numeroAlumnos>=50 && numeroAlumnos<=99)
    {
      pagoPorAlumno = 70;
    }
    else if (numeroAlumnos>=30 && numeroAlumnos<=49)
    {
      pagoPorAlumno = 95;
    }
    else if (numeroAlumnos<30)
    {
      pagoPorAlumno = 4000/numeroAlumnos;
    }
    totalPagar = pagoPorAlumno*numeroAlumnos;
    JOptionPane.showMessageDialog(null, "El pago por alumno es: " + pagoPorAlumno);
    JOptionPane.showMessageDialog(null, "El total a pagar es: " + totalPagar);
  }
}
