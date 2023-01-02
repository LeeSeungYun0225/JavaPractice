package SubStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;

public class PrintStreamTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		OutputStream out = new FileOutputStream("C:/Temp/test00001.txt");
		PrintStream pout = new PrintStream(out);
		
		pout.println("안녕하세요");
		pout.println("반갑습니다. 오늘은 날씨가 좋네요");
		
		pout.flush();
		pout.close();
		
		
		InputStream ins = new FileInputStream("C:/Temp/test00001.txt");
		Reader r = new InputStreamReader(ins);
		BufferedReader br = new BufferedReader(r);
		
		String str = "";
		while(true)
		{
			try {
				str = br.readLine();
				if(str == null)
				{
					break;
				}
				System.out.println(str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
