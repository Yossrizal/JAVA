import javax.swing.*;

public class Array2_output{
	public void output(String nama[], int nilai[], int i){ //String nama[], int nilai[], int i <== parameter
		
		System.out.println("=================================");
		System.out.println("Nama \t\t\tNilai");
		System.out.println("=================================");
		
		for(int j=0; j<i; j++){
			System.out.println(nama[j]+" \t\t\t" + nilai[j]);
		}
	}
}