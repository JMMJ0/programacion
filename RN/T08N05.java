public class T08N05{
	public static void main(String[]args){
		
		int num[]=new int[10];
		int maximo=0;
		int minimo=99999;
		
		for(int i=0; i<10; i++){
			System.out.print("Introduzca 10 numeros: ");
			num[i]=Integer.parseInt(System.console().readLine());
			if(num[i]>maximo){
				maximo=num[i];
			}
			if(num[i]<minimo){
				minimo=num[i];	
			}
		}
		System.out.println();
		
		for(int i=0; i<10;i++){
			System.out.print(num[i]);
			if(num[i]==maximo){
				System.out.print(" maximo");
				
			}
			if(num[i]==minimo){
				System.out.print(" minimo");
				
			}
			System.out.println();
		}
	}
}
				
			
		
		
		
		
			
