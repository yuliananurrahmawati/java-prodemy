package CobaCoba;

public class Coba {
public static void main(String[] args) {
//int i, j, n = 4;
//for(i = 0; i < n; i++) {
//	for(j = 0; j < n; j++) {
//		if(i==j) {
//			System.out.print(i + 1);
//		} else
//			System.out.print(" ");
//	}
//	System.out.print("\n");
//}
	
	int i, j, n = 4;
	for(i = 0; i < n; i++) {
		for(j = 0; j < n; j++) {
			if((i==j) || (i+j == n-1)) {
				System.out.print(j + 1);
			} else
				System.out.print(" ");
		}
		System.out.print("\n");
	}
//	int i, input = 7, output = 0;
//	for (i = 0; i <= input; i++) {
//		i++;
//		System.out.println(i);
//		output = output + i;
//	}
//	System.out.println(output);
}
}
