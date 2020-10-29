/*
Hecho por Jose Manuel Moron Jurado
*/
public class piramideA  {
  public static void main(String[] args) {
   int num;
    System.out.print("Introduzca la altura deseada de la semi piramide: ");
    num= Integer.parseInt(System.console().readLine());
    
    for(int i=1; i<=num; i++){
      for(int j=1; j<=(num-i); j++){
        System.out.print(" ");
      }
      for(int k=1; k<=(i*2)-1; k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
