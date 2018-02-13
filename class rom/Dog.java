/********************************************************************
*Alan Osvaldo Mayorga Vega
*Dog.java
*This class sets the dog's properties and methods
*********************************************************************/
import javax.swing.*;
public class Dog
{
  //Dog's properties - variables
  private String color;
  private String eyeColor;
  private double heigth;
  private double length;
  private double weigth;

  /* Metodo tipo de dato GET = obtener
  metodo void SET = establecer */

  //sets the dog's color
  public void setColor(String dogColor)
  {
    color = dogColor;
  }
  //gets the dog's color
  public String getColor()
  {
    return color;
  }

  public void setEyeColor(String dogEyeColor)
  {
    eyeColor = dogEyeColor;
  }
  public String getEyeColor()
  {
    return eyeColor;
  }

  public void setHeigth(Double dogHeigth)
  {
    heigth = dogHeigth;
  }
  public Double getHeigth()
  {
    return heigth;
  }

  public void setLength(Double dogLength)
  {
    length = dogLength;
  }
  public Double getLength()
  {
    return length;
  }

  public void setWeigth(Double dogWeigth)
  {
    weigth = dogWeigth;
  }
  public Double getWeigth()
  {
    return weigth;
  }

  //Dog's methods - action
  public void sit()
  {
    JOptionPane.showMessageDialog(null, "The dog is sat");
  }
  public void bark()
  {
    JOptionPane.showMessageDialog(null, "The dog is barking");
  }
  public void layDown()
  {
    JOptionPane.showMessageDialog(null, "The dog is laid down");
  }
  public void eat()
  {
    JOptionPane.showMessageDialog(null, "The dog is eating");
  }
  public void sleep()
  {
    JOptionPane.showMessageDialog(null, "The god is sleeping");
  }
}
