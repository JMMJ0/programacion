/*
Hecho por Jose Manuel Moron Jurado
*/
public class act02  {
  public static void main(String[] args) {
    int start;
    int num;
    System.out.print("Introduzca el por el cual desea comenzar: ");
    start= Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el número de datos que desea que aparezcan: ");
    num= Integer.parseInt(System.console().readLine());
    
    for(int i=start; i<=(start+num); i++) {
      
      System.out.print(" " + i);
    }
  }
}
    
