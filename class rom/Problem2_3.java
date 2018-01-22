/**********************************************
* Alan Osvaldo Mayorga Vega
* Problem2_3.java
* This program compares how much should be paid for x amount of pencils
***********************************************/
import java.util.Scanner;
public class Problem2_3
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    int lapices = 0;
    double pago = 0;
    System.out.println("Ingrese la cantidad de lapices");
    lapices= sc.nextInt();
    if (lapices>=1000)
    {
      pago= lapices*0.85;
      System.out.println("El total a pagar por " + lapices + " lapices es: " + pago);
    }
    else
    pago= lapices*0.90;
    System.out.println("El total a pagar por " + lapices + " lapices es: " + pago);
  }
}
