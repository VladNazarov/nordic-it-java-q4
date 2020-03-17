package com.zoo.animal;

public class Dog extends Animal {

	public Dog() {
		super();

	}

	public Dog(String name, int age) {
		super(name, age);

	}

	public void say() {
		System.out.println("Gav Gav");
	}

	public void afraid() {
		System.out.println("I`m afraid of cars");
	}

	public void guard() {
		System.out.println("I`m guarding the house");
	}

}