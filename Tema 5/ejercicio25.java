/*
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio25 {
  public static void main(String[] args) {
    int num;
    int resultado= 0;
    System.out.print("Introduzca un número para escribirlo al revés: ");
      num= Integer.parseInt(System.console().readLine());
   
    do{
      resultado = (resultado * 10) + (num % 10);
      num= num/10;

    }
    while(num >0);
    System.out.print(resultado);
  }
}
    
     
    
      
    
