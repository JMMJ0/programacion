public class T06N10{
	public static void main(String[] args){
		
		double num;
		double suma=0;
		double contador=0;
		double resultado;
		
		do{
			System.out.print("Introduce un numero: ");
			num=Double.parseDouble(System.console().readLine());
			if(num>=0){
				contador++;
				suma +=num;
			}else{
				System.out.println("Ha salido con exito");
			}
		}while(num>=0);
		resultado=suma/contador;

		System.out.print("La media es: "+ resultado);
	}
}
		
		
		
