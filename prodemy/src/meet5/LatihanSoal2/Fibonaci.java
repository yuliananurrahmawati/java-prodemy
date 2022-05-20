package meet5.LatihanSoal2;

public class Fibonaci {

	public String[] getFibo(int N) {
		String fibo[] = new String[N];
		int a = 0, b = 1, c = 1;
		char awal = 'A';
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				fibo[i] = Integer.toString(c);
				c = a + b;
				a = b;
				b = c;
			} else {
				fibo[i] = Character.toString(awal);
				awal++;
			}
		}
		return fibo;
	}
}
