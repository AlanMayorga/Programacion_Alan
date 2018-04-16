public class Videojuego implements Entregable
{
  private String title = "";
  private double estimatedHours = 10;
  private boolean entregado = false;
  private Strign category = "";
  private String company = "";

  public Videojuego (){
  }

  public Videojuego(String title, double estimatedHours)
  {
    this.title = title;
    this.estimatedHours = estimatedHours;
  }

  public Videojuego(String title, double estimatedHours, String category, Strign company)
  {
    this.title = title;
    this.estimatedHours = estimatedHours;
    this.category = category;
    this.company = company;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }
  public String getTitle()
  {
   return this.title;
  }

  public void setEstimatedHours(double estimatedHours)
  {
    this.estimatedHours = estimatedHours;
  }
  public double getEstimatedhours()
  {
    return this.estimatedHours;
  }

  public void setCategory(String category)
  {
    this.category = category;
  }
  public String getCategory()
  {
    return this.category;
  }

  public void setCompany(String company)
  {
    this.company = company;
  }
  public String getCompany()
  {
    return this.company;
  }

  public void entregar(boolean entregado)
  {
    entregado = true;
  }

  public void devolver(boolean entregado)
  {
    entregado = false;
  }

  public void isEntregado(boolean entregado)
  {
    return entregado;
  }
}
