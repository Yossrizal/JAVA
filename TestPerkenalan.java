import javax.swing.*;
public class TestPerkenalan{ //simpan TestPerkenalan.java
	public static void main(String[]args){
		
		int tahunsekarang=2017;
		String nama=JOptionPane.showInputDialog("Nama saya");
		String hobi=JOptionPane.showInputDialog("Hobi saya");
		int tahunlahir=Integer.valueOf(JOptionPane.showInputDialog("Tahun Lahir"));
		
		Perkenalan panggil = new Perkenalan();
		panggil.hey();
		panggil.hai();
		panggil.Hallo();
		panggil.biodata(nama,hobi);
		System.out.println("Umur saya "+panggil.umur(tahunlahir,tahunsekarang));
	}
	
}

/* 	metode bawaan java
 *	show = kecil
 *	Input = kapital
 *	Dialog =kapital
 *
 *
 *
 *
 */