import java.io.*;

public class cobaBufferedOutput {
	public static void main(String[] args) {
		int someData[] = {73,110,105,32,97,100,97,108,97,104,32,102,105,108,101,32,112,101};
		FileOutputStream myFile = null;
		BufferedOutputStream buff = null;
		try {
			myFile = new FileOutputStream ("coba.txt");
			//membuat stream
			buff = new BufferedOutputStream (myFile);
			//memasukkan stream myFile ke buff
			for (int i = 0;i < someData.length; i++){
			buff.write(someData[i]);
			}
		}
		catch (IOException e){
			System.out.println("Tidak bisa menulis pada file" +
			e.toString());
		} finally {
			if (myFile !=null){
				try {
				buff.flush(); //memflush stream
				buff.close(); //menutup stream
				myFile.close(); //menutup stream
				} catch (Exception e1){
				e1.printStackTrace();
				}
			}
		}
	}
}