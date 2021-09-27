import java.io.*;

public class FileCopyNoBufferJDK7 {
	public static void main(String[] args) {
		String inFileStr = "in.png";;
		String outFileStr = "out.png";;
		long startTime, elapsedTime; // untuk melihat waktu pemrosesan
		// Mengecek besar file
		File fileIn = new File(inFileStr);
		System.out.println("File size is " + fileIn.length() + " bytes");
		// "try-with-resources" secara otomatis menutup semua resource yang terbuka
		try (FileInputStream in = new FileInputStream(inFileStr);
		FileOutputStream out = new FileOutputStream(outFileStr)) {
		startTime = System.nanoTime();
		int byteRead;
		// Membaca sebuah byte mentah, mengembalikan sebuah int dari 0 sampai 255.
		while ((byteRead = in.read()) != -1) {
		out.write(byteRead);
		}
		elapsedTime = System.nanoTime() - startTime;
		System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
		} catch (IOException ex) {
		ex.printStackTrace();
		}
	}
}