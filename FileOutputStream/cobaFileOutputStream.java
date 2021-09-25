import java.io.*;

public class cobaFileOutputStream {

	public static void main (String [] args){

		int someData[] = {73,110,105,32,97,100,97,108,97,104,32,102,105,108,101,32,112,101,122,104,57,60};

		FileOutputStream myFile = null;

		try {
			myFile = new FileOutputStream("output.txt"); //membuat stream FileOutputStream
			for (int i = 0; i < someData.length; i++){
			myFile.write(someData[i]);
			}
		}
		catch (IOException e) {
			System.out.println("Tidak bisa menulis pada file" + e.toString());
			} 

		finally {
			if (myFile !=null){
				try{
				myFile.close();
				}catch (Exception e1){
				e1.printStackTrace();
				}
			}
		}
	}
}