import java.io.*;

import java.net.*;


public class Server
{
public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		
		ServerSocket ss = new ServerSocket(555);
		
		Socket s = ss.accept();
		System.out.println("Connected");
		
	
		InputStream os = s.getInputStream();
		ObjectInputStream oi = new ObjectInputStream(os);
		
		Emp obj= (Emp) oi.readObject();
		

		obj.DisplayEmpData();
		
		ss.close();
		
		
		
		
		
		
	}

}
