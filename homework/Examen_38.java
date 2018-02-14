/********************************************************
*Alan Osvaldo Mayorga Vega
*Examen_38.java
*This program asks for two operands and an arithmetic sign according to the latter, the corresponding operation is performed
********************************************************/
import javax.swing.JOptionPane;
public class Examen_38
{
  public static void main(String[] args)
    {
      //Se declaran las variables
      double operando1;
      double operando2;
      double resultado=0;
      String operador;

      JOptionPane.showMessageDialog(null, "Ingrese 2 operandos y un signo de operacion \n* \n/ \n- \n+ \n^ \n%");

      //Pide los operadores y el signo de operacion
      operando1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el operando 1"));
      operador = JOptionPane.showInputDialog("Ingrese el signo de operacion");
      operando2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el operando 2"));

      //segun el signo de operacion se hara una accion
      switch (operador)
      {
        case "+":
        resultado = operando1+operando2;
        break;
        case "-":
        resultado = operando1-operando2;
        break;
        case "*":
        resultado = operando1*operando2;
        break;
        case "/":
        resultado = operando1/operando2;
        break;
        case "^":
        resultado = (int)Math.pow(operando1, operando2);
        break;
        case "%":
        resultado = operando1%operando2;
        break;
      }//fin switch
      JOptionPane.showMessageDialog(null, "Resultado:\n" + operando1 + " " + operador + " " + operando2 + " = " + resultado);
  }
}
