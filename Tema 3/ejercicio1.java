

/* 
Hecho por Jose Manuel Moron Jurado
*/



public class ejercicio1 {
  public static void main(String[] args) {
    System.out.println("Introduce un número");
    int primerNumero = Integer.parseInt( System.console().readLine() );
    System.out.print("Introduce otro número");
    int segundoNumero = Integer.parseInt( System.console().readLine() );
    
    int mult= primerNumero * segundoNumero;
    System.out.println("Multiplicación A*B= "+ mult);
    }
}
