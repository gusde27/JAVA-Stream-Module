import java.io.*;

public class cobaFileInputStream {

public static void main(String[] args) {
	FileInputStream myFile = null;
	try {
		myFile = new FileInputStream("coba.txt"); 
		boolean eof = false; 
		while (!eof) {
		int byteValue = myFile.read(); 
		System.out.print(byteValue + " ");
		if (byteValue == -1){ //akhir dari file di
		eof = true;
		}
	}

	} 

	catch (IOException e) {
		System.out.println("Tidak bisa membaca file" + e.toString());
	}

	finally {
		if (myFile != null){
		try {
		myFile.close(); //menutup file
		}
		catch (Exception e1) {
		e1.printStackTrace();
		}
		}
	}

	}

}