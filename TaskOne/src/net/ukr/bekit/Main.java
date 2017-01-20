package net.ukr.bekit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Input five-digit number");
		x=sc.nextInt();
		int first=x/10000;
		System.out.println(first);

		int residualFirst=x%10000;
		int second=residualFirst/1000;
		System.out.println(second);

		int residualSecond=residualFirst%1000;
		int third=residualSecond/100;
		System.out.println(third);

		int residualThird=residualSecond%100;
		int fourth=residualThird/10;
		System.out.println(fourth);

		int fifth=residualThird%10;
		System.out.println(fifth);
			}

		}
