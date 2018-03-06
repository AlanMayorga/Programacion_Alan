import javax.swing.*;
public class Payroll
{
  public static void main(String[] args)
  {
    String name = JOptionPane.showInputDialog("Salaried's name");
    Double salary = Double.parseDouble(JOptionPane.showInputDialog("Salaried's salary"));

    Employee sasuke = new Salaried (name, salary);
    JOptionPane.showMessageDialog(null, sasuke.getPay());

    name = JOptionPane.showInputDialog("Salaried's name");
    Double hours = Double.parseDouble(JOptionPane.showInputDialog("Hours worked"));
    Employee sakura = new Hourly(name, hours);
    JOptionPane.showMessageDialog(null, "Sakura's pay " + sakura.getPay());

    //Commissioned
    Commission shikamaru = new Commissioned("shikamaru");
    shikamaru.addSales(550);
    shikamaru.addSales(1250);
  }
}
