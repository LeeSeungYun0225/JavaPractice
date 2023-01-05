package Network.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DatagramSocket datagramSocket = new DatagramSocket(8585);
			DatagramPacket datagramPacket = new DatagramPacket(new byte[1024],1024);
			while(true)
			{
				
				datagramSocket.receive(datagramPacket); // 블로킹 상태에 놓임 
				
				String str = new String(datagramPacket.getData(),0,datagramPacket.getLength(),"UTF-8");
				
				SocketAddress socketAddress = datagramPacket.getSocketAddress();
				
				String sendMessage = "your message "+ str + " received.";
				System.out.println("RECEIVED MESSAGE : " + str);
				byte[] sendBytes = sendMessage.getBytes("UTF-8");
				DatagramPacket sendPacket = new DatagramPacket(sendBytes, 0, sendBytes.length,socketAddress);
				datagramSocket.send(sendPacket);
				
				
				if(str.equals("필요없어"))
				{
					datagramSocket.close();
					break;
				}
			}
			
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
