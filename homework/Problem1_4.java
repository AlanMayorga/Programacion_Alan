/**********************************************
* Alan Osvaldo Mayorga Vega
* Problem1_4.java
* This program calculates the area three figures
***********************************************/
import java.util.Scanner;
public class Problem1_4
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    double radio, hipotenusaTrianguloRectangulo, catetoFlotante, areaTriangular, areaCircular, area = 0, PI=3.1416;
    System.out.println("Ingrese la base del triangulo rectangulo(es igual al radio):");
    radio = sc.nextDouble();
    System.out.println("Ingrese la hipotenusa del triangulo rectangulo");
    hipotenusaTrianguloRectangulo=sc.nextDouble();
    catetoFlotante = raiz((hipotenusaTrianguloRectangulo*hipotenusaTrianguloRectangulo)-(radio*radio));
    areaTriangular=2*(radio*catetoFlotante)/2
    areaCircular=(PI*radio*radio)/2;
    area=areaTriangular+areaCircular;
    System.out.println("El area es: " + area);
  }
}
