package com.LineComparision;
import java.util.Scanner;

public class LineComparision {
	Scanner sc = new Scanner(System.in);
    int x1, y1, x2, y2;
    double len;

    public void Length() {
        System.out.println("Enter the Co-ordinates of x1 and y1 : ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        len = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("length of line is " + len);
    }

    public static void main(String[] args) {
    	LineComparision obj = new LineComparision();
        obj.Length();
    }
}
