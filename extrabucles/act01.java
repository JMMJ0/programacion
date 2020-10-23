/*
Hecho por Jose Manuel Moron Jurado
*/
public class act01  {
  public static void main(String[] args) {
    int num;
    System.out.print("Introduce el nuḿero de números desados: ");
    num= Integer.parseInt(System.console().readLine());
    
    for(int i= 1; i<=num; i++){
      System.out.print(" " +i);
    }
  }
}
