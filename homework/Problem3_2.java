/******************************************
*Alan Osvaldo Mayorga Vega
*Problem3_2.java
*This program calculates the average age of a group of N students
********************************************/
import javax.swing.JOptionPane;
public class Problem3_2
{
  public static void main(String[] args)
  {
    int edadAlumno, sumaEdades = 0, numeroAlumnos;
    double edadPromedio;
    numeroAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de alumnos"));
    for (int i = 1; i<=numeroAlumnos; i++)
    {
      edadAlumno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno " + i));
      sumaEdades += edadAlumno;
    }
    edadPromedio = sumaEdades/numeroAlumnos;
    JOptionPane.showMessageDialog(null, "La edad promedio del grupo es: " + edadPromedio);
  }
}
