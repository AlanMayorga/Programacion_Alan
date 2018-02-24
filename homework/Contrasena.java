/*******************************************************
*Alan Osvaldo Mayorga Vega
*Contraseña.java
*
********************************************************/
public class Contrasena
{
  private int longitud = 8, contadorNumeros = 0, contadorMayusculas = 0, contadorMinusculas = 0;
  private String contrasena;

  public void setLongitud(int longitud)
  {
    this.longitud = longitud;
  }
  public int getLongitud()
  {
    return this.longitud;
  }

  public void setContrasena(String contrasena)
  {
    this.contrasena = contrasena;
  }
  public String getContrasena()
  {
    return this.contrasena;
  }

  public String getFuerte()
  {
    for (int i = 0; i <= contrasena.length(); i++)
    {
      if (Integer.valueOf(contrasena.charAt(i)) >= 65 && Integer.valueOf(contrasena.charAt(i)) <=90)
      {
        contadorMayusculas += 1;
      }//end if
      else if (Integer.valueOf(contrasena.charAt(i)) >= 97 && Integer.valueOf(contrasena.charAt(i)) <=122)
      {
        contadorMinusculas += 1;
      }
      else if (Integer.valueOf(contrasena.charAt(i)) >= 48 && Integer.valueOf(contrasena.charAt(i)) <= 53)
      {
        contadorNumeros += 1;
      }
    }//end for
    if (contadorMayusculas >= 2 && contadorMinusculas >= 1 && contadorNumeros >= 5)
    {
      return "La contrasena es Fuerte";
    }//end if
    else
    {
      return "La contrasena es Debil";
    }
  }//end boolean
}
