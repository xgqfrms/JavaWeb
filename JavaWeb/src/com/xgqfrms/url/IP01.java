package com.xgqfrms.url;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IP01 {

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress iAddress1=null;
		InetAddress iAddress2=null;
		Inet4Address inet4Address=null;
//		Inet6Address inet6Address=null;
//		iAddress1=InetAddress.getLocalHost();
		iAddress2=InetAddress.getByName("www.baidu.com");
//		try {
//			iAddress1.isReachable(3000);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		iAddress1=InetAddress.getLoopbackAddress();
		inet4Address=(Inet4Address) Inet4Address.getLocalHost();
//		inet6Address=(Inet6Address) Inet6Address.getLoopbackAddress();
		try {
			System.out.println(iAddress1+"\n"+iAddress2+"\n"+inet4Address+"\n"+iAddress1.isReachable(3000));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(iAddress1+"\n"+iAddress2+"\n"+inet4Address+"\n"+inet6Address+"\n");
		
		
		
		
	}

}
