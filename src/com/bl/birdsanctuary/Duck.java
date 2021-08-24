package com.bl.birdsanctuary;

public class Duck extends Bird {

	public Duck() {
		color = Color.GREY;
		name = "Duck";
	}

	@Override
	void fly() {
		System.out.println(name+" can fly");
	}

	@Override
	void swim() {
		System.out.println(name+" can swim");	
	}

	@Override
	void eat() {
		System.out.println(name+" can eat");
	}

}
