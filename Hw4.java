package com.gmail.kh;

import java.util.Scanner;

public class Hw4 {
	public static int search(int[] line, int num) {
		int a=0;
		for (int i = 0; i < line.length; i++) {

			if (line[i] == num) {
				a = i;
				break;
			} else {
				a = -1;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mas =  {31,3,4,6,7,8,76,55};
	System.out.println(search(mas,6));
		
	}
}

