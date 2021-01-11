public class T08N03{
	public static void main(String[]args){
		
		int num[]=new int[10];
	
		//recoge los numeros introducidos por el usuario
		for(int i=0; i<10;i++){
			System.out.print("Introduce 10 numeros: ");
			num[i]=Integer.parseInt(System.console().readLine());
		}
		
		
		//presenta los numeros en orden inverso al introducido
		for(int i=10;i>0;i--){
			System.out.println(num[i]);
		}
		

	}
}

			
