import javax.swing.*;
public class Kalkulator1{
	public static void main(String[]args){
		int bil1,bil2;
		
		bil1 = Integer.valueOf(JOptionPane.showInputDialog("Masukan Bilangan 1"));
		bil2 = Integer.valueOf(JOptionPane.showInputDialog("Masukan Bilangan 2"));
		
		Operasi panggil = new Operasi();
	
		
		panggil.Hasil(bil1,bil2,panggil.tambah(bil1,bil2),panggil.kurang(bil1,bil2));
	}
}