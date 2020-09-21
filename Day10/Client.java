import java.io.*;
import java.net.*;


public class Client
{

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		
				Socket s = new Socket("192.168.5.73",555);
				
				
				
			
				Emp e = new Emp(1,"A",10000);
				
				OutputStream os = s.getOutputStream();
				ObjectOutputStream oo = new ObjectOutputStream(os);
				oo.writeObject(e);
				
				
				s.close();
				
				
				
				
				
				
		
	}
}
