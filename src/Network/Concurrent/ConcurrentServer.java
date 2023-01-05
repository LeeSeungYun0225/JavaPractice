package Network.Concurrent;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentServer {

	
	private static ServerSocket serverSocket = null;
	private static ExecutorService threadPool = Executors.newFixedThreadPool(10);
	// 최대 10개의 스레드를 갖는 스레드풀 생성 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		startServer();
		
		Scanner scan = new Scanner(System.in);
		
		if(scan.nextLine().equals("종료"))
		{
			stopServer();
		}
		
		
	}
	
	public static void startServer()
	{
			
		Thread thread = new Thread() {
			
			public void run()
			{
				try {
					// 서버 소켓 생성 
					serverSocket = new ServerSocket(8585);
					System.out.println("Server Started");
					while(true)
					{
						Socket socket = serverSocket.accept();
						
						
						// 스레드풀의 동작 정의 ( run 메소드를 람다식으로 작성 )  // 
						threadPool.execute(()->
						{
							InetSocketAddress is = (InetSocketAddress) socket.getRemoteSocketAddress();
							
							System.out.println("클라이언트 " + is.getHostString() + " 연결됨");
							
							try {
								InputStream ins = socket.getInputStream();
								InputStreamReader insR = new InputStreamReader(ins);
								char[] data_in = new char[1024];
								
								int data_length = insR.read(data_in);
								for(int i=0;i<data_length;i++)
								{
									System.out.print(data_in[i]);
								}
								System.out.println();
								
								OutputStream os = socket.getOutputStream();
								OutputStreamWriter osw = new OutputStreamWriter(os);
								
								String str = " 데이터 수신 완료 " ;
								osw.write(str);
								osw.flush();
								
								
								
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							
							
						});
						
						
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
				
				
			}
		};
		
		thread.start();
	}
	
	
	public static void stopServer()
	{
		try {
			serverSocket.close();
			threadPool.shutdown();
			
		}catch(IOException e) {}
		
		System.out.println("서버 종료됨");
	}
}
