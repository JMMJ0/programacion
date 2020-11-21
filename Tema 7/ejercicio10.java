 /*
Hecho por José Manuel Morón Jurado
*/
public class ejercicio10 {
  public static void main(String[] args) {
		int[] num = new int[20];
		int[] par = new int[20];
		int[] impar = new int[20];
		int i;
		int pares = 0;
		int impares = 0;
		for (i = 0; i < 20; i++) {
			num[i] = (int)(Math.random() * 101);
			if (num[i] % 2 == 0) {
				par[pares++] = num[i];
			} else {
				impar[impares++] = num[i];
			}
		}
		System.out.println("Array original:");
		for (i = 0; i < 20; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		for (i = 0; i < pares; i++) {
			num[i] = par[i];
		}
		for (i = pares; i < 20; i++) {
			num[i] = impar[i - pares];
		}
		System.out.println("Array con los pares al principio:");
		for (i = 0; i < 20; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
