package com.rannn.uri;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.nio.charset.Charset;

/**
 * Created by insomnia on 2018/1/18.
 */
public class URIURLTest {
    public static void main(String[] args) throws URISyntaxException {
        File f = new File("a.txt");
        System.out.println(f.getAbsolutePath());
        // returns the uri string
        URI uri = f.toURI();
        try {
            URL url = f.toURL();
            System.out.println("url: " + url);
            System.out.println("uri: " + uri);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        String encodedJarPath =
                URIURLTest.class.getProtectionDomain().getCodeSource().getLocation().getPath();

        System.out.println(encodedJarPath);

        String decodedPath = null;
        try {
            decodedPath = URLDecoder.decode(encodedJarPath, Charset.defaultCharset().name());
            URI uri2 = new File(decodedPath).toURI();
            System.out.println("uri2=" + uri2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
