/*
Hecho por José Manuel Morón Jurado
*/
public class bucles40{
  public static void main(String[] args) {
		
		long num;
		int pares = 0;
		int impares = 0;
		
		
		System.out.print(" introduzca un número entero positivo: ");
		num = Long.parseLong(System.console().readLine());
		
		long n = num;
		
		while (n > 0) {
			if ((n % 10) % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			n /= 10;
		}
		System.out.print("El número de pares es: "+ pares);
		System.out.print("El número de impares es: "+ impares);
		
	}
}
			
