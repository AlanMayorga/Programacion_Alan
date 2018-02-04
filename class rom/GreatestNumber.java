/*************************************************
*Alan Osvaldo Mayorga Vega
*GreatestNumber.java
*This Program finds the greatest of three numbers
**************************************************/
import javax.swing.JOptionPane;
public class GreatestNumber
{
  public static void main(String[] args)
  {
    double numberOne, numberTwo, numberThree;
    numberOne = Double.parseDouble(JOptionPane.showInputDialog("Enter the firts number"));
    numberTwo = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number"));
    numberThree = Double.parseDouble(JOptionPane.showInputDialog("Enter the third number"));
/*    if (numberOne>numberTwo)
    {
      if (numberOne>numberThree)
      {
        JOptionPane.showMessageDialog(null, "The greatest number is " + numberOne);
      }
    }
    if (numberTwo>numberOne)
    {
      if (numberTwo>numberThree)
      {
        JOptionPane.showMessageDialog(null, "The greatest number is " + numberTwo);
      }//end if
    }//end if
    if (numberThree>numberTwo)
    {
      if (numberThree>numberOne)
      {
        JOptionPane.showMessageDialog(null, "The greatest number is " + numberThree);
      }end if
    }//end if*/
    if (numberOne>numberTwo && numberOne>numberThree)
    {
      JOptionPane.showMessageDialog(null, "The greatest number is " + numberOne);
    }//end if
    else if (numberTwo>numberOne && numberTwo>numberThree)
    {
      JOptionPane.showMessageDialog(null, "The greatest number is " + numberTwo);
    }//end else if
    else if (numberThree>numberOne && numberThree>numberTwo)
    {
      JOptionPane.showMessageDialog(null, "The greatest number is " + numberThree);
    }//end else if
    else
    {
      JOptionPane.showMessageDialog(null, "Enter a correct number");
    }
  }
}
