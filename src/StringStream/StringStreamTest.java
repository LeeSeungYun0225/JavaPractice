package StringStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class StringStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// 문자열 Writer // 
		Writer w = new FileWriter("C:/Temp/test01.txt");
		
		char a = 'A';
		// 문자 하나 출력 
		w.write(a); 
		
		char[] arr = {'A','B','C'};
		// 문자 배열 출력 
		w.write(arr);
		
		
		String str = "CACABA";
		// 문자열 출력 
		w.write(str);
		
		
		String str2 = "JAVA HELLO";
		// 문자열 범위 출력 
		w.write(str2,5,5);
		
		w.flush();
		w.close();
		
		
		Reader r = new FileReader("C:/Temp/Test01.txt");
		
		char[] read = new char[100];
		
		
		// 문자 하나 읽기 
		while(true)
		{
			int in = r.read();// 문자를 숫자로 받아온다 . 
			if(in == -1) // 더이상 읽을 문자 없으면 -1 반환 
			{
				break;
			}
			else {
				System.out.print((char)in + " ");
			}
		}
		
		
		Reader r2 = new FileReader("C:/Temp/Test01.txt");
		// 문자 여러개 읽기 
		while(true)
		{
			int in2 = r2.read(read);
			if(in2 == -1)
			{
				break;
			}
			for(int i=0;i<in2;i++)
			{
				System.out.print(read[i]);
			}
		}
		
		r.close();
		
	}

}
