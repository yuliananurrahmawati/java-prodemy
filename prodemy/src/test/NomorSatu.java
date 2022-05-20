package test;

public class NomorSatu {
	
	public void cetak() {
			int[] arrD = {9,15,20,32,147,483,529 };
			
			for(int i = 0; i < arrD.length; i++) {
				int N = arrD[i];
				solution(N);
			}
	}
	
	public int solution(int N) {
		System.out.println("\nDecimal = " + N);
		String biner = Integer.toBinaryString(N);
		System.out.println("Biner = " + biner);
		String[] arr = biner.split("");
		
		int max = 0;
		int current = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("0")) {
				current ++;
			} else {
				max = (max > current) ? max : current;
				current = 0;
			}
		}
		System.out.println("Binary Gap = " + max);
		return max;
	}
	
	public static void main(String[] args) {
		NomorSatu run = new NomorSatu();
		run.cetak();
	}
}
