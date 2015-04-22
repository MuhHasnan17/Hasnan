/**
 * 
 */
package hasnan;

/**
 * @author Taufik
 *
 */
public class hasnan {

	/**
	 * @param args
	 */
	static String prak="praktikum 1";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prak);
		biodata();
		kali();
		bagi();
		tambah();
		kurang();
		
	}
	public static void biodata(){
		String nama ="Muhammad Hasnan";
		String alamat = "Jl. Bonto Duri 7 Makassar";
		System.out.println("Nama : "+nama +"\nAlamat : "+alamat);
	}
	public static void kali(){
		int i=10*5;
		System.out.println("Hasil Kali "+i);
	}
	
	public static void bagi(){
		float i=45/3;
		System.out.println("Hasil Bagi "+i);
	}
	
	public static void tambah(){
		int i=5+80;
		System.out.println("Hasil Penjumlahan "+i);
	}
	
	public static void kurang(){
		int i=100-1;
		System.out.println("Hasil Pengurangan "+i);
	}
	
	
}
