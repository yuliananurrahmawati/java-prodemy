package meet5.LatihanSoal1;

public class Pola3 {

	public void soal3(String[] kataSplit) {
		String x = null;

		for (int i = 0; i < kataSplit.length; i++) {
			char[] ubah = kataSplit[i].toCharArray();
			for (int j = 0; j < ubah.length; j++) {
				if ((j == 0) || (j == (ubah.length - 1))) {
					x = Character.toString(ubah[j]);
				} else {
					x = Character.toString('*');
				}
				System.out.print(x);
			}
			System.out.print(" ");
		}
	}
}
