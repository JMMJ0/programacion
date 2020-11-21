 /*
Hecho por José Manuel Morón Jurado
*/
public class ejercicio07 {
  public static void main(String[] args) {
  
		int[] numero = new int[100];
		int i;


		for (i = 0; i < 100; i++) {
			numero[i] = (int)(Math.random() * 21);
			System.out.print(numero[i] + " ");
		}
			
		System.out.println();
		
		System.out.print("Introduzca un número de los que se han mostrado: ");
		int valor1 = Integer.parseInt(System.console().readLine());

		System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
		int valor2 = Integer.parseInt(System.console().readLine());

		System.out.println();

		for (i = 0; i < 100; i++){
			if (numero[i] == valor1) {
				numero[i] = valor2;
				System.out.print( "\"" + numero[i] + "\" ");
			} else {
			System.out.print(numero[i] + " ");
			}
		}
		System.out.println();
	}
}
	
