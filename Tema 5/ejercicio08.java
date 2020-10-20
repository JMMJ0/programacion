/*
Hecho por Jose Manuel Moron Jurado
*/
 public class ejercicio08 {
  public static void main(String[] args) {
    int n1;
    int n2;
    int r;
    
    
    System.out.printf("Ingrese el número que desea multiplicar: ");
    n1 =Integer.parseInt(System.console().readLine());
    System.out.printf("Ingrese el número de filas que desea: ");
    n2 =Integer.parseInt(System.console().readLine());
    
      for (int i=1; i<=n2;i++){
        
        r= n1*i;
        System.out.println("El resultado es: " + r);
      }
  }
}
