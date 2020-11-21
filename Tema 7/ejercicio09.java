 /*
Hecho por José Manuel Morón Jurado
*/
public class ejercicio09 {
  public static void main(String[] args) {

	int[] numeros = new int[8];
	
    for(int i=0;i<8;i++){
      System.out.print("Introduzca 8 números: ");
      
      int num = Integer.parseInt(System.console().readLine());
      numeros[i] = num;
    }
    for( int i=0; i<8;i++){
      if( numeros[i]%2==0){
        System.out.print(numeros[i] + " par ");
      }else{
        System.out.print(numeros[i] + " impar ");
      }
    }
  }
}
