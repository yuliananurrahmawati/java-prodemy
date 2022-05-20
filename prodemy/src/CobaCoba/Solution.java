package CobaCoba;

//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//class Animal {
//	public void eat() {
//		System.out.print("Parrots can eat up to 100 gms in a day");
//	}
//
//	public void makeSound() {
//		System.out.print("Parrots make sound of screech");
//	}
//}
//
//class Bird extends Animal {
//	int legs = 2;
//
//	public void fly() {
//		System.out.print("Parrots can fly up to 50 miles in a day");
//	}}
//
//class Parrot extends Bird{
//	
//}
//public class Solutions{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            String name = sc.nextLine();
//            
//            Parrot p = new Parrot();
//            if(name.equals("eat")){
//                p.eat();
//            }
//            if(name.equals("makeSound")){
//                p.makeSound();
//            }
//            if(name.equals("fly")){
//                p.fly();
//            }
//        }
//    }
//}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal {
	public void eat() {
		System.out.print("Parrots can eat up to 100 gms in a day");
	}

	public void makeSound() {
		System.out.print("Parrots make sound of screech");
	}
}

class Bird extends Animal {
	int legs = 2;

	public void fly() {
		System.out.print("Parrots can fly up to 50 miles in a day");
	}
}

class Parrot extends Bird {

}

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			String name = sc.nextLine();
			Parrot p = new Parrot();
			if (name.equals("eat")) {
				p.eat();
			}
			if (name.equals("makeSound")) {
				p.makeSound();
			}
			if (name.equals("fly")) {
				p.fly();
			}
		}
	}
}
