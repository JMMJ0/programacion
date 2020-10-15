/*
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio15  {
  public static void main(String[] args) {
    System.out.print("Introduce el relleno de la pirámide");
    String a= System.console().readLine();
    
    System.out.println("Elige un número el cual indica la dirección de la pirámide");
    System.out.println("1- Hacia arriba");
    System.out.println("2- Hacia abajo");
    System.out.println("3- Hacia la derecha");
    System.out.println("4- Hacia la izquierda");
    
    int opcion=Integer.parseInt(System.console().readLine());
    
    switch(opcion) {
      case 1:
        System.out.println("  "+ a);
        System.out.println(" "+ a + a + a);
        System.out.println(a + a + a + a);
        break;
      case 2:
        System.out.println(a + a + a + a);
        System.out.println(" "+ a + a + a);
        System.out.println("  "+ a);
        break;
      case 3:
        System.out.println("   " + a);
        System.out.println("  " + a + " " + a);
        System.out.println(" " + a + " " + a);
        System.out.println("   " + a);
        break;
      case 4:
      System.out.println(a);
      System.out.println(a + " " + a);
      System.out.println(a + " " + a + " " +a);
      System.out.println(a + " " + a);
      System.out.println(a);
      break;
    default:
    }
  } 
}
      
        
