public class T06N11 {
	public static void main(String []args) {
			
		int num;
		
		System.out.print("Introduce un numero: ");
		num=Integer.parseInt(System.console().readLine());
		
		for(int i= num; i<num+5;i++){
			System.out.printf(" %5d %6d %7d",i, i*i, i*i*i);
			System.out.println();
		}
	}
}
