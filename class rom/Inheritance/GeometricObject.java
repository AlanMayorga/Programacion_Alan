/****************************************************
*GeometricObject.java
*Alan Osvaldo Mayorga Vega
*This is a superclass
*****************************************************/
import java.util.Date;
public class GeometricObject
{
  private String color;
  private boolean filled; //rellenado
  private Date dateCreated; //Fecha de creacion

  //Methods
  public GeometricObject()
  {
    this.color = "Blue";
    this.filled = true;
    this.dateCreated = new Date();
  }
  public GeometricObject (String color, boolean filled)
  {
    this.color = color;
    this.filled = filled;
    this.dateCreated = new Date();
  }
  public String getColor()
  {
    return this.color;
  }
  public void setColor(String color)
  {
    this.color = color;
  }
  public boolean isFilled ()
  {
    return this.filled;
  }
  public void setFille(boolean filled)
  {
    this.filled = filled;
  }
  public Date getDateCreate()
  {
    return this.dateCreated;
  }
}
