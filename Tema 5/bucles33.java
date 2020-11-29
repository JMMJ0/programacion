 /*
Hecho por José Manuel Morón Jurado
*/
public class bucles33 {
	public static void main(String[] args) {
		
		int num;
		
		System.out.print("Introduce la altura deseada: ");
		num= Integer.parseInt(System.console().readLine());
		
		for(int i=0; i<(num-1); i++){
			System.out.print("* ");
			for(int j=1; j<num; j++){
				System.out.print(" ");
			}
			System.out.println("*");
		}
		System.out.print(" ");
		
		for(int i=2; i<(num);i++){
			System.out.print("* ");
			
		}
	}
}
			
			
