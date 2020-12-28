 /*
Hecho por José Manuel Morón Jurado
*/
public class T06N31 {
	public static void main(String[] args) {
		int num;
	
		
		System.out.print("Introduce un número: ");
		num= Integer.parseInt(System.console().readLine());
		
		
		for(int i=0; i<num-1; i++){
			System.out.println("*");
		}
		int aux=((num/2)+1);
		for(int j=0;j<aux;j++){
			System.out.print("*" +" ");
		}
	}
}
			
