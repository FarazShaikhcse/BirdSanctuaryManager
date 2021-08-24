package com.bl.birdsanctuary;

public class Ostrich extends Bird  {

	Ostrich(){
		color = Color.GREY;
		name = "Ostrich";
	}

	@Override
	void fly() {
	}

	@Override
	void swim() {
	}

	@Override
	void eat() {
		System.out.println(name+" can eat");
	}
}
