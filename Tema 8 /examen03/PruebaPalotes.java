/*
 *PrubaPalotes.java
 * 
 * <@JMMJ>
 * 
 */


import LibreriaPalotes.ExamenPalotes;
import LibreriaPalotes.PalotesAux;

public class PruebaPalotes {
  public static void main (String[] args) {
    String a,b;
    System.out.println("Prueba de libreria palotes.");
    System.out.print("Introduce valor1 en formato palotes: ");
    a = System.console().readLine();
    
    System.out.print("Introduce valor2 en formato palotes: ");
    b = System.console().readLine();
    
    System.out.println(a + "=" +PalotesAux.PalotesAEntero(a));
    System.out.println(b + "=" +PalotesAux.PalotesAEntero(b));
    
    System.out.println("La suma es: "+ExamenPalotes.SumaPalotes(a,b));
    System.out.println("La resta es: "+ExamenPalotes.RestaPalotes(a,b));
    System.out.println("La multi es: "+ExamenPalotes.MultiplicaPalotes(a,b));
    System.out.println("El cociente entero es: "+ExamenPalotes.CocientePalotes(a,b));
    System.out.println("El resto es: "+ExamenPalotes.RestoPalotes(a,b));
    
  }
}

