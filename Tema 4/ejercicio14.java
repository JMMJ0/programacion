/*
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio14  {
  public static void main(String[] args) {
    System.out.print("Introduzca un número: ");
    int numero =Integer.parseInt(System.console().readLine());
    
    if((numero%2)==0) {
      System.out.print("El número es par\n");
    }else{ 
      System.out.print("El número es impar\n");
    }
    
    if((numero%5)==0){
      System.out.print("El número es divisible por 5");
    }else{
      System.out.print("El número no es divisible por 5");
    }
  }
}
    
