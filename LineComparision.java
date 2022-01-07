package com.LineComparision;
import java.util.Scanner;

public class LineComparision {
	 public void Linecompair() {
	        Scanner sc = new Scanner(System.in);
	        int x1, y1, x2, y2, x3, y3, x4, y4;
	        double len1, len2;

	        System.out.println("Enter the Co-ordinates of len1 : ");
	        System.out.println("Enter the Co-ordinates of x1 and y1 : ");
	        x1 = sc.nextInt();
	        y1 = sc.nextInt();
	        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
	        x2 = sc.nextInt();
	        y2 = sc.nextInt();

	        System.out.println("Enter the Co-ordinates of len2 : ");
	        System.out.println("Enter the Co-ordinates of x3 and y3 : ");
	        x3 = sc.nextInt();
	        y3 = sc.nextInt();
	        System.out.println("Enter the Co-ordinates of x4 and y4 : ");
	        x4 = sc.nextInt();
	        y4 = sc.nextInt();

	        len1 = Math.round(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
	        len2 = Math.round(Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2)));

	        System.out.println("length of line 1 is " + len1);
	        System.out.println("length of line 2 is " + len2);
	        if (len1 == len2) {
	            System.out.println("line 1 is equal to line 2");

	        } else if (len1 > len2) {
	            System.out.println("line 1 is greater than line 2");
	        } else {
	            System.out.println("line 1 is less than line 2");
	            sc.close();
	        }
	    }

	    public static void main(String[] args) {
	    	LineComparision obj = new LineComparision();
	        obj.Linecompair();

	    }
}
