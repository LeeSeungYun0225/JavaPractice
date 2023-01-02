package SubStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class PrimitiveTypeStreamTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		OutputStream out = new FileOutputStream("C:/Temp/test001.txt");
		DataOutputStream dout = new DataOutputStream(out);
		
		List<Person> list = new ArrayList();
		
		list.add(new Person("홍길동",35,true));
		list.add(new Person("이순신",30,false));
		list.add(new Person("이성계",50,true));
	
		for(Person p:list)
		{
			
			try {
				dout.writeUTF(p.getName());
				dout.writeInt(p.getAge());
				dout.writeBoolean(p.isPassed());
			
				System.out.println("객체 저장 완료");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		try {
			dout.flush();
			dout.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		InputStream ins = new FileInputStream("C:/Temp/test001.txt");
		DataInputStream dis = new DataInputStream(ins);
		
		for(int i=0;i<3;i++)
		{
			try {
				Person p = new Person(dis.readUTF(),dis.readInt(),dis.readBoolean());
				System.out.println(p.toString());
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		try {
			dis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
