package Baekjoon;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i =0;i<N;i++) {
			int temp = 0;
			int K = sc.nextInt();
			for(int j = 1;j <= K;j++) {
				if(j%2 != 0) {
					temp = temp + j;
				}	
				else if(j%2 == 0) {
					temp = temp - j;
				}
			}
			System.out.println(temp);
		}
	}

}
