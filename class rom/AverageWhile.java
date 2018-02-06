/********************************************************
*Alan Osvaldo Mayorga Vega
*AverageWhile.java
*This program calculates the average of ten grades
**********************************************************/
import javax.swing.JOptionPane;
public class AverageWhile
{
  public static void main(String[] args)
  {
    int counter = 1, totalStudents = 0;
    double score = 0, totalScore = 0, averageScore = 0;
    totalStudents = Integer.parseInt(JOptionPane.showInputDialog("Enter number of students"));
    while (counter <= totalStudents)
    {
      score = Double.parseDouble(JOptionPane.showInputDialog("Enter the score " + counter));
      totalScore += score;
      counter ++;
    }//end while
    averageScore = totalScore/totalStudents;
    JOptionPane.showMessageDialog(null, "The average is: " + averageScore);
  }
}
