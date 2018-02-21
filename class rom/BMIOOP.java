/*******************************************************************
*Alan Osvaldo Mayorga Vega
*BMIOOP.java
*This class calculates the Body Mass Index
********************************************************************/
public class BMIOOP
{
  //properties - attributes
  private String name;
  private int age;
  private double weigth;
  private double heigth;
  private final double KILOGRAMS_PERPOUND = 0.45359237;
  private final double METERS_PER_INCH = 0.0254;

  //methods - action
  public void setName(String name)
  {
    this.name = name;
  }
  public String getName()
  {
    return this.name;
  }

  public void setAge(int age)
  {
    this.age = age;
  }
  public int getAge()
  {
    return this.age;
  }

  public void setWeigth(double weigth)
  {
    this.weigth = weigth;
  }
  public double getWeigth()
  {
    return this.weigth;
  }

  public void setHeigth(double heigth)
  {
    this.heigth = heigth;
  }
  public double getHeigth()
  {
    return this.heigth;
  }

  public double getBMI()
  {
    double bmi = this.weigth * KILOGRAMS_PERPOUND / (this.heigth * METERS_PER_INCH) * (this.heigth * METERS_PER_INCH);
    return Math.round(bmi * 100) / 100;
  }

  public String getStatus()
  {
    double bmi = getBMI();
    if (bmi<16)
    {
      return "You are seriously underweight";
    }//end if
    else if (bmi<18)
    {
      return "You are underweight";
    }//end else if
    else if (bmi<24)
    {
      return "You are normal weight";
    }//end else if
    else if (bmi<29)
    {
      return "You are overweight";
    }//end else if
    else if (bmi<35)
    {
      return "You are seriously overweight";
    }//end else if
    else
    {
      return "You are gravely overweight";
    }//end else
  }
}
