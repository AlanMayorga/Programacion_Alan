import java.util.ArrayList;
import javax.swing.*;
public class TestArrayList
{
  public static void main(String[] args)
  {
    ArrayList cityList = new ArrayList();
    cityList.add("London");
    cityList.add("New york");
    cityList.add("Paris");

    JOptionPane.showMessageDialog(null, "List size: " + cityList.size());
    JOptionPane.showMessageDialog(null, "Is Miami in this list ?" + cityList.contains("Maimi"));
    JOptionPane.showMessageDialog(null, "");

  }
}
