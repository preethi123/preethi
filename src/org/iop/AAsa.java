package org.iop;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class AAsa {
	public static void main(String[] args) throws Throwable {
		URL url=new URL("https://www.google.com/");
		HttpURLConnection con=(HttpURLConnection)url.openConnection();
		int code = con.getResponseCode();
		System.out.println(code);
		String message = con.getResponseMessage();
		System.out.println(message);
	}

}
