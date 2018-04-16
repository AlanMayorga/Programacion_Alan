import javax.swing.JOptionPane;
public class Test
{
  public static void main(String[] args)
  {
    double precioTelevisores = 0;
    double precioLavadoras = 0;
    double sumaElectrodomesticos = 0;

    Electrodomesticos objetos[] = new Electrodomesticos[10];
    objetos[0] = new Television(4000,"Negro",'A',4,50,true);
    objetos[1] = new Lavadora(6000.0,"Blanco",'E',50,50);
    objetos[2] = new Electrodomesticos(700.3,"Rojo",'B',4);
    objetos[3] = new Television(3255,23);
    objetos[4] = new Lavadora(513.42,13);
    objetos[5] = new Electrodomesticos(431.0,513.42);
    objetos[6] = new Television();
    objetos[7] = new Lavadora();
    objetos[8] = new Electrodomesticos();
    objetos[9] = new Television(5353,"Gris",'D',45,50,false);

    for(int i=0; i<objetos.length; i++)
    {
        if(objetos[i] instanceof Electrodomesticos){
            sumaElectrodomesticos += objetos[i].precioFinal();
        }
        if(objetos[i] instanceof Lavadora){
            precioLavadoras += objetos[i].precioFinal();
        }
        if(objetos[i] instanceof Television){
            precioTelevisores += objetos[i].precioFinal();
        }
    }
    JOptionPane.showMessageDialog(null, "La suma del precio de los electrodomesticos es de: " + sumaElectrodomesticos + "\nLa suma del precio de las lavadoras es de: " + precioLavadoras + "\nLa suma del precio de las televisiones es de: " + precioTelevisores);
  }
}
