import javax.swing.*;
public class Array3_input{											//public dapat di panggil
	public void input(){
		int[] uts= new int[10];
		int[] uas= new int[10];
		float[] na= new float[10];
		String[] nama= new String[10];
		String jawab=""; int i=0;
		do {
			nama[i]=JOptionPane.showInputDialog("Masukan Nama");
			uts[i]=Integer.valueOf(JOptionPane.showInputDialog("Masukan Nilai UTS"));
			uas[i]=Integer.valueOf(JOptionPane.showInputDialog("Masukan Nilai UAS"));
			i++;
			
			jawab=JOptionPane.showInputDialog("Mau Tambah Data lagi?");
		}
		while (jawab.equalsIgnoreCase("Y"));
		
		Array3_output panggil=new Array3_output(); //Array3_output() <== konstruktor
		panggil.output(nama,uts,uas,na,i);
	}
}