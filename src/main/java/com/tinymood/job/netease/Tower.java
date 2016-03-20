package com.tinymood.job.netease;

import java.util.*;

public class Tower {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int res = 0;
        	int r,x1,y1,x2,y2,x3,y3,x0,y0;
   			r = sc.nextInt();
        	x1 = sc.nextInt();
       	 	y1 = sc.nextInt();
        	x2 = sc.nextInt();
        	y2 = sc.nextInt();
        	x3 = sc.nextInt();
        	y3 = sc.nextInt();
        	x0 = sc.nextInt();
        	y0 = sc.nextInt();
        	double dist1 = Math.sqrt((x1-x0)*(x1-x0)+(y1-y0)*(y1-y0));
        	double dist2 = Math.sqrt((x2-x0)*(x2-x0)+(y2-y0)*(y2-y0));
        	double dist3 = Math.sqrt((x3-x0)*(x3-x0)+(y3-y0)*(y3-y0));
        	if (r > dist1) {
            	res++;
			}
        	if (r >= dist2) {
            	res++;
        	}
        	if (r >= dist3) {
            	res++;
        	}
        	System.out.println(String.valueOf(res)+"x");
        }
    }
}
