public class T06N13 {	
	public static void main(String[] args){
		
		int num;
		int contpos=0;
		int contneg=0;
		
		System.out.println("Introduce 10 numeros");
		
		for(int i=0; i<10; i++){
			num=Integer.parseInt(System.console().readLine());	
			
			if(num>0){
				contpos++;
			}else{
				contneg++;
			}
		}
		System.out.println("Hay "+contpos+" numeros positivos");
		System.out.println("Hay "+contneg+" numeros negativos");
	}
}
		
		
		
