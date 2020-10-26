/*
Hecho por Jose Manuel Moron Jurado
*/
public class act06  {
  public static void main(String[] args) {
    int num;
    System.out.print("Introduzca la altura deseada de la semi piramide: ");
    num= Integer.parseInt(System.console().readLine());
    
    
    for(int i = 1 ; i<=num; i++){
      
      for(int j= 1; j <= i ; j++){
        System.out.print(" "+i);
      }
      System.out.println(" ");
    }
    
    
    
    for(int i = num ; i>=1; i--){
      
      for(int j= num; j >= i ; j--){
        System.out.print(" "+i);
      }
      System.out.println(" ");
    }
    
    for(int i = 1 ; i<=num; i++){
      
      for(int j=1; j <= i ; j++){
        System.out.print(" "+j);
      }
      System.out.println(" ");
    }
  }
}
