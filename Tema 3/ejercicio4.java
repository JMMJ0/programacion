/* 
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio4{
  public static void main(String[] args) {
    System.out.println("Introduce un número");
    int primerNumero = Integer.parseInt( System.console().readLine() );
    System.out.print("Introduce otro número");
    int segundoNumero = Integer.parseInt( System.console().readLine() );
    
    int suma= primerNumero + segundoNumero;
    int resta= primerNumero + segundoNumero;
    int mult= primerNumero * segundoNumero;
    int div= primerNumero / segundoNumero;
    int r= primerNumero % segundoNumero;
    
   System.out.println("suma A+B= "+ suma);
   System.out.println("resta A-B= "+ resta);
   System.out.println("Muultiplicación A*B= "+ mult);
   System.out.println("División A/B= "+ div);
   System.out.println("resto A/B= "+ r);
  }
}
