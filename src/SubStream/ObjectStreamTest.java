package SubStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		OutputStream os = new FileOutputStream("C:/Temp/Test11.txt");

		ObjectOutputStream oos = new ObjectOutputStream(os);

		
		
		List<Person> list = new ArrayList();
		
		list.add(new Person("김동구",10,true));
		list.add(new Person("김홍구",15,true));
		list.add(new Person("한석봉",12,false));
		list.add(new Person("연성규",17,false));
		list.add(new Person("이무리",15,true));
		
		for(Person p:list)
		{
			oos.writeObject(p);
			
		}
		
		oos.flush();
		
		
		InputStream ins = new FileInputStream("C:/Temp/Test11.txt");
		ObjectInputStream onis = new ObjectInputStream(ins);
		
		while(true)
		{
			try {
				Person temp = (Person) onis.readObject();
		
				System.out.println(temp);
			}catch(EOFException e)
			{	
				break;
			}
			
		}
		
		oos.close();
		onis.close();
	}

}
