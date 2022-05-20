// n = 5 
// 1 a 1 b 2
// n = 6
// 1 a 1 b 2 c 3 d 5 e
package meet4;
import java.util.Arrays;

public class SoalTiga {
	public void cetakArray(int panjangDeret) {
		int a = 0, b = 1, c = 1;
		String arr[] = new String[panjangDeret];
		char abjad = 'a';
		for (int i = 0; i < panjangDeret; i++) {
			if (i % 2 == 1) {
				arr[i] = Character.toString(abjad++);
				abjad++;
			} else {
				arr[i] = Integer.toString(c);
				c = a + b;
				a = b;
				b = c;
			}
		}
		System.out.print("3. Deret Soal 3 : ");
		System.out.print(Arrays.toString(arr));
	}
}
