package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1920 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		int M = Integer.parseInt(br.readLine());
		int[] B = new int[M];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			B[i] = Integer.parseInt(st.nextToken());

			if (binarySearch(A, B[i]) >= 0) {
				System.out.println(1);
			} else
				System.out.println(0);
		}

	}

	static int binarySearch(int[] arr, int key) {
		int start = 0, end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2; // 중간 위치
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		// 못찾았다면
		return -1;
	}
}
