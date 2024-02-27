package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9012_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());

		for (int i = 0; i < a; i++) {
			int cnt = 0;
			String[] str = new String[50];
			str = bf.readLine().split("");
			for (int j = 0; j < str.length; j++) {
				if (cnt == -1)
					break;
				else if (str[j].equals("("))
					cnt = cnt + 1;
				else
					cnt = cnt - 1;
			}
			if (cnt == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
