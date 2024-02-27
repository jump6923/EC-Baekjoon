package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class B25305 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		Integer[] x = new Integer[N];
		
		
		for (int i = 0; i < N; i++) {
			x[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(x, Collections.reverseOrder());
		
		System.out.println(x[k-1]);
	}

}
