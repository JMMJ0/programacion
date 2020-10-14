/*
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio13  {
  public static void main(String[] args) {
    System.out.print("Introduzca el primer número: ");
    int numero1=Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el segundo número: ");
    int numero2=Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el tercer número: ");
    int numero3=Integer.parseInt(System.console().readLine());
    
    int aux;
    
    if (numero1 > numero2) {
      aux = numero1;
      numero1 = numero2;
      numero2=aux;
    }
     if (numero2>numero3) {
       aux = numero2;
       numero2=numero3;
       numero3=aux;
     }
     if (numero1>numero2) {
       aux=numero1;
       numero1=numero2;
       numero2=aux;
     }
     System.out.print("Los números quedarían ordenados de manera que: "+ numero1 + numero2 + numero3);
    }
  }
