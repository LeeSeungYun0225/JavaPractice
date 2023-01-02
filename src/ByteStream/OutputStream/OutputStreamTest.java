package ByteStream.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//1 바이트 출력 
		OutputStream out = new FileOutputStream("C:/Temp/Test.db");
		
		byte x = 1;
		byte y = 2;
		byte z = 3;
		
		try {
			out.write(x);
			out.write(y);
			out.write(z);
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try (OutputStream out2 = new FileOutputStream("C:/Temp/Test2.db",false))
		{
			out2.write(x);
			out2.write(y);
			out2.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 1바이트 출력 ///
		
		
		// 바이트 배열 출력 // 
		
		byte[] arr = {1,2,3};
		
		try(OutputStream out3 = new FileOutputStream("C:/Temp/Test3.db",true)) {
			out3.write(arr);
			out3.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 바이트 배열 출력(시작/길이)//
		
		byte[] arr2 = {1,2,3,4,5,6};
		
		try(OutputStream out4 = new FileOutputStream("C:/Temp/Test4.db"))
		{
			out4.write(arr2,2,3);//2인덱스부터 3개 출력 
			out4.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
