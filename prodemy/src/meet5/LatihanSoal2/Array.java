package meet5.LatihanSoal2;

import java.util.Arrays;

public class Array {
	public void setArray(int N, char[] abjad, String[] fibo) {
		String[][] arr = new String[N][N];
		String x = " ";
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) { // abjad
				for (int a = 0; a < N; a++) {
					if (a > i) {
						arr[i][a] = x;
					} else {
						arr[i][a] = Character.toString(abjad[a]);
					}
				}
				System.out.println();

			} else { // fibo
				int c = 0;
				for (int b = 0; b < N; b++) {
					if (b < N - 1 - i) {
						arr[i][b] = x;
					} else {
						arr[i][b] = fibo[c];
						c++;
					}
				}
				System.out.println();
			}
			System.out.print(Arrays.deepToString(arr[i]));
		}
	}
}
