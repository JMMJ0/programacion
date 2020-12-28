 /*
Hecho por José Manuel Morón Jurado
*/
public class T06N28 {
	public static void main(String[] args) {
		int num;
		int aux=1;
		int i;
		System.out.print("Introduzca un número: ");
		num=Integer.parseInt(System.console().readLine());
		
		
		for( i=1; i<=num; i++){
			aux *=i;
			
		}
		System.out.print(num+"! ="+aux);
	}
}
			
