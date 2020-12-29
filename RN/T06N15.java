public class T06N15{
	public static void main(String[] args){
		
		int base;
		int exponente;
		int potencia=1;
		int expo2;
		System.out.print("Introduce una base: ");
		base=Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduce un exponente: ");
		exponente= Integer.parseInt(System.console().readLine());
		
		for (int i = 1; i <= exponente; i++) {
			potencia = 1;
			expo2 = i;
			for (int j = 0; j < expo2; j++) {
				potencia *= base;
			}
			System.out.println(base + "^" + i + " = " + potencia);
		}
	}
}
