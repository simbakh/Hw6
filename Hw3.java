package com.gmail.kh;

public class Hw3 {
	public static void star(int h, int w) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h = 5;
		int w = 7;
		star(h, w);

	}

}
