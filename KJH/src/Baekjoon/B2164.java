package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B2164 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new  LinkedList<>();
		for(int i = 1; i < N+1; i++) {
			q.offer(i);
		}		
		while(q.size() > 1) {
			q.poll();
			int temp = q.poll();
			q.offer(temp);
		}
		System.out.println(q.poll());
	}

}
