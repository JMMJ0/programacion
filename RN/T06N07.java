public class T06N07{
	public static void main(String[] args) {

		int num;
		int intentos=4;
		int password= 3458;
		boolean correcto= false;

		do{
			System.out.print("Introduce un numero: ");
			num=Integer.parseInt(System.console().readLine());

			if(num==password){
				correcto= true;
			}else{
				System.out.println("Clave incorrecta");
				intentos--;
			}

		}while((intentos>0) && (!correcto));

		if(correcto){
			System.out.print("Acceso autorizado");
		}else{
			System.out.print("Acceso denegado");
		}
	}
}


