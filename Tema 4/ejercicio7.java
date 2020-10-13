/* 
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio7 {
  public static void main(String[] args) {
    System.out.println("Introduce la primera nota");
    double n1= Double.parseDouble(System.console().readLine());
    System.out.println("Introduce la segunda nota");
    double n2= Double.parseDouble(System.console().readLine());
    System.out.println("Introduce la tercera nota");
    double n3= Double.parseDouble(System.console().readLine());
    
    double media= (n1 + n2 + n3)/3;
    System.out.print("Tu nota media es de: " + media);
  }
}
