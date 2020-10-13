/* 
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio9  {
  public static void main(String[] args) {
    
  System.out.println("Introduce el valor de a ");
    double a= Double.parseDouble(System.console().readLine());
    System.out.println("Introduce el valor de b ");
    double b= Double.parseDouble(System.console().readLine());
    System.out.println("Introduce el valor de c ");
    double c= Double.parseDouble(System.console().readLine());
    
    double x,x2;
    double raiz = b*b - (4 * a * c);
    if(raiz<0){
      System.out.print("No tiene solución");
    }else{
    System.out.println("x = " + (-b + Math.sqrt(raiz))/(2 * a));
    System.out.println("x2 = " + (-b - Math.sqrt(raiz))/(2 * a));
   }
  }
}
