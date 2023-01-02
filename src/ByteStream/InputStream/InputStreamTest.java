package ByteStream.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//1바이트 읽기
		
		try(InputStream ins = new FileInputStream("C:/Temp/test.db")) {
			
			while(true) {
				int data = ins.read();//1바이트 읽고 data에 저장
				System.out.println(data + " ");
				if(data ==-1){
					break;
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		// 바이트 배열로 읽어오기
		try(InputStream ins2 = new FileInputStream("C:/Temp/test2.db"))
		{
			byte[] temp = new byte[2];
			int n  = ins2.read(temp);// 배열의 길이만큼만 읽어올 수 있음.
			// 값은 매개값으로 주어진 배열로 저장하고, 리턴값은 읽어온 값의 수 
			// 더 이상 읽을 값이 없으면 read(temp)도 -1을 리턴함 
			
			for(int i=0;i<n;i++)
			{
				System.out.println(temp[i]);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		// 바이트 배열로 파일 읽어오고 출력하여 복사하기 
		
		String origin = "C:/Temp/test.jpg";
		String output = "C:/temp/output.jpg";
		
		
		InputStream inputStream = new FileInputStream(origin);
		OutputStream outputStream = new FileOutputStream(output);
			
		byte[] data = new byte[1024];
		
		
		try {
			while(true)
			{
				int n = inputStream.read(data);
				if(n== -1) {
					break;
				}
				outputStream.write(data,0,n);
			
			}
			
			outputStream.flush();
			outputStream.close();
			inputStream.close();
			
			System.out.println("Copy Successed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
		
	}

}
