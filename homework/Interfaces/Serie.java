public class Serie implements Entregable
{
  private Strign title = "";
  private int numberOfSeasons = 3;
  private boolean entregado = false;
  private String category = "";
  private String creator = "";

  public Serie(String title, String creator)
  {
    this.title = title;
    this.creator = creator;
  }

  public Serie(String title, int numberOfSeasons, String category, Strign creator)
  {
    this.title = title;
    this.numberOfSeasons = numberOfSeasons;
    this.category = category;
    this.creator = creator;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }
  public String getTitle()
  {
   return this.title;
  }

  public void setNumberOfSeasons(int numberOfSeasons)
  {
    this.numberOfSeasons = numberOfSeasons;
  }
  public int getNumnerOfSeasons()
  {
    return this.numberOfSeasons;
  }

  public void setCategory(String category)
  {
    this.category = category;
  }
  public String getCategory()
  {
    return this.category;
  }

  public void setCreator(String creator)
  {
    this.creator = creator;
  }
  public String getCreator()
  {
    return this.creator;
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
