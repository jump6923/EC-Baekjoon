package Baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class B10757 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		BigInteger A = new BigInteger(in.next());
		BigInteger B = new BigInteger(in.next());

		A = A.add(B);

		System.out.println(A.toString());

	}

}
