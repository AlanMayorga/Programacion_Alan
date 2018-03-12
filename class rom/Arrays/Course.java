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

  }

  public static void main(String[] args)
  {
    Course coursito = new Course("Programming");
    coursito.addStudent("Funalito");
    coursito.addStudent("Yamall");
    coursito.addStudent("Clon de sombra");

    JOptionPane.showMessageDialog(null, "Number of students " + coursito.getNumberOfStudents());
  }
}
