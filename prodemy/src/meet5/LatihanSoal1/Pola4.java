package meet5.LatihanSoal1;

public class Pola4 {

	public void soal4(String[] kataSplit) {
		int total = 0;
		for (int i = 0; i < kataSplit.length; i++) {
			char[] ubah = kataSplit[i].toCharArray();
			total = total + ubah.length;
		}
		System.out.print(total);
	}
}
