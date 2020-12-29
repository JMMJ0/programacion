public class T06N12 {	
	public static void main(String[] args) {
		
		int num;
		int suma=0;
		int r1=0;
		int r2=1;
		
		System.out.print("Introduzca un numero: ");
		num=Integer.parseInt(System.console().readLine());
		
		for(int  i=0; i<num;i++){
			suma=r1;
			r1=r2;
			r2= suma+r2;
				
			System.out.println(r2);
		}
	}
}

			
			
