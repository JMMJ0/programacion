/*
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio07 {
  public static void main(String[] args) {
    int num;
    int contador= 4;
    do{
      System.out.print("Introduzca la contraseña (4 cifras): ");
      num= Integer.parseInt(System.console().readLine());
      if(num == 1234){
        System.out.println("Contraseña aceptada");
      }else{
        System.out.println("La contraseña que ha introducido es incorrecta");
      }
      contador--;
    }
    while((num!= 1234) && (contador>0));
  }
}
    
    
