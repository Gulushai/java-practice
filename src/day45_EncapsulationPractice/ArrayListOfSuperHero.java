package day45_EncapsulationPractice;

import java.util.ArrayList;

public class ArrayListOfSuperHero {
	public static void main(String[] args) {
		ArrayList<String> superheroes = new ArrayList<>();
		superheroes.add("Spiderman");
		//it takes 2 params
		//first is position, second is value to set
		//there is no 2 element, so we cannot set it
		//superheroes.add(1, "IronMan");
		superheroes.add("Iron man");
		superheroes.add("Hulk");
		superheroes.add("Wonder Woman");
		superheroes.add("Thor");
		superheroes.add("Batman");
		superheroes.add("Flash");
		superheroes.add("Capitan America");
		superheroes.add("Aquaman");
		superheroes.add("Ant-man");
		System.out.println(superheroes);
		
		//lets creat an arraylist that will store superheroes that have space in the name
		ArrayList<String> superheroesWithSpace = new ArrayList<>();
		String longestName ="";
		for(String hero: superheroes) {
			//this one checks if name contains space
			//if so, add it to the new arraylist
			if(hero.contains(" ")) {
				superheroesWithSpace.add(hero);
			}
			if(hero.length()>longestName.length()) {
				longestName = hero;
			}
		}
		System.out.println(superheroesWithSpace);
		System.out.println("The longest name: "+longestName);
		
		//how to find second longest word?
		String secondLongest = "";
		for(String secondHero : superheroes) {
			//but, this time do not include longest word in the search
			if(secondHero.length()>secondLongest.length() && !secondHero.equals(longestName)) {
				secondLongest = secondHero;
			}
		}
		System.out.println("The second longest name: "+secondLongest);
	}
}
