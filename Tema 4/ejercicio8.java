/* 
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio8 {
  public static void main(String[] args) {
    System.out.println("Introduce la primera nota");
    double n1= Double.parseDouble(System.console().readLine());
    System.out.println("Introduce la segunda nota");
    double n2= Double.parseDouble(System.console().readLine());
    System.out.println("Introduce la tercera nota");
    double n3= Double.parseDouble(System.console().readLine());
    
    double media= (n1 + n2 + n3)/3;
    System.out.print("Tu nota media es de: " + media);
    
    if (media < 5) {
      System.out.print(" Insuficiente ");
    }
    if ((media >= 5) && (media < 6)) {
      System.out.print(" Suficiente ");
    }
    if ((media >= 6) && (media < 7)) {
      System.out.print(" Bien ");
    }
    if ((media >= 7) && (media < 9)) {
      System.out.print(" Notable ");
    }
    if (media >= 9) {
      System.out.print(" Sobresaliente ");
    }
  }
}

