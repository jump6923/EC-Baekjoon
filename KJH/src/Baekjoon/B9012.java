package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Vps vp = new Vps();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		while (a != 0) {
			System.out.println(vp.solve(bf.readLine()));
			a--;
		}
	}
}

class Vps {
	public String solve(String str) {
		Stack<String> stack = new Stack<String>();
		String[] array = new String[50];
		array = str.split("");
		
		for(int i =0;i<array.length;i++) {
			if(array[i].equals("(")) {
				stack.push(str);
			}
			else if(array[i].equals(")")) {
				if(stack.isEmpty())
					return "NO";
				else
					stack.pop();
			}
		}
		if(stack.isEmpty())
			return "YES";
		else
			return "NO";
	}
}
