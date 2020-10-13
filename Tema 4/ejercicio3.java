/* 
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio3 {
  public static void main(String[] args) {
    System.out.println("Elija un número y te diré a que día corresponde");
    
    
    int numero = Integer.parseInt(System.console().readLine());
    
    String dia;
     
    switch (numero) {
      case 1: 
        dia= " Lunes";
        break;
      case 2:
        dia= " Martes ";
        break;
      case 3:
        dia= " Miércoles";
        break;
      case 4:
        dia ="Jueves ";
        break;
      case 5:
        dia=" Viernes";
        break;
      case 6:
        dia= "Sábado";
        break;
      case 7:
        dia="Domingo";
        break;
      default:
        dia = "Solo hay 7 días en la semana";
        break;
    }
    
    System.out.println("Día" + numero+":"+ dia);
  }
}
