/*
Hecho por Jose Manuel Moron Jurado
*/
 public class ejercicio11 {
  public static void main(String[] args) {
    int n1;
    int i;
    System.out.print("Introduce un número: ");
    n1 =Integer.parseInt(System.console().readLine());
      
    for (i=n1; i<n1 + 5 ; i++);
    int i1= i;
    int i2= i * i;
    int i3= i * i * i;
    
    System.out.printf("%3d %4d %5d\n",i1,i2,i3);
  }
}
    
