package com.company;

import java.util.Scanner;

public class P232 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int diaCumple, mesCumple, anyoCumple;
		int diaActual, mesActual, anyoActual;
		
		int meses[] = new int [] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int diasNoCumple, diasCumple, diasActual;
		
		while(true) { 
			
			diaCumple = in.nextInt();
			mesCumple = in.nextInt();
			anyoCumple = in.nextInt();
			diaActual = in.nextInt();
			mesActual = in.nextInt();
			anyoActual = in.nextInt();
			
				if(diaCumple == 0 && mesCumple == 0 && anyoCumple == 0 && 
						diaActual == 0 && mesActual == 0 && anyoActual == 0)
					break;
				if(diaCumple == diaActual && mesCumple == mesActual)
					System.out.println(0);
				else {
					diasCumple = (anyoCumple * 365) + diaCumple;
					for(int i = 0 ; i < mesCumple-1; i++) {
						diasCumple = diasCumple + meses[i];
					}
				
					diasActual =  (anyoActual*365) + diaActual;
					for(int i = 0 ; i < mesActual-1; i++) {
						diasActual = diasActual + meses[i];
					}
					diasNoCumple = diasActual - diasCumple - (anyoActual - anyoCumple) + 1;
					if(diaActual > diaCumple && mesCumple == mesActual || mesActual > mesCumple) 
						diasNoCumple--;
						System.out.println(diasNoCumple);
						
					
				}	
			
		}
		 in.close();
	}
	
	
}
	
