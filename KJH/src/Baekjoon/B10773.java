package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(bf.readLine());

		int index = 0;
		int array[] = new int[a];

		for (int i = 0; i < a; i++) {
			int b = Integer.parseInt(bf.readLine());
			if (b == 0) {
				array[index-1] = 0;
				index--;
			} else {
				array[index] = b;
				index++;
			}
		}
		int sum = 0;
		for (int i = 0; i < index; i++) {
			sum = sum + array[i];
		}
		System.out.println(sum);
	}
}
