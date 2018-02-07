/**********************************************
* Alan Osvaldo Mayorga Vega
* Problem1_5.java
* This program calculates how much money a milk salesman makes in a day
***********************************************/
import java.util.Scanner;
public class Problem1_5
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    double cantidadLitros, precioGalon, ganancia, cantidadGalones = 0;
    System.out.println("Ingrese la cantidad de litros producidos: ");
    cantidadLitros = sc.nextDouble();
    System.out.println("Ingrese el precio del galon:");
    precioGalon = sc.nextDouble();
    cantidadGalones = cantidadLitros/3.785;
    ganancia = precioGalon * cantidadGalones;
    System.out.println("La ganancia es: " + ganancia);
  }
}
