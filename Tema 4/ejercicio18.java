/*
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio18  {
  public static void main(String[] args) {
    int c, primera=0;
    System.out.print("Introduza un número entero: ");
    c=Integer.parseInt(System.console().readLine());
    
    
    if (c>= 10000){
      primera =(c/ 10000);
    }
    if (c>= 1000){
      primera =(c/ 1000);
    }
    if (c>= 100){
      primera =(c / 100);
    }
    if (c>= 10){
      primera =(c/ 10);
    }
    if (c>= 1){
      primera =c;
    }
    
    System.out.print("La primera cifra del número es: "+ primera);
  }
}
