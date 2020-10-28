/*
*Hecho por Jose Manuel Moron Jurado
*/
 public class act11 {
  public static void main(String[] args) {
    String palabra="";
    String resultado="";
    
    while(!palabra.equals("salir")) {
      System.out.print("Introduce una palabra(escribe salir para terminar): ");
      palabra=System.console().readLine();
      if(!palabra.equals("salir")){
       resultado= palabra + " " + resultado ;
      }
    }
    System.out.print("Tu frase es: " + resultado);
  }
}
