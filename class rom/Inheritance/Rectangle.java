public class Rectangle extends GeometricObject
{
  private double width;
  private double heigth;

  public Rectangle ()
  {

  }
  public Rectangle (double width, double heigth)
  {
    this.width = width;
    this.heigth = heigth;
  }
  public Rectangle (double width, double heigth, String color, boolean filled)
  {
    super (color, filled);
    this.width = width;
    this.heigth = heigth;
  }
  public double getWidth()
  {
    return this.width;
  }
  public void setWidth (double width)
  {
    this.width = width;
  }
  public double getHeigth()
  {
    return this.heigth;
  }
  public void setHeigth(double heigth)
  {
    this.heigth = heigth;
  }
  public double getArea()
  {
    return width * heigth;
  }
  public double getPerimeter()
  {
    return (width + heigth) * 2;
  }
}
