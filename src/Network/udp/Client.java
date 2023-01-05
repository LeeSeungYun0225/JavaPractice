package Network.udp;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			DatagramSocket datagramSocket = new DatagramSocket();
			Scanner scan = new Scanner(System.in);
			String str = "";
			DatagramPacket sendPacket;
			DatagramPacket receivePacket= new DatagramPacket(new byte[1024],1024);
			
			while(true)
			{
				str = scan.nextLine();
				byte[] sendByte = str.getBytes("UTF-8");
				sendPacket = new DatagramPacket(sendByte,0,sendByte.length, new InetSocketAddress("192.168.0.33",8585));
				datagramSocket.send(sendPacket);
				
				if(str.equals("종료"))
				{
					datagramSocket.close();
					break;
				}
				
				datagramSocket.receive(receivePacket);
				str = new String(receivePacket.getData(),0,receivePacket.getLength(),"UTF-8");
				System.out.println("RECEIVED MESSAGE : " + str);
				
			}
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
