/*******************************************************
*Alan Osvaldo Mayora Vega
*DaysInAMonth.java
*This Program finds the number of days in a month
*******************************************************/
import javax.swing.JOptionPane;
public class DaysInAMonth
{
  public static void main(String[] args)
  {
    int numberOfDaysInAMonth = 0;
    String monthOfYear;
    monthOfYear = JOptionPane.showInputDialog("Enter your month");
    switch (monthOfYear)
    {
      case "January":
      numberOfDaysInAMonth = 31;
      break;
      case "February":
      numberOfDaysInAMonth = 28;
      break;
      case "March":
      numberOfDaysInAMonth = 31;
      break;
      case "April":
      numberOfDaysInAMonth = 28;
      break;
      case "May":
      numberOfDaysInAMonth = 31;
      break;
      case "June":
      numberOfDaysInAMonth = 28;
      break;
      case "July":
      numberOfDaysInAMonth = 31;
      break;
      case "Agoust":
      numberOfDaysInAMonth = 28;
      break;
    }
  }
}
