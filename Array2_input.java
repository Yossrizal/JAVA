import javax.swing.*;
public class Array2_input{											//public dapat di panggil
	public void input(){
		int[] nilai= new int[10]; String[] nama= new String[10];
		String jawab=""; int i=0;
		do {
			nama[i]=JOptionPane.showInputDialog("Masukan Nama");
			nilai[i]=Integer.valueOf(JOptionPane.showInputDialog("Masukan Nilai"));
			i++;
			
			jawab=JOptionPane.showInputDialog("Mau Tambah Data lagi?");
		}
		while (jawab.equalsIgnoreCase("Y"));
		
		Array2_output panggil=new Array2_output(); //Array2_output() <== konstruktor
		panggil.output(nama,nilai,i);
	}
}