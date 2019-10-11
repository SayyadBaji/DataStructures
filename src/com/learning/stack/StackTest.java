package com.learning.stack;

public class StackTest {

	public static void main(String[] args) throws Exception {
		CustomStack<String> stringStack = new CustomStack<String>(3);
		stringStack.push("Abc");
		stringStack.push("Bcd");
		stringStack.push("Cde");
		stringStack.push("Def");
		System.out.println("No.of elements before pop: "+stringStack.size());
		stringStack.pop();
		System.out.println("No.of elements after pop: "+stringStack.size());
		
		//*******
		CustomStack<Integer> intStack = new CustomStack<Integer>(3);
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		System.out.println("No.of elements before pop: "+intStack.size());
		intStack.pop();
		System.out.println("No.of elements after pop: "+intStack.size());
		
	}

}
