package Baekjoon;

import java.util.Scanner;

public class B2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = c / 60;
		int e = c % 60;

		if (b + e >= 60) {
			a = a + 1;
			b = b + e - 60;
		}
		else
			b = b + e;
		a = a + d;
		if ( a >= 24)
			a = a - 24;
		System.out.println(a + " " + b);
	}

}
		