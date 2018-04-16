package com.rannn.uri;

import java.net.*;

public class URIDemo1 {
    // e.g.http://www.baidu.com:8888/books/book1.php?text=java#uri
    public static void main(String[] args) throws Exception {
//		if (args.length != 1) {
//			System.err.println("usage: java URIDemo1 uri");
//			return;
//		}
        URI uri = new URI("http://www.baidu.com:8888/books/book1.php?text=java#uri");

        System.out.println("Scheme = " + uri.getScheme());
        System.out.println("Authority = " + uri.getAuthority());
        System.out.println("Fragment = " + uri.getFragment());
        System.out.println("Host = " + uri.getHost());
        System.out.println("Path = " + uri.getPath());
        System.out.println("Port = " + uri.getPort());
        System.out.println("Query = " + uri.getQuery());
        System.out.println("Scheme = " + uri.getScheme());
        System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
        System.out.println("User Info = " + uri.getUserInfo());
        System.out.println("URI is absolute: " + uri.isAbsolute());
        System.out.println("URI is opaque: " + uri.isOpaque());

        System.out.println('\u0000');


    }
}
