package com.company;
import java.util.Scanner;

public class P337 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int casosPrueba = in.nextInt();
		
		int dientesSuperiores[] = new int [6];
		int dientesInferiores[] = new int [6];
		
		Boolean dientesAlineados = true;
		
		for (int i = 0; i < casosPrueba; i++) {
			
			for (int j = 0; j < 6; j++) {
				dientesSuperiores[j] = in.nextInt();
			}
			for (int j = 0; j < 6; j++) {
				dientesInferiores[j] = in.nextInt();
			}
			
			int paresActual = 0;
			int paresSiguiente = 0;
			int caso = 0;
			
			while(true) {
				paresActual = dientesSuperiores[caso] + dientesInferiores[caso];
				paresSiguiente = dientesSuperiores[caso + 1] + dientesInferiores[caso+1];
				
				if(paresActual == paresSiguiente)
					dientesAlineados=true;
				else {
					dientesAlineados = false;
					break;
				}
				if(caso == 4)
					break;
				caso++;
			}
			if(dientesAlineados)
				System.out.println("SI");
			else
				System.out.println("NO");

		}
			
		in.close();
		
	}
	
}
