import java.io.*;

public class FileCopyNoBuffer { // Pre-JDK 7
	public static void main(String[] args) {

		String inFileStr = "in.png";
		String outFileStr = "out.png";
		FileInputStream in = null;
		FileOutputStream out = null;
		long startTime, elapsedTime; // untuk melihat waktu pemrosesan
		// Mencetak besar file

		File fileIn = new File(inFileStr);
		System.out.println("File size is " + fileIn.length() + " bytes");
		try {
			in = new FileInputStream(inFileStr);
			out = new FileOutputStream(outFileStr);
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
		} finally { // selalu tutup I/O streams
			try {
				if (in != null) in.close();
				if (out != null) out.close();
				} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}