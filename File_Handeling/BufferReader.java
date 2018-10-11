package File_Handeling;
import java.io.IOException;
import java.io.*;
public class BufferReader {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/Sandip/Documents/Java/abc.txt"));
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println("The Value is :"+s);
		}

		br.close();
	}

}
