package com.company;

import java.util.Scanner;

public class P217 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int num;
		while(true) {
			num = in.nextInt();
			
			if(num == 0)
				break;
			
			if(num%2 == 0)
				System.out.println("DERECHA");
			else
				System.out.println("IZQUIERDA");
		}
		in.close();
		
	}

}
