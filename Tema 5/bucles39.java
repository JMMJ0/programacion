/*
Hecho por José Manuel Morón Jurado
*/
public class bucles39{
  public static void main(String[] args) {
		int num;
		
		System.out.print("Introduzca un número entero positivo: ");
		num = Integer.parseInt(System.console().readLine());
		
		for (int i = 1; i<= num; i++) {
			int factorial = i;
			
			for (int j = 1; j < i; j++) {
				factorial *= j;
			}	
			System.out.println(i + "! = " + factorial);
		}
	}
}
