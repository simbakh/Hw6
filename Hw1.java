package com.gmail.kh;

import java.util.Arrays;
import java.util.Scanner;

public class Hw1 {
	public static int arr(int[] mas) {
		int max = mas[0];
		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > max) {
				max = mas[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] mas = new int[5];
		for (int i = 0; i < mas.length; i++) {
			System.out.println("Enter the numbers");
			mas[i] = sc.nextInt();
		}
		System.out.println(arr(mas));
	}

}
