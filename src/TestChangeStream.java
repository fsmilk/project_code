import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;

public class TestChangeStream {
	
	@Test
	//ʹ���ֽ���ʵ���������
	public void test1(){
		
		BufferedOutputStream bos = null;
		
		try {
			bos = new BufferedOutputStream(new FileOutputStream(new File("test.txt")));
			String str = "�»��籱��12��14�յ��й��������ξ�12��14���ٿ����飬�����о�2016�꾭�ù������о�������й���������ͨ�������ڽ�����ȫ���͹��ҹ�ѫ���������ƶȵ�����������й��������ط�ίԱ�Ṥ����������������ʵʩȫ���������߸ĸ����Ƽƻ������������ľ��������й����������ϰ��ƽ���ֻ��顣";
			bos.write(str.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(bos!=null){
				try {
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	@Test
	//ʹ���ַ���ʵ���������
	public void test2(){
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("test1.txt"));
			String str = "�»��籱��12��14�յ��й��������ξ�12��14���ٿ����飬�����о�2016�꾭�ù������о�������й���������ͨ�������ڽ�����ȫ���͹��ҹ�ѫ���������ƶȵ�����������й��������ط�ίԱ�Ṥ����������������ʵʩȫ���������߸ĸ����Ƽƻ������������ľ��������й����������ϰ��ƽ���ֻ��顣";
			bw.write(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(bw!=null){
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	
	@Test
	//ʹ���ַ���ʵ�����ݵĶ���
	public void test3(){
		BufferedReader br = null;
		
			try {
				br = new BufferedReader(new FileReader("test2.txt"));
				String str = "�»��籱��12��14�յ��й��������ξ�12��14���ٿ����飬�����о�2016�꾭�ù������о�������й���������ͨ�������ڽ�����ȫ���͹��ҹ�ѫ���������ƶȵ�����������й��������ط�ίԱ�Ṥ����������������ʵʩȫ���������߸ĸ����Ƽƻ������������ľ��������й����������ϰ��ƽ���ֻ��顣";
				while((str = br.readLine())!=null){
					System.out.println(str);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e){
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				if(br !=null){
					try {
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		
	}
	
	
	
}
