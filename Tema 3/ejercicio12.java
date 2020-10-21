/* 
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio12 {
  public static void main(String[] args) {
    System.out.print("Introduce la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("¿Qué nota quieres sacar en el trimestre? ");
    double notaFinal = Double.parseDouble(System.console().readLine());
    
    double nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;
    
    System.out.println("Para tener un " + notaFinal + " necesitas sacar un " + nota2 + " en el examen.");
  }
}
