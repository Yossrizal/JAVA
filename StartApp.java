import javax.swing.*;

public class StartApp {

    public static void main(String[]args){
    	//deklarasi variable
    	int x, y, a;
    	
    	// deklarasi objek interface
    	DataPribadi dp = new DataPribadi();
    	
    	dp.Nama();
    	dp.Alamat();
    	dp.NIM();
    	dp.Fakultas();
    	dp.Jurusan();
    	
    	// inner class abstract
    	Keterangan ket = new Keterangan();
    	Keterangan.Show show = ket.new Show();
    	Keterangan.Show.Show2 show2 = show.new Show2(); 
    	show2.Tampilkan();
    	
    	//deklarasi objek
    	PersegiPanjang pp = new PersegiPanjang();
    	BujurSangkar bj = new BujurSangkar();
    	Segitiga sg = new Segitiga();
    	Lingkaran li = new Lingkaran();
    	
    	a = Integer.parseInt(JOptionPane.showInputDialog("Masukan Pilihan"));
    
    	switch(a){
    		case 1 : 	x = Integer.parseInt(JOptionPane.showInputDialog("Masukan Panjang"));
    					y = Integer.parseInt(JOptionPane.showInputDialog("Masukan Lebar"));
    					System.out.println("Luas = "+ pp.Luas(x,y));
    					System.out.println("Keliling = "+pp.Keliling(x,y));
    		break;
    		
    		case 2 : 	x = Integer.parseInt(JOptionPane.showInputDialog("Masukan Sisi"));
    					y = 4;
    					System.out.println("Luas = "+bj.Luas(x,y));
    					System.out.println("Keliling = "+bj.Keliling(x,y));
    		break;
    		
    		case 3 : 	x = Integer.parseInt(JOptionPane.showInputDialog("Masukan Alas"));
    					y = Integer.parseInt(JOptionPane.showInputDialog("Masukan Tinggi"));
    					System.out.println("Luas = "+sg.Luas(x,y));
    					
    		break;
    		
    		case 4 : 	x = Integer.parseInt(JOptionPane.showInputDialog("Masukan jari - jari"));
    					y = 0;
    					System.out.println("Luas = "+li.Luas(x,y));
    					System.out.println("Keliling = "+li.Keliling(x,y));
    		break;    		    		
    	}
    	
    	
    	
    }
    
    
}