/**********************************************
* Alan Osvaldo Mayorga Vega
* Problem1.java
* This program calculates the area a rectangle
***********************************************/
import java.util.Scanner;
public class Problem1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    double area, base, altura = 0;
    System.out.println("Ingrese la base: ");
    base=sc.nextDouble();
    System.out.println("Ingrese la altura: ");
    altura=sc.nextDouble();
    area=(base*altura)/2;
    System.out.println("El area es: " + area);
  }
}
