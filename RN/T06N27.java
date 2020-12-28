 /*
Hecho por José Manuel Morón Jurado
*/
public class T06N27 {
	public static void main(String[] args) {
	
		int num;
		int contador=0;
		int suma=0;
		
		System.out.print("Introduce un número: ");
		num=Integer.parseInt(System.console().readLine());
		for(int i=1; i<=num; i++){
			if(i%3==0){
				System.out.println("Los múltiplos de 3 son: "+i);
				suma +=i;
				contador++;
			}
		}	
		
		System.out.println("Total números: "+ contador);
		System.out.println("Suma de los múltiplos: "+ suma);
	}
}
