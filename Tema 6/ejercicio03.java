/*
Hecho por José Manuel Morón Jurado
*/
public class ejercicio03 {
  public static void main(String[] args) {
    
    String num="";
    String palo="";
    
    int numpalo=(int)(Math.random()*4)+1;

    switch (numpalo){
      case 1:
        palo= "oros";
        break;
      case 2:
        palo="copas";
        break;
      case 3:
        palo="bastos";
        break;
      case 4:
        palo="espadas";
        break;
      default:
    }
    
    int numcarta=(int)(Math.random()*13)+1;
    switch (numcarta){
      case 1:
        num="As";
        break;
      case 11: 
        num="Sota";
        break;
      case 12:
        num="Caballo";
        break;
      case 13:
        num="Rey";
        break;
      default:
        num = String.valueOf(numcarta);
    }
    System.out.println(num+" de "+palo);
  }
}
      
      
        
    
