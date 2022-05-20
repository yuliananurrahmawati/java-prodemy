package meet5.LatihanSoal2;

public class Abjad {

	public char[] getAbjad(int N) {
		char abjad[] = new char[N];
		char a = 'A';
		if (N % 2 == 0) {
			for (int i = 0; i < N; i++) {
				if (i < N / 2) {
					abjad[i] = a;
					a++;
				} else {
					a--;
					abjad[i] = a;
				}
			}
		} else {
			for (int i = 0; i < N; i++) {
				if (i < (N - 1) / 2) {
					abjad[i] = a;
					a++;
				} else {
					abjad[i] = a;
					a--;
				}
			}
		}
		return abjad;
	}
}
