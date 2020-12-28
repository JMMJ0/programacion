 /*
Hecho por José Manuel Morón Jurado
*/
public class T06N32 {
	public static void main(String[] args) {
		long num;
		long vuelta=0;
		int contador=0;
		int suma=0;
		long pares=0;
		
		
		
		System.out.print("Introduzca una serie de números: ");
		num= Long.parseLong(System.console().readLine());
		
		while(num>0){
			vuelta=(vuelta*10) + (num%10);
			num /=10;
			contador++;
		}
		
		for(int i=0;i<contador;i++){
			if(((vuelta%10)%2)==0){
				suma+=(vuelta%10);
				pares=(pares*10)+(vuelta%10);
			}
			vuelta /=10;
		}
		System.out.println("Los números de pares son: "+ pares);
		System.out.print("La  suma de los números pares es: "+ suma);
	}
}
			
			
			
		
