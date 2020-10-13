/* 
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio6 {
  final static double g = 9.81;
  public static void main(String[] args) {
    System.out.println("Este programa calcula el tiempo de caída de un objeto");
    System.out.print("Introduzca la altura = ");
    
    double h = Double.parseDouble(System.console().readLine());
    double s = Math.sqrt(2*h/g);
    System.out.print("El objeto tarda en caer "+s+" segundos");
  }
}
