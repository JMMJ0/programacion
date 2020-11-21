 /*
Hecho por José Manuel Morón Jurado
*/
public class ejercicio13 {
  public static void main(String[] args) {
		
	  int[] num = new int[100];
		int max = 0;
		int min = 100;
		
		for (int i = 0; i < 100; i++) {
			num[i] = (int)(Math.random() * 501);
			if (num[i] < min) {
				min = num[i];
			}
			if (num[i] > max) {
				max = num[i];
			}
		}
		for (int elemento : num) {
			System.out.print(elemento + " ");
		}	
		
		System.out.print("\n\n¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
		int opcion = Integer.parseInt(System.console().readLine());
		int destacado;
		
		if (opcion == 1) {
			destacado = min;
		} else {
			destacado = max;
		}
		System.out.println();
		
		for (int elemento : num) {
			if (elemento == destacado) {
				System.out.print(" **" + elemento + "** ");
			} else {
				System.out.print(elemento + " ");
			}
		}
	}
}
		
		
		
		
		
		
