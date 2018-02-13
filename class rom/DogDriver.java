/*********************************************************
*Alan Osvaldo Mayorga Vega
*DogDriver.java
*This program creates dog objects and uses Dog class
**********************************************************/
import javax.swing.JOptionPane;
public class DogDriver
{
  public static void main(String[] args)
  {
    Dog fido;
    fido = new Dog();
    fido.setColor("black");
    fido.setEyeColor("gray");
    JOptionPane.showMessageDialog(null, fido.getColor());
    JOptionPane.showMessageDialog(null, fido.getEyeColor());
    fido.eat();
    fido.bark();
    fido.sleep();
    //------------------------------------------------------------------
    Dog fufi = new Dog();
    fufi.setColor("blak and blue");
    fufi.setEyeColor("purple");
    JOptionPane.showMessageDialog(null, "fufi's eyes color is: " + fufi.getEyeColor());
    fufi.sleep();
  }
}
