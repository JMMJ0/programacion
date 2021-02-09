/*
 * EjercicioExamenPalotes.java
 * 
 * <@JMMJ>
 * 
 */



package LibreriaPalotes;

public class  ExamenPalotes{
  public static String SumaPalotes (String a, String b){
    int x, y;
    int parcial;
    String resultado;
    x = PalotesAux.PalotesAEntero(a);
    y = PalotesAux.PalotesAEntero(b);
    parcial = x + y;
    resultado = PalotesAux.EnteroAPalotes(parcial);
    return resultado;
  }
  
  public static String RestaPalotes (String a, String b){
    int x, y;
    int parcial;
    String resultado;
    x = PalotesAux.PalotesAEntero(a);
    y = PalotesAux.PalotesAEntero(b);
    parcial = x - y;
    parcial=(parcial<0)?-parcial:parcial;
    resultado = PalotesAux.EnteroAPalotes(parcial);
    return resultado;
  }
  public static String MultiplicaPalotes (String a, String b) {
    int x, y;
    int parcial;
    String resultado;
    x = PalotesAux.PalotesAEntero(a);
    y = PalotesAux.PalotesAEntero(b);
    parcial = x * y;
    resultado = PalotesAux.EnteroAPalotes(parcial);
    return resultado;
  }
  public static String CocientePalotes (String a, String b) {
    int x, y;
    int parcial;
    String resultado;
    x = PalotesAux.PalotesAEntero(a);
    y = PalotesAux.PalotesAEntero(b);
    parcial = x / y;
    resultado = PalotesAux.EnteroAPalotes(parcial);
    return resultado;
  }
  public static String RestoPalotes (String a, String b) {
    int x, y;
    int parcial;
    String resultado;
    x = PalotesAux. PalotesAEntero(a);
    y = PalotesAux. PalotesAEntero(b);
    parcial = x % y;
    resultado = PalotesAux.EnteroAPalotes(parcial);
    return resultado;
  }
}


