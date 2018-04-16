public class Lavadora extends Electrodomesticos
{
  private double carga = 5;

  public Lavadora(){
  }

  public Lavadora(double precioBase, double peso)
  {
    super(precioBase, peso);
  }

  public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga)
  {
    super(precioBase, color, consumoEnergetico, peso);
    this.carga = carga;
  }

  public double getCarga()
  {
    return carga;
  }

  public double precioFinal()
  {
    double precio = super.precioFinal();
    if (peso > 30)
    {
      precio += 50; //euros
    }
    return precio;
  }
}
