public class Person
{
  private String name = "";
  private int age = 0;
  private String gender = "H";
  private float weight = 0;
  private float height = 0;
  private String addres;

  public Person ()
  {
  }
  public Person (String name, int age, String gender)
  {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  public Person (String name, int age, String gender, float weight, float height)
  {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.weight = weight;
    this.height = height;
  }

  public String getMayorDeEdad()
  {
    if (age >= 18)
    {
      return "Es mayor de edad";
    }
    else
    {
      return "No es mayor de edad";
    }
  }

  public double getBMI()
  {
    double bmi = this.weight / (Math.pow(height, 2));
    return bmi;
  }

  public String getCalculateBMI()
  {
    double bmi = getBMI();
    if (bmi < 20)
    {
      return "-1";
    }//end if
    else if (bmi >= 20 && bmi <= 25)
    {
      return "0";
    }//end else if
    else if (bmi > 25)
    {
      return "1";
    }//end else if
    else
    {
      return "NO SE PUDO CALCULAR";
    }
  }

  public String mostrarDatos()
  {
    return "Nombre: " + name + "\nEdad: " + age + "\nGenero: " + gender + "\nPeso: " + weight + "\nEstarura: " + height + "\nBMI: " + getCalculateBMI() + "\n" + getMayorDeEdad();
  }
}
