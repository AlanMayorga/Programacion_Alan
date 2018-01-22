/**********************************************
* Alan Osvaldo Mayorga Vega
* Problem2_6.java
* This program determines the total to play for a dish depending on the number of people
***********************************************/
import java.util.Scanner;
public class Problem2_6
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    int numeroPersonas = 0;
    double pago = 0;
    System.out.println("Ingrese el numero de personas");
    numeroPersonas= sc.nextInt();
    if (numeroPersonas>200 && numeroPersonas<=300)
    {
      pago= numeroPersonas*85;
      System.out.println("El total a pagar es: " + pago);
    }
    if (numeroPersonas>300)
    {
      pago= numeroPersonas*75;
      System.out.println("El total a pagar es: " + pago);
    }
    else
    pago= numeroPersonas*95;
    System.out.println("El total a pagar es: " + pago);
  }
}
