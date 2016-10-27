package com.xgqfrms.url;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URL01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		try {
			URL url1 = new URL("http", "xgqfrms.isitestar.cn", 80, "/index.html");
//			URL url1 = new URL("http", "xgqfrms.wix.com/xgqfrms", 80, "/index.html");
			InputStream inputStream = url1.openStream();
			Scanner scanner = new Scanner(inputStream);
			scanner.useDelimiter("\n");
			while (scanner.hasNext()) {

				System.out.println(scanner.next());

			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
