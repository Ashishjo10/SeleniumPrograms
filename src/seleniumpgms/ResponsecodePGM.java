package seleniumpgms;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

public class ResponsecodePGM {
	String link="https://www.facebook.com/";
	
	@Test
	public void responseCodeFb()
	{
		try {
			URL u=new URL (link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			int rcode=con.getResponseCode();
			System.out.println(rcode);
			if(rcode==200)
			{
				System.out.println("Succeesful link");
			}
			else
			{
				System.out.println("Not Successful Link");
			}
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
