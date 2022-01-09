package com.company;

import java.util.Scanner;

public class P144 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		for (int i=0;i<n;i++) {
			int x=in.nextInt();
			if(x>=5) System.out.println(0);
			else if(x==4)System.out.println(4);
			else if(x==3) System.out.println(6);
			else if(x==2) System.out.println(2);
			else if(x==1 || x==0) System.out.println(1);
		}
	}
}

