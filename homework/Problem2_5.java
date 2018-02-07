/**********************************************
* Alan Osvaldo Mayorga Vega
* Problem2_5.java
* This program determines the number grater than three number
***********************************************/
import java.util.Scanner;
public class Problem2_5
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    double numero1, numero2, numero3, numeroMayor = 0;
    System.out.println("Ingrese los tres numeros (dando enter entre cada uno)");
    numero1= sc.nextDouble();
    numero2= sc.nextDouble();
    numero3= sc.nextDouble();
    if (numero1>numero2 && numero1>numero3)
    {
      System.out.println("El numero mayor es: " + numero1);
    }
    if (numero2>numero1 && numero2>numero3)
    {
      System.out.println("El numero mayor es: " + numero2);
    }
    if (numero3>numero1 && numero3>numero2)
    {
      System.out.println("El numero mayor es: " + numero3);
    }
  }
}
