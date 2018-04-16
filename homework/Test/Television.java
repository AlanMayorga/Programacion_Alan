public class Television extends Electrodomesticos
{
  private double resolucion = 20;
  private boolean sintonizadorTDT = false;

  public Television(){
  }

  public Television(double precioBase, double peso)
  {
    super(precioBase, peso);
  }

  public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT)
  {
    super(precioBase, color, consumoEnergetico, peso);
    this.resolucion = resolucion;
    this.sintonizadorTDT = sintonizadorTDT;
  }

  public double getResolucion()
  {
    return resolucion;
  }

  public boolean getSintonizadorTDT()
  {
    return sintonizadorTDT;
  }

  public double precioFinal()
  {
    double precio = super.precioFinal();
    if (resolucion > 40)
    {
      precio += precio*0.30;
    }
    if (sintonizadorTDT)
    {
      precio += 50;//euros
    }
    return precio;
  }
}
