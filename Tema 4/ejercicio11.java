/* 
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio11  {
  public static void main(String[] args) {
    System.out.print("Introduce las horas : ");
    int horas =Integer.parseInt(System.console().readLine());
    System.out.print("Introduce los minutos : ");
    int minutos =Integer.parseInt(System.console().readLine());
    
    int segundosdia=(24*3600);
    
    int tiempoquefalta=(segundosdia-((horas*3600)+(minutos*60)));
    
    System.out.print("Faltan "+ tiempoquefalta +" segundos para que termine el día.");
  }
}
