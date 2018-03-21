import javax.swing.*;
import java.util.ArrayList;
public class Bear
{
  private final String MAKER; //Bears's manufacturer
  private final String TYPE;//Type of bear

  public Bear(String maker, String type)
  {
    this.MAKER = maker;
    this.TYPE = type;
  }
  public void display()
  {
    JOptionPane.showMessageDialog(null, MAKER + " " + TYPE);
  }

  public static void main(String[] args)
  {
    ArrayList <Bear> teddyBearStore = new ArrayList <Bear> ();
    int opc;
    do
    {
      opc = Integer.parseInt(JOptionPane.showInputDialog(".....MENU..... \n1.- Add Beard \n2.- Search \n3.- Remove \n4.- Show all \n5.- Exit"));
      switch (opc)
      {
        case 1:
          String maker = JOptionPane.showInputDialog("Maker ?");
          String type = JOptionPane.showInputDialog("Type ?");
          Bear winniePoo = new Bear(maker, type);
          teddyBearStore.add(winniePoo);
        break;

        case 2:
          int index = Integer.parseInt(JOptionPane.showInputDialog("Index ?"));
          teddyBearStore.get(index);
          JOptionPane.showMessageDialog(null, teddyBearStore.get(index));
        break;

        case 3:
          index = Integer.parseInt(JOptionPane.showInputDialog("Index to remove ?"));
          if (teddyBearStore.remove(index) != null)
          {
            JOptionPane.showMessageDialog(null, "Element remove");
          } else
          JOptionPane.showMessageDialog(null, "Elenment wasn't remove");
        break;

        case 4:
          for (Bear bear : teddyBearStore)
          {
            bear.display();
          }
        break;

        case 5:
          JOptionPane.showMessageDialog(null, "GoodBye");
        break;

        default:
          JOptionPane.showMessageDialog(null, "Option dosen't valid");
        break;
      }//END switch
    } while (opc != 5);
  }
}
