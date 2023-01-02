package SubStream;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File dir = new File("C:/Temp/images");
		File f1 = new File("C:/Temp/file1.txt");
		File f2 = new File("C:/Temp/file2.txt");
		
		if(dir.exists() == false)
		{
			dir.mkdirs();
		}
		if(f1.exists() == false)
		{
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(f2.exists() == false)
		{
			try {
				f2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		File temp = new File("C:/Temp");
		
		File[] content = temp.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		for(File f:content)
		{
			System.out.printf("%-25s",sdf.format(new Date(f.lastModified())));
			if(f.isDirectory())
			{
				System.out.printf("%-10s%-20s","<DIR>",f.getName());
			}
			else
			{
				System.out.printf("%-10S%-20s",f.length(), f.getName());
			}
			
			System.out.println();
		}
		
	}

}
