import javax.swing.*;

public class Array3_output{
	public void output(String nama[], int uts[], int uas[], float na[], int i){ //String nama[], int nilai[], int i <== parameter
		
		System.out.println("=================================");
		System.out.println("Nama \t\t\tNilai\t\t\tUTS\t\t\tUAS\t\t\tNA");
		System.out.println("=================================");
		
		for(int j=0; j<i; j++){
			na[j] = (uts[j]+uas[j])/2;
			System.out.println(nama[j]+" \t\t\t" + uts[j] +" \t\t\t" + uas[j] +" \t\t\t" + na[j]);
		}
	}
}