package com.rannn.comparable;

/**
 * Created by Ryan Tao on 2015/3/9.
 */
public class Info {
    private String str;

    public Info(String str) {
        this.str = str;
    }

    public int compareTo(Info info) {
        if (this.str.compareTo(info.str) > 0)
            return 1;
        else if (this.str.compareTo(info.str) == 0)
            return 0;
        else
            return -1;
    }

    public String getStr() {
        return str;
    }
}
