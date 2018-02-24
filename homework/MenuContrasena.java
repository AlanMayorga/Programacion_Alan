import javax.swing.*;
public class MenuContrasena
{
  public static void main(String[] args)
  {
    Contrasena ingresoContrasena = new Contrasena();
    ingresoContrasena.setContrasena(JOptionPane.showInputDialog("Ingrese la contrasena"));
    JOptionPane.showMessageDialog(null, ingresoContrasena.getFuerte());
  }
}
