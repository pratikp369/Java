package File_Handeling;
import java.io.*;
public class Myfile {

	public static void main(String[] args) {
		
		 File a = new File("C:/Users/Sandip/Documents/Java/abc.txt");
		 try {
			a.createNewFile();
		} catch (IOException e) {
			e.printStackTrace(); 
		}
//	FileInputStream is = new FileInputStream(a);
   System.out.println("File name is :"+a.getName());
   System.out.println("File can write :"+a.canWrite());
   System.out.println("The File size is :"+a.length());
   System.out.println("File exits :"+a.exists());

   
	}

}
