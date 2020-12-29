public class T06N14{
	public static void main(String[] args){
		
		int base;
		int exponente;
		int potencia=1;
		
		
		System.out.print("Introduce una base: ");
		base=Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduce un exponente: ");
		exponente=Integer.parseInt(System.console().readLine());
		
		for(int i=0; i<exponente; i++){
			potencia*=base;
		}
		System.out.print(potencia);
	}
}
			
		
		
