/* 
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio1 {
  public static void main(String[] args) {
    System.out.println("Elija un día");
    System.out.println("1-Lunes");
    System.out.println("2-Martes");
    System.out.println("3-Miércoles");
    System.out.println("4-Jueves");
    System.out.println("5-Viernes");
    System.out.println("Introduzca un número del 1 al 5");
    
    int dia = Integer.parseInt(System.console().readLine());
    
    String horario;
     
    switch (dia) {
      case 1: 
        horario= "Los Lunes tienes programación";
        break;
      case 2:
        horario= "Los martes tienes sistemas informàticos";
        break;
      case 3:
        horario= "Los miércoles tienes programación";
        break;
      case 4:
        horario ="Los jueves tienes programación";
        break;
      case 5:
        horario="Los viernes tienes sistemas informàticos";
        break;
      default:
        horario = "Ese día no hay clase";
        break;
    }
    
    System.out.println("Día" + dia +":"+ horario);
  }
}
