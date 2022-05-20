package test;

import java.util.Arrays;

public class NomorDua {
	
	public static void rightRotateByOne(int[] A)
	{
		int simpan = A[A.length - 1];
		for (int i = A.length - 2; i >= 0; i--) {
			A[i + 1] = A[i];
		}

		A[0] = simpan;
	}

	public static void rightRotate(int[] A, int K)
	{
		if (K < 0 || K >= A.length) {
			return;
		}

		for (int i = 0; i < K; i++) {
			rightRotateByOne(A);
		}
	}
	
	public static void main(String[] args) {
		int[] A = {3,8,9,7,6};
		System.out.println(Arrays.toString(A));
		int K = 4;
		
		NomorDua.rightRotate(A, K);
		System.out.println(Arrays.toString(A));
	}
}
