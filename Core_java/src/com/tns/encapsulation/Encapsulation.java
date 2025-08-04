package com.tns.encapsulation;

import java.util.Scanner;

public class Encapsulation {

	
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("Rohan");
		p1.setId(1);
		System.out.println(p1);
		
		Person p2=new Person();
		p2.setId(2);
		p2.setName("Ram");
		System.out.println(p2);
		
		Person p3=new Person();
		p3.setId(3);
		p3.setName("luckey");
		System.out.println(p3);
		
		Person p4=new Person(4,"sham");
		System.out.println(p4);
				
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		System.out.println("Enter name");
		String name=sc.next();
		
		Person p5=new Person(id,name);
		System.out.println(p5);
		
	}
}
