/*
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio17  {
  public static void main(String[] args) {
    System.out.print("Introduce un número");
    int numero=Integer.parseInt(System.console().readLine());
    int cifra=(numero % 10);
    System.out.print("La última cifra del número elegido es el: "+ cifra);
  }
}
