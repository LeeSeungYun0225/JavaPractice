package Network;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Socket socket = new Socket("192.168.0.33",8585);
			System.out.println("서버와 연결에 성공하였습니다");
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osr = new OutputStreamWriter(os);
			
			
			
			
			while(true)
			{
				char[] get = new char[1024];
				int len = isr.read(get);
				if(len !=0)
				{
					if(get[0] == 'Q')
					{
						osr.write("나 끈다 ㅂㅂ.");
						osr.flush();
						break;
					}
					else
					{
						System.out.println("서버로 부터 받은 메시지 \n ----------------");
						for(int i=0;i<len;i++)
						{
							System.out.print(get[i]);
						}
						System.out.println();
						osr.write("서버야 잘 받았다.");
						osr.flush();
					}
				}
				
			}
			
			socket.close();
			isr.close();
			osr.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
