package Baekjoon;

import java.util.Scanner;

public class B2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		s1 = (s1 % 10) * 100 + ((s1 % 100) / 10) * 10 + (s1 / 100);
		s2 = (s2 % 10) * 100 + ((s2 % 100) / 10) * 10 + (s2 / 100);
		System.out.println(s1 > s2 ? s1 : s2);
	}
}
