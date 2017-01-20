package net.ukr.bekit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double r;
		System.out.println("Input R of circle:");
		r = sc.nextDouble();
		double L = 2 * Math.PI * r;
		System.out.println("L=" + L);
	}

}
