/* 
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio10 {
  public static void main(String[] args) {
    System.out.print("Introduzca el número de Mb: ");
    double mb = Double.parseDouble(System.console().readLine());
    System.out.println(mb + "Mb son " +  (mb * 1024) + "Kb.");
  }
}
