package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2798 {
	//브루트포스 알고리즘(전체 탐색) 단순 무식
	//알고리즘 설계의 가장 기본적인 접근 방법은 해가 존재할 것으로 예상되는 모든 영역을 전체 탐색하는 방법
	//
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int result = 0;
		int compare = 0;
		int[] n = new int[2];
		n[0] = Integer.parseInt(st.nextToken());
		n[1] = Integer.parseInt(st.nextToken());

		int[] m = new int[n[0]];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n[0]; i++) {
			m[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < n[0] - 2; i++) {
			for (int j = 0; j < n[0] - 1; j++) {
				if(i==j) continue;
				for(int k =0; k < n[0]; k++) {
					if(i==k) continue;
					else if(j==k) continue;
					compare = m[i]+m[j]+m[k];
					if(compare > result && n[1] >= compare) {
						result = compare;
					}
					
				}
			}
		}
		 System.out.println(result);

	}

}
