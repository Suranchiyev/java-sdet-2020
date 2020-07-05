package day43;

import java.time.Duration;
import java.time.Instant;

public class RuntimeStopwatch {
	public static void main(String[] args) {
		System.out.println(-5437 / 10);
		System.out.println(-3457 % 10);
		
		//print1000();
	}
	
	public static void print1000() {
		Instant start = Instant.now();
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("Hello, World!");
		}
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Milliseconds: " + timeElapsed);
	}
	
	// what's the time complexity of this program?
	// O(n) - linear time 
	public static void m1(int num) {
		for(int i = 0; i < num; i++) {
			
			// because this loop is constant 
			for(int j = 0; j < 1; j++) {
				System.out.println("Hello");
			}
		}
	}
	
	// what's the time complexity of this program?
	// O(1) - constant 
	public static void m2(String str) {
		for(int i = 0; i < 50; i++) {
			System.out.println(str);
		}
	}
	
	
	// what's the time complexity of this program?
	// O(n) - linear
	public static void m3(String str) {
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str);
		}
	}
	
	// what's the time complexity of this program?
	// O(n)  
	public static void m4(String[] arrStr) {
		
		for(int i = 0; i < arrStr.length; i++) {
			System.out.println(arrStr[i]);
		}
		
		for(int j = arrStr.length - 1; j >= 0; j--) {
			System.out.println(arrStr[j]);
		}
	}
	
	// what's the time complexity of this program?
	// O(n^2) 
	public static void m5(String str) {
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < str.length(); j++) {
				System.out.println(str);
			}
		}
	
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str);
		}
	}
	
	// what's the time complexity of this program?
	// O(n/2) -> O(n)
	public static void m6(String str) {
		for(int i = 0; i < str.length() / 2; i++) {
			System.out.println(str);
		}
	}
}
