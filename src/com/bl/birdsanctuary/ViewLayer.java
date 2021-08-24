package com.bl.birdsanctuary;

public class ViewLayer {
	
	public void print(){
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		for(Bird bird: birdSanctuaryRepository.getAllBirds()) {
			System.out.println(bird);
		}
	}
	
	public void printFlyable(){
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		for(Bird bird: birdSanctuaryRepository.getAllBirds()) {
			bird.fly();
		}
	}
	
	public void printSwimmable(){
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		for(Bird bird: birdSanctuaryRepository.getAllBirds()) {
			bird.swim();
		}
	}
	
	public void printEatable(){
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		for(Bird bird: birdSanctuaryRepository.getAllBirds()) {
			bird.eat();
		}
	}
}
