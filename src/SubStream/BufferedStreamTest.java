package SubStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class BufferedStreamTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		InputStream ins = new FileInputStream("C:/Temp/test01.txt");
		InputStreamReader r = new InputStreamReader(ins);
		BufferedReader br = new BufferedReader(r);
		
		while(true)
		{
			int n;
			try {
				n = br.read();
				if(n ==-1)
				{
					break;
				}
				
				System.out.print((char)n);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		OutputStream out = new FileOutputStream("C:/Temp/test01.txt",true);
		OutputStreamWriter ow = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(ow);
		
		String str = "Test!!\n";
		
		try {
			bw.write(str);
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			bw.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		InputStream ins2 = new FileInputStream("C:/Temp/test01.txt");
		Reader r2 = new InputStreamReader(ins2);
		BufferedReader br2 = new BufferedReader(r2);
		
		String str2 = "";
		int lineNumber = 1;
		while(true)
		{
			try {
				str2 = br2.readLine();//더이상 읽을 것이 없으면 null을 리턴 
				if(str2==null)
				{
					break;
				}
				System.out.println(lineNumber + ". " + str2);
				lineNumber++;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}

}
