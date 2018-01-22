/**********************************************
* Alan Osvaldo Mayorga Vega
* Problem2_2.java
* This program compares teo numbers and determines if ti is positive or negative
***********************************************/
import java.util.Scanner;
public class Problem2_2
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    double numero = 0;
    System.out.println("Ingrese un numero");
    numero= sc.nextDouble();
    if (numero>0)
    {
      System.out.println("El numero es positivo");
    }
    else
    System.out.println("El numero es negativo");
  }
}
