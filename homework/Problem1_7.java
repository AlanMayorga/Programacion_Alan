/**********************************************
* Alan Osvaldo Mayorga Vega
* Problem1_7.java
* This program converts meters into inches
***********************************************/
import java.util.Scanner;
public class Problem1_7
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    double pulgadas, metros = 0;
    System.out.println("Ingrese los metros a convertir");
    metros= sc.nextDouble();
    pulgadas=metros*0.0254;
    System.out.println("Los metros convertidos a pulgadas es: " + pulgadas);
  }
}
