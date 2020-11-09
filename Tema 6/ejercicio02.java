/*
Hecho por José Manuel Morón Jurado
*/
public class ejercicio02 {
  public static void main(String[] args) {
    
    String num="";
    String palo="";
    
    int numpalo=(int)(Math.random()*4)+1;

    switch (numpalo){
      case 1:
        palo= "diamantes";
        break;
      case 2:
        palo="corazones";
        break;
      case 3:
        palo="diamantes";
        break;
      case 4:
        palo="tréboles";
        break;
      default:
    }
    
    int numcarta=(int)(Math.random()*13)+1;
    switch (numcarta){
      case 1:
        num="As";
        break;
      case 11: 
        num="J";
        break;
      case 12:
        num="Q";
        break;
      case 13:
        num="K";
        break;
      default:
        num = String.valueOf(numcarta);
    }
    System.out.println(num+" de "+palo);
  }
}
      
      
        
    

    
    
