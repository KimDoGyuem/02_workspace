package com.util;

public class Cw {
	private static final String DOT1 = "💻";
	private static final String DOT2 = "🛠";
	private static final int LINE_LENGTH = 40;

	public static void w(String s) {
		System.out.print(s);
	}

	public static void wn(String s) {
		System.out.println(s);
	}

	public static void wn() {
		System.out.println();
	}

	public static void line(int x) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < LINE_LENGTH; j++) {
				w(DOT1);
			}
			wn();
		}
	}

	public static void dot(int y) {
		for (int i = 0; i < y; i++) {
			w(DOT1);
		}
	}

	public static void space(int c) {
		for (int i = 0; i < c; i++) {
			w(" ");
		}
	}
	
	public static void mline(int x) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < LINE_LENGTH; j++) {
				w(DOT2);
			}
			wn();
		}
	}
	
	public static void mdot(int y) {
		for (int i = 0; i < y; i++) {
			w(DOT2);
		}
	}
	
}
