package pkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class FB {

	public static void main(String[] args) throws IOException {
		
		URL u=new URL("https://www.facebook.com");
	      HttpURLConnection c=(HttpURLConnection)u.openConnection();
	      
	     System.out.println( c.getResponseCode());
		
		//float d=4.5f;
		//double d1=(double)d;

	}

}
