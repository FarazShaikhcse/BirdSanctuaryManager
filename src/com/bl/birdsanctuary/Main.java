package com.bl.birdsanctuary;

import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		
		Main main = new Main();
		main.showUserMenu();
		System.out.println("Good Bye!!!");
		
	/*	
		Parrot parrot = new Parrot();
		parrot.id = "p001";
		Duck duck = new Duck();
		duck.id = "d001";
		Ostrich ostrich = new Ostrich();
		ostrich.id = "ost001";
		Penguin penguin = new Penguin();
		penguin.id = "pn001";
		Penguin penguin2 = new Penguin();
		penguin2.id = "pn001";
		
		BirdSanctuaryRepository birdSanctuaryRepository = new BirdSanctuaryRepository();
		birdSanctuaryRepository.add(parrot);
		birdSanctuaryRepository.add(duck);
		birdSanctuaryRepository.add(ostrich);
		birdSanctuaryRepository.add(penguin);
		birdSanctuaryRepository.add(penguin2);
		
		System.out.println("Before deleting");
		birdSanctuaryRepository.print();
		
		birdSanctuaryRepository.remove(penguin);
		
		System.out.println("\nAfter deleting");
		birdSanctuaryRepository.print();
		*/
		
	}
	public void showUserMenu() {
		int option = 0;
		Scanner scanner = new Scanner(System.in);
		final int EXIT_VALUE = 10;
		
		while(option!=EXIT_VALUE) {
		System.out.println("Enter your option");
		System.out.println("1. Add a bird\n2. Remove a Bird\n3. Print all the birds\n4. Print Swimable\n"
				+ "5. Print Flyable\n6. Print Eatable\n" + EXIT_VALUE + ". Exit");
		option=scanner.nextInt();
		switch(option) {
		case 1: Parrot parrot = new Parrot();
			parrot.id = "p001";
			Duck duck = new Duck();
			duck.id = "d001";
			Ostrich ostrich = new Ostrich();
			ostrich.id = "ost001";
			Penguin penguin = new Penguin();
			penguin.id = "pn001";	
			
			BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
			birdSanctuaryRepository.add(parrot);
			birdSanctuaryRepository.add(duck);
			birdSanctuaryRepository.add(ostrich);
			birdSanctuaryRepository.add(penguin);
			break;
			
		case 2: System.out.println("Enter the Bird name to be removed");
				Scanner reader = new Scanner(System.in);
		        String name = reader.nextLine();
		        birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		        Bird bird = birdSanctuaryRepository.getBird(name);
		        if(bird==null) {
		        	System.out.println("Bird doesn't exist");
		        }
		        else {
		        birdSanctuaryRepository.remove(bird);
		        System.out.println(name+" removed");
		        }
		      break;
		      
		case 3: ViewLayer viewLayer = new ViewLayer();
				viewLayer.print();
				break;
				
		case 4: viewLayer = new ViewLayer(); 
				viewLayer.printSwimmable();
				break;
				
		case 5: viewLayer = new ViewLayer(); 
				viewLayer.printFlyable();
				break;
				
		case 6: viewLayer = new ViewLayer(); 
				viewLayer.printEatable();
				break;
			
		}
		
	}

	}
}
