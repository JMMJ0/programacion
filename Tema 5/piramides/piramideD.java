/*
Hecho por Jose Manuel Moron Jurado
*/
public class piramideD  {
  public static void main(String[] args) {
    int num;
    System.out.print("Introduzca la altura deseada de la semi piramide: ");
    num= Integer.parseInt(System.console().readLine());
    
    
    for(int i = 1 ; i<=num; i++){
      
      for(int j= 1; j <= i ; j++){
        System.out.print("*");
      }
      System.out.println(" ");
    }
    
    for(int i =(num-1); i>=1; i--){
      
      for(int j= 1; j <= i ; j++){
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}
