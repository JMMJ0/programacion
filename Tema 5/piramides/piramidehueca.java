/*
Hecho por Jose Manuel Moron Jurado
*/
public class piramidehueca  {
  public static void main(String[] args) {
    int num;
    int i;
    System.out.print("Introduzca la altura deseada de la semi piramide: ");
    num= Integer.parseInt(System.console().readLine());
    
    for( i=0; i<=(num-1); i++){
      for(int j=1; j<=(num-i); j++){
        System.out.print(" ");
      }
      for(int k=1; k<=(i*2)-1; k++){
        if((k==1) || (k==(i*2)-1)){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for(int z=1 ; z<=(i*2)-1; z++){
      System.out.print("*");
    }
  }
}

