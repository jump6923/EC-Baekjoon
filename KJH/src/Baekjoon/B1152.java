package Baekjoon;

import java.util.Scanner;

public class B1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				cnt++;
			}
		}
		if (s.charAt(0) != ' ' || s.charAt(s.length() - 1) != ' ') {
			cnt = cnt + 1;
		}
		if (s.charAt(0) == ' ' || s.charAt(s.length() - 1) == ' ') {
			cnt = cnt - 1;
		}
		System.out.println(cnt);
	}

}
