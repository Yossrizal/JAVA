import javax.swing.*;

public class Perkenalan extends Menyapa {
	
	public void biodata(String nm, String hb){
		System.out.println("Nama saya "+nm);
		System.out.println("Hobi saya "+hb);
		
	}
	
	public int umur(int tahun1, int tahun2){
		int umur;
		umur = tahun2 - tahun1;
		return umur;
	}
}