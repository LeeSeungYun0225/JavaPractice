package Network;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ServerSocket serverSocket = new ServerSocket(8585);
			Socket socket = serverSocket.accept();
			
			// 클라이언트의 IP주소와 포트넘버를 얻는 방법 // 
			InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
			String clientsIp = isa.getHostString();
			int portNumber = isa.getPort();
			System.out.println(clientsIp + " 클라이언트가 포트넘버 " +  portNumber +  "로 접속함");
			
			Scanner scan = new Scanner(System.in);
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			
			while(true)
			{
				
				String str = scan.nextLine();
				if(str.length()!=0)
				{
					if(str.charAt(0)== 'X')
					{
						break;
					}
					osw.write(str);
					osw.flush();
				}
				
				
				char[] get= new  char[1024];
				int len = isr.read(get);
				
				System.out.println("클라이언트가 보낸 메시지 \n ----------------------");
				for(int i=0;i<len;i++)
				{
					System.out.print( get[i]);
				}
				System.out.println();
			}
			
			serverSocket.close();
			osw.close();
			isr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 이렇게 사용해도 된다.
		// ServerSocket serverSocket = new ServerSocket();
		// serverSocket.bind(new InetSocketAddress(8585);
		
		// 만약 내가 가진 특정 IP로만 연결 할 수 있도록 허락하고자 한다면
		// ServerSocket s = new ServerSocket();
		// s.bind(new IntSocketAddress("xxx.xxx.xxx.xxx",8585);와 같이 작성하면 된다.
		
		
		
		
		
		
	}

}
