/****************************************************
Alan Osvaldo Mayorga Vega
PrintPurchaseOrder.java
This program calculates and prints a purchase order amount
*****************************************************/
import java.util.Scanner;
public class PrintPurchaseOrder
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    double price;
    int quantity;
    String name;
    System.out.println("Enter your name");
    name = sc.nextLine();
    System.out.println("Enter the price");
    price = sc.nextDouble();
    System.out.println("Enter the quantity");
    quantity = sc.nextInt();
    System.out.println("Hello " + name + " the total purchase order is $" + price * quantity);
  }
}
