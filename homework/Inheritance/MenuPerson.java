import javax.swing.JOptionPane;
public class MenuPerson
{
  public static void main(String[] args)
  {
    String name = "";
    int age = 0;
    String gender = "H";
    float weight = 0;
    float height = 0;

    name = JOptionPane.showInputDialog("Ingrese su nombre");
    age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
    gender = JOptionPane.showInputDialog("Ingrese su genero (H = Hombre / M = Mujer)");
    weight = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su peso"));
    height = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su altura"));
    Person persona1 = new Person(name, age, gender, weight, height);
    JOptionPane.showMessageDialog(null, persona1.mostrarDatos());

    name = JOptionPane.showInputDialog("Ingrese su nombre");
    age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
    gender = JOptionPane.showInputDialog("Ingrese su genero (H = Hombre / M = Mujer)");
    Person persona2 = new Person(name, age, gender);
    JOptionPane.showMessageDialog(null, persona2.mostrarDatos());
  }
}
