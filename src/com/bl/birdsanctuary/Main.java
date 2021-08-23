package com.bl.birdsanctuary;

public class Main {

	public static void main(String[] args) {
		
		Parrot parrot = new Parrot();
		Duck duck = new Duck();
		Ostrich ostrich = new Ostrich();
		Penguin penguin = new Penguin();
		
		BirdSanctuaryRepository birdSanctuaryRepository = new BirdSanctuaryRepository();
		birdSanctuaryRepository.add(parrot);
		birdSanctuaryRepository.add(duck);
		birdSanctuaryRepository.add(ostrich);
		birdSanctuaryRepository.add(penguin);
		birdSanctuaryRepository.print();
	}

}
