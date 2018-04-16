package com.rannn.io;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by insomnia on 2018/1/18.
 */
public class PrintStreamTest {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        final String format = "|%-16s |%-16s %n";
        ps.format(format, "NodeID", "nodeid123");
        ps.format(format, "Memory",  "123MB");
        ps.format(format, "vCores", "4421121");
        ps.format(format, "HealthReport", "HealthReport");
        ps.format(format, "Containers", "15");
        ps.println("+---------------------------------------+");

        System.out.println(ps.toString());
        System.out.println("++++++++++");
        System.out.println(baos.toString());
    }
}
