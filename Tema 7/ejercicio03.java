/*
Hecho por José Manuel Morón Jurado
*/
public class ejercicio03 {
  public static void main(String[] args) {
  
    int[] n = new int[10];
    int i;
    
    
    for (i = 0; i < 10; i++) {
      System.out.println("Introduce un número: ");
      n[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("\nLos números  al revés, son: ");
    for (i = 9; i >= 0; i--) {
      System.out.print(n[i]+ " ");
    }
  }
}
