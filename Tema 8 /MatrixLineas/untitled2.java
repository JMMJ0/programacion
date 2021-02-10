/*
 * untitled2.java
 * 
 * <@JMMJ>
 * 
 */

import LibreriaMatriz.MatrixLibreria;

public class untitled2 {
	
	public static void main (String args[]) {
    
		
		int filas= MatrixLibreria.GeneraAleatorio(1,8);
		int cols= MatrixLibreria.GeneraAleatorio(1,8);
		
		int[][] matrix=MatrixLibreria.rellenarMatrizAleatorios(filas, cols, 1, 99);
		MatrixLibreria.PresentaMatrizConLineas(matrix);
	}
}

