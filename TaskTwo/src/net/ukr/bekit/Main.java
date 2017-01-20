package net.ukr.bekit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		double c;
		System.out.println("Input side of the triangle:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		double p = (a + b + c) / 2;
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("S=" + s);

	}

}
