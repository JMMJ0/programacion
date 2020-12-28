 /*
Hecho por José Manuel Morón Jurado
*/
public class T06N30 {
	public static void main(String[] args) {
		int num;
		int dia;
		int hora;
		int dia2;
		int hora2;
		int semana=0;
		
		do{
			System.out.println("Introduce el día(1-7) y la hora a continuación");
			System.out.print("Día: ");
			dia=Integer.parseInt(System.console().readLine());
			System.out.print("Hora: ");
			hora= Integer.parseInt(System.console().readLine());
			
			switch (dia){
				case 1:
					System.out.print("Lunes");
				break;
				case 2:
					System.out.print("Martes");
				break;
				case 3:
					System.out.print("Miércoles");
				break;
				case 4:
					System.out.print("Jueves");
				break;
				case 5:
					System.out.print("Viernes");
				break;
				case 6:
					System.out.print("Sábado");
				break;
				case 7:
					System.out.print("Domingo");
				break;
			}
			
			
			System.out.println("Introduce el día(1-7) y la hora a continuación");
			System.out.print("Día: ");
			dia2= Integer.parseInt(System.console().readLine());
			System.out.print("Hora: ");
			hora2= Integer.parseInt(System.console().readLine());
			
			switch (dia2){
				case 1:
					System.out.print("Lunes");
				break;
				case 2:
					System.out.print("Martes");
				break;
				case 3:
					System.out.print("Miércoles");
				break;
				case 4:
					System.out.print("Jueves");
				break;
				case 5:
					System.out.print("Viernes");
				break;
				case 6:
					System.out.print("Sábado");
				break;
				case 7:
					System.out.print("Domingo");
				break;
			}
			if(dia2<dia){
				
			
		}
	}

			
			
			
			
			
			
