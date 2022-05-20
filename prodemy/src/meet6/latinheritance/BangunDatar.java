package meet6.latinheritance;
// BangunDatar = superclass
//access modifier

public abstract class BangunDatar {
	protected Integer luas; //yang bisa hanya kelas dia sendiri dan turunannya
	public Integer keliling;
	
	public void getLuas() {
		System.out.println("Ini adalah luas bangun datar : " + luas);
	}
	
}
