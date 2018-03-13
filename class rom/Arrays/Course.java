import javax.swing.*;
public class Course
{
  private String courseName;
  private String[] students = new String[100];
  private int numbersOfStudents = 0;

  //Constructor
  public Course(String courseName)
  {
    this.courseName = courseName;
  }
  //Method to get the name of the course
  public String getCourseName()
  {
    return this.courseName;
  }
  //adds a new student to the course
  public void addStudent(String student)
  {
    students[numbersOfStudents] = student;
    numbersOfStudents ++;
  }
  //Returns the students for the course
  public String[] getStudents()
  {
    return this.students;
  }
  //Returns the number for the course
  public int getNumberOfStudents()
  {
    return this.numbersOfStudents;
  }
  //Drops a student from the course
  public void dropStudent(String student)
  {
    for (int i = 0; i < this.getNumberOfStudents(); i ++)
    {
      if (students[i].equalsIgnoreCase(student))
      {
        students[i] = null;
      }
    }
   }
/*
  public String dropStudent()
  {
    for (int i = 0; i < numbersOfStudents; i++)
    {
      JOptionPane.showMessageDialog(null, students[i]+ " " + (i));
    }
    JOptionPane.showMessageDialog(null, "Ingrese el numero de la persona que desee eliminar");
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero:"));
    students[numero] = "";
    return "Se ah eliminado" + students[numero];
  }
*/
  public static void main(String[] args)
  {
    Course coursito = new Course("course");
    int opc = 0; //variable del menu
    do
    {
      opc = Integer.parseInt(JOptionPane.showInputDialog(".....MENU.....\n1.- Create course\n2.- Add student\n3.- Show students\n4.- Drop student\n5.- Exit"));
      switch(opc)
      {
        case 1:
          String course = JOptionPane.showInputDialog("Course name ?");

        break;

        case 2:
          do
          {
            String name = JOptionPane.showInputDialog("Student name (or 'q' to exit)");
            if (name.charAt(0) != 'q')
            {
              coursito.addStudent(name);
            }
          } while ('q' != name.charAt(0));
        break;

        case 3:
          String[] students = coursito.getStudents();
          for (int i = 0; i < coursito.getNumberOfStudents(); i++)
          {
            output += "Student " + (i+1) + " " + students[i] + "\n";
          }
          JOptionPane.showMessageDialog(null, output);
        break;

        case 4:
          name = JOptionPane.showInputDialog("Student's name ?");
          coursito.dropStudent(name);
          JOptionPane.showMessageDialog(null, "The student was deleted");
        break;

        case 5:
          JOptionPane.showMessageDialog(null, "Bye see you take care have a nice day");
        break;

        default: JOptionPane.showMessageDialog(null, "Option doesn't exit");
      }
    }while(opc != 5);

    /*
    coursito.addStudent("Funalito");
    coursito.addStudent("Yamall");
    coursito.addStudent("Clon de sombra");

    JOptionPane.showMessageDialog(null, "Number of students " + coursito.getNumberOfStudents());
    JOptionPane.showMessageDialog(null, coursito.dropStudent());
    JOptionPane.showMessageDialog(null, coursito.getStudents());
    */
  }
}
