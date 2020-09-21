import java.io.*;
import java.net.*;

public class Server
{
	public static void main(String[] args) throws IOException
	
{
		
		ServerSocket ss = new ServerSocket(556);
		Socket s = ss.accept();
		System.out.println("connected");
		
		String exit =".";
		
		while(!exit.equals("exit"))
		{
		InputStream os = s.getInputStream();		
		InputStreamReader ir = new InputStreamReader(os);
		BufferedReader br = new BufferedReader(ir);

		   String msg=br.readLine();

		   System.out.println("Client : " +msg);	
		   
			OutputStream os1 = s.getOutputStream();
			PrintStream ps = new PrintStream(os1);
			
			InputStreamReader ir1 = new InputStreamReader(System.in);
			BufferedReader br1 = new BufferedReader(ir1);
			System.out.print("			Server : ");
			String  msg1 = br1.readLine();
			ps.println(msg1);
			
			
			if(msg1.equals("exit"))
			{
				exit=msg1;
			}
			
		}	
		   
}
	
}
