package Baekjoon;

import java.util.Scanner;

public class B1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		a -= b;
		System.out.print(a);
		scanner.close(); 
	}
}