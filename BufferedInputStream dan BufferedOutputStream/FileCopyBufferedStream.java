import java.io.*;

public class FileCopyBufferedStream { // Pre-JDK 7
	public static void main(String[] args) {

		String inFileStr = "in.png";
		String outFileStr = "out.png";
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		long startTime, elapsedTime; // untuk melihat waktu pemrosesan
		// mengecek besar file
		File fileIn = new File(inFileStr);
		System.out.println("File size is " + fileIn.length() + " bytes");
		try {
			in = new BufferedInputStream(new FileInputStream(inFileStr));
			out = new BufferedOutputStream(new FileOutputStream(outFileStr));
			startTime = System.nanoTime();
			int byteRead;
			while ((byteRead = in.read()) != -1) { // Membaca byte-by-byte dari buffer
			out.write(byteRead);
			}
			elapsedTime = System.nanoTime() - startTime;
			System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
		} catch (IOException ex) {
		ex.printStackTrace();
		} finally { // menutup stream
		try {
			if (in != null) in.close();
			if (out != null) out.close();
			} catch (IOException ex) { ex.printStackTrace(); }
		}
	}
}