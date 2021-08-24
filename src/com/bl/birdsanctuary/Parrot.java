package com.bl.birdsanctuary;

public class Parrot extends Bird  {
	
	public Parrot() {
		color = Color.GREEN;
		name = "Parrot";
	}

	@Override
	void fly() {
		System.out.println(name+" can fly");
	}

	@Override
	void swim() {
	}

	@Override
	void eat() {
		System.out.println(name+" can eat");
	}
	
}
