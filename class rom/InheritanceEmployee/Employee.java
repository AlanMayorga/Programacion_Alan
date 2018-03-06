import javax.swing.*;
public class Employee
{
  private String name;

  public Employee (String name)
  {
    this.name = name;
  }

  public double getPay()
  {
    return 0;
  }
  public void printPay(int date)
  {
    JOptionPane.showMessageDialog(null, "Hard code");
  }
}
