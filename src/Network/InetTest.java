package Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 로컬 PC의 IP주소 얻기 
			InetAddress is = InetAddress.getLocalHost();
			System.out.println(is);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			//도메인 주소의 IP주소 얻기 (대표 IP 주소 1개)
			InetAddress is = InetAddress.getByName("naver.com");
			System.out.println(is);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			//도메인 주소로 등록된 IP 주소 모두 얻기 
			//부하를 방지하기 위해 일반적으로 기업은 여러개의 서버를 분산해서 운영 
			InetAddress[] isArr = InetAddress.getAllByName("naver.com");
			for(InetAddress is:isArr)
			{
				System.out.println(is);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
