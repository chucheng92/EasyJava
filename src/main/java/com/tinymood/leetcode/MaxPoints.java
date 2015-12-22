package com.tinymood.leetcode;

import java.util.HashMap;
import java.util.Map;

class Point {
	 int x;
	 int y;
	 Point() { x = 0; y = 0; }
	 Point(int a, int b) { x = a; y = b; }
}

public class MaxPoints {
	public static void main(String[] args) {
		
	}
	
	public int maxPoints(Point[] points) {
		if (points.length<=0) return 0;
		if (points.length<=2) return points.length;
		int res = 0;
		for (int i=0; i<points.length; i++) {
			Map<Double, Integer> map = new HashMap<Double,Integer>();
			int samex=1, samep=0;
			for (int j=0; j<points.length; j++) {
				if (i!=j) {
					// same points
					if (points[j].x==points[i].x && points[j].y==points[i].y)
						samep++;
					// yÖá
					if (points[j].x==points[i].x) {
						samex++;
						continue;
					}
					// same slope
					double k = (double)(points[j].y-points[i].y)/(double)(points[j].x-points[i].x);
					if (map.containsKey(k)) {
						map.put(k, map.get(k)+1);
					} else {
						map.put(k, 2);
					}
					res = Math.max(res, map.get(k)+samep);
				}
			}
			res = Math.max(res, samex);
		}
		return res;
	}
	
}
