package SubStream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String d = "id : winter\n"
				+ "email : winter@winter.com\n"
				+ "tel : 012-345-678";
		
		Path p = Paths.get("C:/Temp/userInfo.txt");
		
		try {
			Files.writeString(p,d,Charset.forName("UTF-8"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			System.out.println("파일 유형 : " + Files.probeContentType(p)); // mime타입 반환 
			System.out.println("파일의 크기 : " + Files.size(p)+" bytes");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			String s = Files.readString(p,Charset.forName("UTF-8"));
			System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
