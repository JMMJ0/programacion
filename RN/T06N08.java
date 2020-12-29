public class T06N08 {
	public static void main(String[] args) {
	
		int num;
		int resultado;
		
		System.out.print("Introduce un numero para calcular su tabla de multiplicar: ");
		num=Integer.parseInt(System.console().readLine());

		for(int i=0;i<=10; i++){
			resultado=num*i;
			System.out.println(num+" x "+i+" = "+resultado);
		}
	}
}
		
			
		
		
	
