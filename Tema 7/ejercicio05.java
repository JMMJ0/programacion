/*
Hecho por José Manuel Morón Jurado
*/
public class ejercicio05 {
  public static void main(String[] args) {
    
    
    int[] numero = new int[10];
    int maximo =0;
    int minimo =1000;
    int i;
    
    
    for (i = 0; i < 10; i++) {
      System.out.println("Introduce un número: ");
      numero[i] = Integer.parseInt(System.console().readLine());
      if (numero[i] < minimo) {
        minimo = numero[i];
      }
      if (numero[i] > maximo) {
        maximo = numero[i];
      }
      
      if (numero[i] == maximo) {
        System.out.print(" máximo");
      }
      if (numero[i] == minimo) {
        System.out.print(" mínimo");
      }
      System.out.println();
    }
  }
}
