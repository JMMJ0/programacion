/*
*Hecho por Jose Manuel Moron Jurado
*/
 public class act08 {
  public static void main(String[] args) {
    int num;
    int cuadrado=0;
    
    do{
      System.out.print("Introduce un número para saber su cuadrado (0 para salir): ");
      num= Integer.parseInt(System.console().readLine());
      cuadrado=num*num;
      System.out.println("El cuadrado de "+num+ " es: " +cuadrado);
      
    }while(num !=0);
    System.out.print("Ha salido correctamente");
  } 
}
    
