package Network;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // JSON 사용, 저장 // 
		JSONObject root = new JSONObject();
		
		root.put("id", "아무개");
		root.put("age", 22);
		root.put("student",false);
		
		JSONObject tel = new JSONObject();
		tel.put("home", "02-995-9999");
		tel.put("mobile", "010-2222-2222");
		root.put("tel", tel);
		// 객체 타입도 담을 수 있음 
		
		JSONArray skill = new JSONArray();
		skill.put("자바");
		skill.put("C++");
		
		root.put("skill", skill);
		
		String jsonData = root.toString();
		
		System.out.println(jsonData);
		
		try {
			Writer w = new FileWriter("C:/Temp/member.json",Charset.forName("UTF-8"));
			w.write(jsonData);
			w.flush();
			w.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		// JSON 파싱 // 
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("C:/Temp/member.json",Charset.forName("UTF-8")));
			String json =  br.readLine();
			br.close();
			
			// 파싱부분 //
			JSONObject root2 = new JSONObject(json);
			
			
			System.out.println("id : " + root2.getString("id"));
			System.out.println("age : " + root2.getInt("age"));
			System.out.println("student : " + root2.getBoolean("student"));
		
			
			
			JSONObject tel2 = root2.getJSONObject("tel");
			
			System.out.println(tel2.getString("home"));
			System.out.println(tel2.getString("mobile"));
			
			JSONArray skill2 = root.getJSONArray("skill");
			for(int i=0;i<skill2.length();i++)
			{
				System.out.println(skill2.get(i));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
