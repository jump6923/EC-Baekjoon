package Baekjoon;

import java.util.Scanner;

public class B2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (b - 45 < 0) {
			a = a - 1;
			b = b + 15;
			if (a < 0) {
				a = a + 24;
			}
		} else
			b = b - 45;
		System.out.println(a + " " + b);
	}
}
