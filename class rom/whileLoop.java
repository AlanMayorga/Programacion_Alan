/***************************************************
*Alan Osvaldo Mayorga Vega
*whileLoop.java
*This program makes entres in a bridal registry
***************************************************/
import javax.swing.JOptionPane;
public class whileLoop
{
  public static void main(String[] args)
  {
    String registry = "";
    char more;
    more = JOptionPane.showInputDialog("Do you want to create a briday registry? (y/n)").charAt(0);
    while (more=='y')
    {
      registry += JOptionPane.showInputDialog("Enter item:");
      registry += JOptionPane.showInputDialog("Enter store: \n");
      more = JOptionPane.showInputDialog("any more items? (y/n)").charAt(0);
    }//end while
    if (!registry.equals(""))
    {
      JOptionPane.showMessageDialog(null, "\nBridal registry\n" + registry);
    }
  }
}
