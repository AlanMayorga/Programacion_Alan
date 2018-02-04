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
      int anActual;
      double anBisiesto = 0;
      anActual = Integer.parseInt(JOptionPane.showInputDialog("Enter the current year"));
      anBisiesto = anActual%4;
      if (anBisiesto==0)
      {
        numberOfDaysInAMonth = 29;
      }
      else
      numberOfDaysInAMonth = 28;
      break;
      case "March":
      numberOfDaysInAMonth = 31;
      break;
      case "April":
      numberOfDaysInAMonth = 30;
      break;
      case "May":
      numberOfDaysInAMonth = 31;
      break;
      case "June":
      numberOfDaysInAMonth = 30;
      break;
      case "July":
      numberOfDaysInAMonth = 31;
      break;
      case "August":
      numberOfDaysInAMonth = 31;
      break;
      case "September":
      numberOfDaysInAMonth = 30;
      break;
      case "October":
      numberOfDaysInAMonth = 31;
      break;
      case "November":
      numberOfDaysInAMonth = 30;
      break;
      case "December":
      numberOfDaysInAMonth = 31;
      break;
    }//end switch
    JOptionPane.showMessageDialog(null, "The number of days is: " + numberOfDaysInAMonth);
  }
}
