/* 
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio5 {
  public static void main(String[] args) {
    System.out.println("Este programa realiza la ecuación ax+b=0");
    System.out.print("Inserte el valor de a = ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.print("Inserte el valor de b = ");
    int b =Integer.parseInt(System.console().readLine());
    
    if(a==0){
      System.out.print("valor no válido");
    }else{
      System.out.print("x= " + (-b/a));
    }
  }
}
