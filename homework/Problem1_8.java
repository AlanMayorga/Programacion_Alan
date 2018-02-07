/**********************************************
* Alan Osvaldo Mayorga Vega
* Problem1_8.java
* This program calculates the total to pay for filling a water pool
***********************************************/
import java.util.Scanner;
public class Problem1_8
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    double alturaAlberca, largoAlberca, anchoAlberca, costoMetroCubico, volumenAlberca, pago = 0;
    System.out.println("Ingrese la latura de la alberca");
    alturaAlberca= sc.nextDouble();
    System.out.println("Ingrese el largo de la alberca");
    largoAlberca= sc.nextDouble();
    System.out.println("Ingrese el ancho de la alberca");
    anchoAlberca= sc.nextDouble();
    System.out.println("Ingrese el costo de agua por metro cubico");
    costoMetroCubico= sc.nextDouble();
    volumenAlberca= (anchoAlberca*alturaAlberca*largoAlberca);
    pago= volumenAlberca*costoMetroCubico;
    System.out.println("El total a pagar es: " + pago);
  }
}
