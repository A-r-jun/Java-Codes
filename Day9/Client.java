import java.io.*;
import java.net.*;



public class Client
{

	public static void main(String[] args) throws UnknownHostException, IOException 
	{

		Socket s = new Socket("192.168.5.73",556);

		String exit =".";
		
		while(!exit.equals("exit"))
		{
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.print("Client : ");
		String  msg = br.readLine();

		OutputStream os = s.getOutputStream();
		PrintStream ps = new PrintStream(os);
		
		ps.println(msg);	
		
		InputStream os1 = s.getInputStream();		
		InputStreamReader ir1 = new InputStreamReader(os1);
		BufferedReader br1 = new BufferedReader(ir1);

		   String msg1=br1.readLine();

		   System.out.println("		Server : " +msg1);	
	
		   if(msg1.equals("exit"))
			{
				exit=msg1;
			}
			
		
	}

	}
}