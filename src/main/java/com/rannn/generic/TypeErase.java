package com.rannn.generic;

import java.util.HashMap;
import java.util.Map;

public class TypeErase {
    public static void main(String[] args) {
        // 1
        Map<String, String> map = new HashMap<>();
        map.put("hello", "你好");
        map.put("world", "世界");

        System.out.println(map.get("hello"));
        System.out.println(map.get("world"));
    }
    // 2
//	public static String method(List<String> list) {
//		System.out.println("invoke method(List<String> list)");
//		
//		return "";
//	}
//	
//	public static int method(List<Integer> list) {
//		System.out.println("invoke method(List<Integer> list)");
//		
//		return 1;
//	}
}

// ===========================
// 反编译后的结果

// package com.ryan.javase.generic;
//
// import java.io.PrintStream;
// import java.util.HashMap;
// import java.util.Map;
//
// public class TypeErase
// {
//
// public TypeErase()
// {
// }
//
// public static void main(String args[])
// {
// Map map = new HashMap();
// map.put("hello", "你好");
// map.put("world", "世界");
// System.out.println((String)map.get("hello"));
// System.out.println((String)map.get("world"));
// }
// }