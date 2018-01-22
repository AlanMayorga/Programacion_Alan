/**********************************************
* Alan Osvaldo Mayorga Vega
* Problem2_4.java
* This program determines how a person must play for buying a cut and how much is the discount
***********************************************/
import java.util.Scanner;
public class Problem2_4
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    double costoTraje, descuento, pago = 0;
    System.out.println("Ingrese el precio del traje");
    costoTraje= sc.nextDouble();
    if (costoTraje>2500)
    {
      descuento= costoTraje*0.85;
      System.out.println("El total a pagar con descuento es: " + pago);
    }
    else
    descuento= costoTraje*0.92;
    System.out.println("El total a pagar con descuento es: " + pago);
  }
}
