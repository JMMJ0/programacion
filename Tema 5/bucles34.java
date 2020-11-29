 /*
Hecho por José Manuel Morón Jurado
*/
public class bucles34 {
	public static void main(String[] args) {
		long num;
		long num2;
		long vuelta1=0;
		long contador1=0;
		long vuelta2=0;
		long contador2=0;
		long pares=0;
		long impares=0;
	
		
		
		System.out.print("Introduce un número: ");
		num=Long.parseLong(System.console().readLine());
		
		System.out.print("Introduce otro número: ");
		num2=Long.parseLong(System.console().readLine());
		
		while(num>0){
			vuelta1=(vuelta1*10) + (num%10);
			num /=10;
			contador1++;
		}
		while(num2>0){
			vuelta2=(vuelta2*10) + (num2%10);
			num2 /=10;
			contador2++;
		}
		
		for(int i=0; i<contador1;i++){
			if(((vuelta1%10)%2)==0){
				pares= (pares*10) +(vuelta1%10);
			}else{
				impares= (impares*10)+(vuelta1%10);
			}
			vuelta1 /=10;
		}
		for(int i=0; i<contador2;i++){
			if(((vuelta2%10)%2)==0){
				pares=(pares*10)+(vuelta2%10);
			}else{
				impares=(impares*10)+(vuelta2%10);
			}
			vuelta2 /=10;
		}
		
		System.out.println("Los números pares son: "+ pares);
		System.out.print("Los números impares son: "+impares);
	}
}
	
		
		
			
			
				
			
		
		
			
			
		
		
