/*
*Hecho por Jose Manuel Moron Jurado
*/
 public class act10 {
  public static void main(String[] args) {
    String palabra="";
    String resultado="";
    
    while(!palabra.equals("salir")) {
      System.out.print("Introduce una palabra(escribe salir para terminar): ");
      palabra=System.console().readLine();
      if(!palabra.equals("salir")){
        resultado+= palabra ;
      }
    }
    System.out.print("Tu frase es: " + resultado);
  }
}
