package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10828 { //스택

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(bf.readLine());

		int index = 0;
		int array[] = new int[a];
		for (int i = 0; i < a; i++) {
			String comm = bf.readLine();
			String[] sp = comm.split(" ");
			String comm1 = sp[0];

			if (comm1.equals("push")) {
				array[index] = Integer.parseInt(sp[1]);
				index++;
			} else if (comm1.equals("pop")) {
				if (index == 0) {
					System.out.println(-1);
				} else {
					System.out.println(array[index - 1]);
					array[index - 1] = 0;
					index--;
				}
			} else if (comm1.equals("size")) {
				System.out.println(index);
			} else if (comm1.equals("empty")) {
				if (index == 0) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (comm1.equals("top")) {
				if (index == 0) {
					System.out.println(-1);
				} else {
					System.out.println(array[index - 1]);
				}
			}
		}
	}

}