package com.bl.birdsanctuary;

import java.util.ArrayList;
import java.util.List;

public class BirdSanctuaryRepository {

	private List birdList = new ArrayList();
	
	public void add(Bird bird){
		
		birdList.add(bird);
	}
	
	public void print(){

		birdList.forEach((bird)-> System.out.println(bird));;
	}
}
