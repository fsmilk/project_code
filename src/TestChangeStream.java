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
	//使用字节流实现内容输出
	public void test1(){
		
		BufferedOutputStream bos = null;
		
		try {
			bos = new BufferedOutputStream(new FileOutputStream(new File("test.txt")));
			String str = "新华社北京12月14日电中共中央政治局12月14日召开会议，分析研究2016年经济工作，研究部署城市工作，审议通过《关于建立健全党和国家功勋荣誉表彰制度的意见》、《中国共产党地方委员会工作条例》、《关于实施全面两孩政策改革完善计划生育服务管理的决定》。中共中央总书记习近平主持会议。";
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
	//使用字符流实现内容输出
	public void test2(){
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("test1.txt"));
			String str = "新华社北京12月14日电中共中央政治局12月14日召开会议，分析研究2016年经济工作，研究部署城市工作，审议通过《关于建立健全党和国家功勋荣誉表彰制度的意见》、《中国共产党地方委员会工作条例》、《关于实施全面两孩政策改革完善计划生育服务管理的决定》。中共中央总书记习近平主持会议。";
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
	//使用字符流实现内容的读入
	public void test3(){
		BufferedReader br = null;
		
			try {
				br = new BufferedReader(new FileReader("test2.txt"));
				String str = "新华社北京12月14日电中共中央政治局12月14日召开会议，分析研究2016年经济工作，研究部署城市工作，审议通过《关于建立健全党和国家功勋荣誉表彰制度的意见》、《中国共产党地方委员会工作条例》、《关于实施全面两孩政策改革完善计划生育服务管理的决定》。中共中央总书记习近平主持会议。";
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
