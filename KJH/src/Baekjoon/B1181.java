package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class B1181 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		Arrays.sort(arr); // 알파벳순
		Arrays.sort(arr, Comparator.comparing(String::length)); // 길이순
		for(int i=0; i<N; i++){
            if(i==0)
                System.out.println(arr[i]);
            if(i>0){
                if(arr[i].equals(arr[i-1]))
                    continue;
                else
                    System.out.println(arr[i]);
            }
        }

	}
}
