/*************************************************************
*Alan Osvaldo Mayorga Vega
*BMIOOPInplement.java
*
*************************************************************/
import javax.swing.*;
public class BMIOOPInplement
{
  public static void main(String[] args)
  {
    BMIOOP persona = new BMIOOP();
    int eleccion;
    do
    {
      eleccion = Integer.parseInt(JOptionPane.showInputDialog("1.- Set name \n2.- Set age \n3.- Set weigth \n4.- Set heigth \n5.- Calculate BMI \n6.- Evaluate BMI \n7.- Exit"));
      switch (eleccion)
      {
       case 1:
        persona.setName(JOptionPane.showInputDialog("Name ?"));
        JOptionPane.showMessageDialog(null, persona.getName());
       break;
       case 2:
        persona.setAge(Integer.parseInt(JOptionPane.showInputDialog("Age ?")));
        JOptionPane.showMessageDialog(null, persona.getAge());
       break;
       case 3:
        persona.setWeigth(Double.parseDouble(JOptionPane.showInputDialog("Enter your weigth")));
        JOptionPane.showMessageDialog(null, persona.getWeigth());
       break;
       case 4:
        persona.setHeigth(Double.parseDouble(JOptionPane.showInputDialog("Enter your heigth")));
        JOptionPane.showMessageDialog(null, persona.getHeigth());
       break;
       case 5:
        JOptionPane.showMessageDialog(null, "Calculando...");
        JOptionPane.showMessageDialog(null, persona.getBMI());
       break;
       case 6:
        JOptionPane.showMessageDialog(null, persona.getStatus());
       break;
      }
    }while (eleccion != 7);
  }
}
