/* 
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio4 {
  public static void main(String[] args) {
    System.out.print("Inserte el número de horas trabajadas");
    int horas = Integer.parseInt(System.console().readLine());
    int salario;
    
    if (horas < 40) {
      salario = 12 * horas;
    } else {
      salario = (40 * 12) + ((horas- 40) * 16);
    }
    System.out.println("Su sueldo es de " + salario + " euros");
  }
}
