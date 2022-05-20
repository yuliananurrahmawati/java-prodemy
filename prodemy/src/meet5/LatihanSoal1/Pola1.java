package meet5.LatihanSoal1;

public class Pola1 {

	public void soal1(char[] kataChar) {
		String kataString[] = new String[kataChar.length];
		int counter = 1;
		for (int i = 0; i < kataChar.length; i++) {
			if ((kataChar[i] == 'a') || (kataChar[i] == 'i') || (kataChar[i] == 'u') || (kataChar[i] == 'e')
					|| (kataChar[i] == 'o')) {
				kataString[i] = Integer.toString(counter);
				counter++;
			} else {
				kataString[i] = Character.toString(kataChar[i]);
			}
		}
		for (int i = 0; i < kataString.length; i++) {
			System.out.print(kataString[i]);
		}
	}
}
