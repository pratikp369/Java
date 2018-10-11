package File_Handeling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class BufferWriterEx {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Sandip/Documents/Java/abc.txt",true));
		bw.write("i am pratik");
		//bw.close();
//		BufferedReader br = new BufferedReader(new FileReader("C:/Users/Sandip/Documents/Java/abc.txt"));
//		String s;
//		while((s=br.readLine())!=null)
//		{
//			System.out.println("The Value is :"+s);
//		}

		bw.close();
	}

	}
