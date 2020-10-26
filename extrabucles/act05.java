/*
Hecho por Jose Manuel Moron Jurado
*/
public class act05  {
  public static void main(String[] args) {
    int num;
    System.out.print("Introduzca la altura deseada de la semi piramide: ");
    num= Integer.parseInt(System.console().readLine());
  
    for(int i = 1 ; i<=num; i++){
      
      for(int j= 1; j <= i ; j++){
        System.out.print(" ");
      }
      System.out.println(i);
    }
    
    for(int i = 1 ; i<=num; i++){
      
      for(int j= 1; j<=i ; j++){
        System.out.print(" ");
      }
      for(int k= 1; k<=i; k++){
        System.out.print(k);
      }
      System.out.println();
    }
    
    for(int i =1 ; i<=num; i++){
      
      for(int j= 1; j<=i ; j++){
        System.out.print(" ");
      }
      for(int k= num; k>(num - i); k--){
        System.out.print(k);
      }
      System.out.println();
    }
  }
}
