/**********************************************
* Alan Osvaldo Mayorga Vega
* Problem1_5.java
* This program determines the weekly salary of a worker
***********************************************/
import java.util.Scanner;
public class Problem1_6
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    double horasTrabajadas, pagoHora, sueldo = 0;
    System.out.println("Ingrese el pago por hora");
    pagoHora= sc.nextDouble();
    System.out.println("Ingrese las horas trabajadas");
    horasTrabajadas = sc.nextDouble();
    sueldo = horasTrabajadas*pagoHora;
    System.out.println("El sueldo a pagar por las horas trabajadas es: " + sueldo);
  }
}
