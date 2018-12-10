package com.gmail.kh;

import java.util.Scanner;

public class Hw5 {
	public static int word(String count) {
		char[] res = count.toCharArray();
		int a = 0;
		for (int i = 0; i < res.length; i++) {
			if (res [i] == ' ') {
				a++;
			}
		}
		return a;
		}
	public static void main(String[] args) {
		System.out.println("Enter a sentense");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		char[] res = text.toCharArray();
		System.out.println(word(text));
	}
}
