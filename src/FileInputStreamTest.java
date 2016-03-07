import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		File f = new File("D:/1.txt");
		File f2 = new File("D:/2.txt");
		
		try {
			
			fis = new FileInputStream(f);
			fos = new FileOutputStream(f2);
			byte[] b = new byte[20];
			int len;
			while((len = fis.read(b))!=-1){
				fos.write(b, 0, len);
			}
			System.out.println("Ö´ÐÐ³É¹¦");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
