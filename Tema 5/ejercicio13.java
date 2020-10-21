/*
Hecho por Jose Manuel Moron Jurado
*/
 public class ejercicio13 {
  public static void main(String[] args) {
    int positivos=0;
    int negativos=0;
    
    System.out.print("Introduce 10 números: ");
    int n= Integer.parseInt(System.console().readLine());
    for (int i =1; 1<=10; i++){
      if(n<0){
        negativos++;
      }else{
        positivos++;
      }
    }
  } 
}
    
    
