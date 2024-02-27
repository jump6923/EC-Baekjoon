package Baekjoon;

import java.util.Scanner;

public class B23971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int height = (H-1)/(N+1)+1;
		int width = (W-1)/(M+1)+1;
		
		System.out.println(height*width);
	}

}