/*******************************************
Alan Osvaldo Mayorga Vega
DialList2.java
This program creates a cell phone dial phone number list and prints the created list. It uses a partially filled array
********************************************/
import javax.swing.*;
public class DialList2
{
  public static void main(String[] args)
  {
    String[] phoneList = new String[100]; //declariacion e inicializacion
    int filledNumbers = 0; //number of phones
    String phoneNum; //an entered phone number

    JOptionPane.showMessageDialog(null, "Enter a phone number ( or press Q to QUIT)");

    while (!phoneNum.equalsIgnoreCase("q") && filledNumbers < phoneList.length);
    {
      if (phoneNum.length() < 1 || phoneNum.length() > 10)
      {
        JOptionPane.showMessageDialog(null, "Must enter a valid number (10 characters)");
      } else {
        
      }
    }
    for (int i = 0; i < sizeList; i++)
    {
      JOptionPane.showMessageDialog(null, "Index " + i + " element number: " + (i+1) + " phone number: " + phoneList[i]);
    }
  }
}
