package SubStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class ByteToCharStreamTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// 보조스트림 _ 바이트를 문자로 (inputStreamReader)
		InputStream ins = new FileInputStream("C:/Temp/test01.txt");
		Reader reader = new InputStreamReader(ins);
		
		while(true)
		{
			int n;
			try {
				n = reader.read();
				if(n == -1)
				{
					break;
				}
				System.out.print((char)n);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		 // 문자를 바이트로 변환해서 저장 
		OutputStream os = new FileOutputStream("C:/Temp/test01.txt",true);
		Writer w = new OutputStreamWriter(os);
		String str = "테스트 문자열";
		
		try {
			w.write(str);
			reader.close();
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
	}

}
