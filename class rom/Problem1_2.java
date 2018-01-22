/**********************************************
* Alan Osvaldo Mayorga Vega
* Problem1.java
* This program calculates the area a circumference
***********************************************/
import java.util.Scanner;
public class Problem1_2
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    double area, radio=0, PI = 3.1416;
    System.out.println("Ingrese el radio: ");
    radio = sc.nextDouble();
    area = (radio*radio)*PI;
    System.out.println("El area es: " + area);
  }
}
