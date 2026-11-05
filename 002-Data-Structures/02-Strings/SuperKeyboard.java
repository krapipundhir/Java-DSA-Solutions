
//  * Topic: Java Inheritance & Method Overriding
//  * Problem: Java Method Overriding 2 (Super Keyword)
//  * Source: HackerRank
//  * Description: Demonstrates how to access parent class methods from a 
//  *              subclass using the 'super' keyword.
//  */

import java.util.*;
import java.io.*;

class BiCycle{
	String define_me(){
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle{
	String define_me(){
		return "a cycle with an engine.";
	}
	
	MotorCycle(){
		System.out.println("Hello I am a motorcycle, I am "+ define_me());

		String temp=super.define_me(); //Fix this line
        
		System.out.println("My ancestor is a cycle who is "+ temp );
	}
	
}
class SuperKeyboard{
	public static void main(String []args){
		MotorCycle m=new MotorCycle();
	}
}
