package meet3;

public class CetakDeret {
	public void cetakGanjil(int jumlahDeret) {
		System.out.print("Deret bilangan ganjil sepanjang " + jumlahDeret + " bilangan :");
		for (int i = 0; i < jumlahDeret; i++) {
			System.out.print(" " + ((i * 2) + 1));
		}
	}

	public void cetakGenap(int jumlahDeret) {
		System.out.print("Deret bilangan genap sepanjang " + jumlahDeret + " bilangan :");
		for (int i = 0; i < jumlahDeret; i++) {
			System.out.print(" " + (i * 2));
		}
	}

	public void cetakFibonaci(int jumlahDeret) {
		int a = 0, b = 1, c = 1;
		System.out.print("Deret bilangan fibonacci sepanjang " + jumlahDeret + " bilangan :");
		for (int i = 0; i < jumlahDeret; i++) {
			System.out.print(" " + c);
			c = a + b;
			a = b;
			b = c;
		}
	}
}
