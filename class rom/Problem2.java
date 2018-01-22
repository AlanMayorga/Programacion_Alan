/**********************************************
* Alan Osvaldo Mayorga Vega
* Problem2.java
* This program compares two numbers to determine which is greater
***********************************************/
import java.util.Scanner;
public class Problem2
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    double numero1, numero2, numeroMayor = 0;
    System.out.println("Ingrese el primer numero");
    numero1= sc.nextDouble();
    System.out.println("Ingrese el segundo numero");
    numero2= sc.nextDouble();
    if (numero1>numero2)
    {
      System.out.println("El numero mayor es: " + numero1);
    }
    else
    System.out.println("El numero mayor es: " + numero2);
  }
}
