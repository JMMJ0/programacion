 /*
Hecho por José Manuel Morón Jurado
*/
public class bucles29 {
	public static void main(String[] args) {
		int num;
		int num2;
		
		System.out.print("Introduzca un número: ");
		num= Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduzca otro número: ");
		num2= Integer.parseInt(System.console().readLine());
		
		for(int i=num;i>=0; i--){
			
			if(i%num2!=0){
				if(i<num){
					System.out.print(i + " ");
				}
			}
		}
	}
}
			
				
		
		
		
		
	
