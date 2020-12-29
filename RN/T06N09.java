public class T06N09{
	public static void main(String[] args){
	
		int contador=1;
		int num;
		
		
		System.out.print("Introduzca un numero: ");
		num=Integer.parseInt(System.console().readLine());
		
		int aux;
		aux=num;
		
		while(aux>10){
			aux /=10;
			contador++;
		}
		System.out.print("El "+num+" tiene "+contador+" cifras");
	}
} 
		
