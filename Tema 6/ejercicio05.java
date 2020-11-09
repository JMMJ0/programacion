/*
Hecho por José Manuel Morón Jurado
*/
public class ejercicio05 {
  public static void main(String[] args) {
    int maximo= 199;
    int minimo= 100;
    int suma= 0;
    int num;
    
    for(int i=0; i<50; i++){
      num=(int)(Math.random()*100)+100;
      System.out.print(num+" ");
      suma +=num;
      
      if(num>minimo){
        maximo=num;
      }
      
      if(num<maximo){
        minimo=num;
      }
    }
    System.out.println();
    System.out.println("El mayor número es: "+maximo);
    System.out.println("El menor número es: "+minimo);
    System.out.println("La media es: "+(suma/50));
  }
}
