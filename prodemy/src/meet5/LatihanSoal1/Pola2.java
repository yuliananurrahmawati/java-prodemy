package meet5.LatihanSoal1;

public class Pola2 {

	public void soal2(char[] kataChar) {
		String kataString[] = new String[kataChar.length];
		int a = 1, b = 1, c = 1, jumlah = 0, cek = 0;
		for (int i = 0; i < kataChar.length; i++) {
			if ((kataChar[i] == 'a') || (kataChar[i] == 'i') || (kataChar[i] == 'u') || (kataChar[i] == 'e')
					|| (kataChar[i] == 'o')) {
				if(cek < 3) {
					kataString[i] = Integer.toString(c);
					cek++;
				} else {
					jumlah = a + b + c;
					kataString[i] = Integer.toString(jumlah);
					a = b;
					b = c;
					c = jumlah;
				}
			} else {
				kataString[i] = Character.toString(kataChar[i]);
			}
		}
		for (int i = 0; i < kataString.length; i++) {
			System.out.print(kataString[i]);
		}
	}
}
