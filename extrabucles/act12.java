/*
*Hecho por Jose Manuel Moron Jurado
*/
 public class act12 {
  public static void main(String[] args) {
    String palabra="";
    String resultado="";
    int contador =0;
    do {
      contador++;
      System.out.print("Introduce una palabra(escribe salir para terminar): ");
      palabra=System.console().readLine();
      if(!palabra.equals("salir")){
       resultado= palabra + " " + resultado ;
      }
    }
    while((!palabra.equals("salir")) && (contador<4));
      System.out.print("Tu frase es: " + resultado);
  }
}
