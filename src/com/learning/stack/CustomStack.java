package com.learning.stack;

public class CustomStack<Type extends Object> {
	
	private int size;
	private int top;
	private Type[] stackArray; 
	private int elementCount = 0;
	
	CustomStack(int size){
		this.size = size;
		this.top = -1;
		this.stackArray = (Type[]) new Object[size];
	}
	
	public void push(Type element) {
		if(this.isStackFull()) {
			System.out.println("Stack size limit exceeded. So increasing size");
			this.increaseStackSize();
			addElement(element);
		} else {
			addElement(element);
		}
	}

	private void addElement(Type element) {
		this.stackArray[++top] = element;
		elementCount++;
		System.out.println("Element added successfully!!!");
	}

	private void increaseStackSize() {
		int loadFactor = 2;
		Type[] newStack = (Type[]) new Object[size * loadFactor];
		for(int i=0; i<size; i++) {
			newStack[i] = stackArray[i];
		}
		this.stackArray = newStack;
		this.size = size * loadFactor;
		System.out.println("New size after resizing: "+size);
	}

	private boolean isStackFull() {
		return (top == (size - 1));
	}
	
	public Type pop() throws Exception {
		if(this.isStackEmpty()) {
			throw new Exception("Empty stack!!!");
		}
		Type element = this.stackArray[top--];
		elementCount--;
		System.out.println("Removed element: "+element);
		return element;
	}

	private boolean isStackEmpty() {
		return (top == -1);
	}

	public int size() {
		return elementCount;
	}

}
