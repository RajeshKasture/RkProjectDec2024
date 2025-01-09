package test;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Scannerclass {
	@Test
	 void test1() {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter a Name");
		 
		String name = sc.nextLine();
		 System.out.println(name);
	}
}
