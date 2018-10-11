package Try_Catch;
import java.io.IOException;
//import java.lang.Exception;

public class Unchacked {

	public static void main(String[] args) {
		
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
