/**********************************************
* Alan Osvaldo Mayorga Vega
* Problem1_3.java
* This program calculates the area a plot
***********************************************/
import java.util.Scanner;
public class Problem1_3
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    double base, alturaUnidos, alturaRectangulo, areaTriangulo, areaRectangulo, area = 0;
    System.out.println("Ingrese la base del terreno");
    base = sc.nextDouble();
    System.out.println("Ingrese la altura del terreno");
    alturaUnidos = sc.nextDouble();
    System.out.println("Ingrese la altura del rectangulo");
    alturaRectangulo = sc.nextDouble();
    areaTriangulo=(base*(alturaUnidos-alturaRectangulo))/2;
    areaRectangulo=base*alturaRectangulo;
    area=areaTriangulo+areaRectangulo;
    System.out.println("El area del terreno es: " + area);
  }
}
