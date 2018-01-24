/****************************************************
Alan Osvaldo Mayorga Vega
PrintPurchaseOrderGui.java
This program calculates and prints a purchase order report
*****************************************************/
import javax.swing.JOptionPane;
public class PrintPurchaseOrderGui
{
  public static void main(String[] args)
  {
    double price; //price of purchase item
    int quantity; //number of items purchase
    String itemName; //name of purchase item

    itemName = JOptionPane.showInputDialog("Enter name of purchase item");
    price = Double.parseDouble(JOptionPane.showInputDialog("Enter price of one item"));
    quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity"));

    JOptionPane.showMessageDialog(null, "PURCHASE ORDERE: \n\n" + "Item: " + itemName + "\nPrice " + price + "\nQuantity " + quantity + "\nTotal $" + price*quantity);
  }//end main
}//end class PrintPurchaseOrderGui
