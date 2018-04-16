package com.rannn.other;

import org.apache.commons.cli.Option;

/**
 * Created by insomnia on 2018/1/18.
 */

//apache commons Option类测试
public class CommonsCLITest {
    public static void main(String[] args) {
        String shortPrefix = "shortPrefix";
        String longPrefix = "longPrefix";
        final Option APPLICATION_ID = new Option(shortPrefix + "id", longPrefix + "applicationId", true, "Attach to running YARN session");
        System.out.println(APPLICATION_ID.getOpt());
        System.out.println(APPLICATION_ID.getValue());
        System.out.println(APPLICATION_ID.getLongOpt());
        System.out.println(APPLICATION_ID.getDescription());
        System.out.println(CommonsCLITest.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        System.out.println(CommonsCLITest.class.getProtectionDomain().getCodeSource().getLocation().getPath());
    }
}
