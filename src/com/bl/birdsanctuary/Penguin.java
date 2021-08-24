package com.bl.birdsanctuary;

public class Penguin extends Bird {

			public Penguin() {
				color = Color.WHITE;
				name = "Penguin";
			}

			@Override
			void fly() {
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
