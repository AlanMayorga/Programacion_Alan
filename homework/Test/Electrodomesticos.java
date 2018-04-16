import javax.swing.JOptionPane;
public class Electrodomesticos
{
   protected double precioBase = 100;
   protected String color = "Blanco";
   protected char consumoEnergetico = 'F';
   protected double peso = 5;

/*
   char[] letras = new char[6];
   letras[0] = 'a', letras[1] = 'b', letras[2] = 'c', letras[3] = 'd', letras[4] = 'e', letras[5] = 'f';
   char[] letras = {'a','b','c','d','e','f'};*/

   public Electrodomesticos(){
   }

   public Electrodomesticos(double precioBase, double peso)
   {
     this.precioBase = precioBase;
     this.peso = peso;
   }

   public Electrodomesticos(double precioBase, String color, char consumoEnergetico, double peso)
   {
     this.precioBase = precioBase;
     this.color = color;
     this.consumoEnergetico = consumoEnergetico;
     this.peso = peso;
   }

   public double getPrecioBase()
   {
     return this.precioBase;
   }

   public String getColor()
   {
     return this.color;
   }

   public char getConsumoEnergetico()
   {
     return this.consumoEnergetico;
   }

   public double getPeso()
   {
     return this.peso;
   }

   public void comprobarConsumoEnergetico(char letra)
   {
     /*for (int i = 0; i <= letras[].length; i++)
     {
       if (lerta == letras[i])
       {
          JOptionPane.showMessageDialog(null, "la letra " + letra + " es correcta");
          this.consumoEnergetico = letra;
       }else {
         JOptionPane.showMessageDialog(null, "La letra no es correcta se la asigna la letra 'F' por defecto");
         this.consumoEnergetico = 'f';
       }
     }*/
     if (letra != 'a' || letra != 'b' || letra != 'c' || letra != 'd' || letra != 'e' || letra != 'f')
     {
       JOptionPane.showMessageDialog(null, "La letra es correcta" + letra);
       this.consumoEnergetico = letra;
     }else
     JOptionPane.showMessageDialog(null, "La letra no es correcta se la asigna la letra 'F' por defecto");
     this.consumoEnergetico = 'f';
   }

   public void comprobarColor(String color)
   {
     if (color.equalsIgnoreCase("blaco") || color.equalsIgnoreCase("Negro") || color.equalsIgnoreCase("Rojo") || color.equalsIgnoreCase("Azul") || color.equalsIgnoreCase("Gris"))
     {
       JOptionPane.showMessageDialog(null, "El color es correcto"  + color);
       this.color = color;
     }
     else {
       JOptionPane.showMessageDialog(null, "El color es incorrecto se asignara el color 'Blanco' por defecto");
       this.color = "Blanco";
     }
   }

   public double precioFinal()
   {
     if (consumoEnergetico != 'a' || consumoEnergetico != 'A')
     {
       precioBase += 100;
     }
     else if (consumoEnergetico != 'b' || consumoEnergetico != 'B')
     {
       precioBase += 80;
     }
     else if (consumoEnergetico != 'c' || consumoEnergetico != 'C')
     {
       precioBase += 60;
     }
     else if (consumoEnergetico != 'd' || consumoEnergetico != 'D')
     {
       precioBase += 50;
     }
     else if (consumoEnergetico != 'e' || consumoEnergetico != 'E')
     {
       precioBase += 30;
     }
     else if (consumoEnergetico != 'f' || consumoEnergetico != 'F')
     {
       precioBase += 10;
     }
     JOptionPane.showMessageDialog(null, "El precio base aumento a " + precioBase + " segun la letra " + consumoEnergetico);
     if (peso >= 0 && peso <= 19)
     {
       precioBase += 10;
     }
     else if (peso >= 20 && peso <= 49)
     {
       precioBase += 50;
     }
     else if (peso >= 50 && peso <= 79)
     {
       precioBase += 80;
     }
     else if (peso > 80)
     {
       precioBase += 100;
     }
     JOptionPane.showMessageDialog(null, "El precio base aumento a " + precioBase + " segun su peso " + peso);
     return precioBase;
   }
}
