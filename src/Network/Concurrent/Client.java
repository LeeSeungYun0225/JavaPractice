package Network.Concurrent;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
		
			Socket socket = new Socket("192.168.0.33",8585);
			
			System.out.println("서버에 연결 성공하였습니다");
			
			OutputStream os = socket.getOutputStream();
			InputStream ins = socket.getInputStream();
			
			OutputStreamWriter osw = new OutputStreamWriter(os);
			InputStreamReader insR = new InputStreamReader(ins);
			String str = "";
			char[] readData = new char[1024];
			
			while(true)
			{
				Thread thread = new Thread() {
					public void run()
					{
						try {
							int n = insR.read(readData);
							
							for(int i=0;i<n;i++)
							{
								System.out.print(readData[i]);
							}
							System.out.println();
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				};
				
				thread.start();
				
				str = scan.nextLine();
				
				if(str.equals("종료"))
				{
					socket.close();
					osw.close();
					insR.close();
					break;
				}
				
				osw.write(str);
				
				osw.flush();
				
			}
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
