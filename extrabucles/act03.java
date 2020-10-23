/*
Hecho por Jose Manuel Moron Jurado
*/
public class act03  {
  public static void main(String[] args) {
    int start;
    int num;
    int salto;
    System.out.print("Introduzca el por el cual desea comenzar: ");
    start= Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el número de datos que desea que aparezcan: ");
    num= Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el número en el cual quiere que salten los números: ");
    salto= Integer.parseInt(System.console().readLine());
    
    for(int i=start; i<=(start+num); i+=salto) {
      
      System.out.print(" " + i);
    }
  }
}
    
