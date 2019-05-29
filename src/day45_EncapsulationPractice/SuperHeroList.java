package day45_EncapsulationPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class SuperHeroList {
	//its an instance variable
		public static void main(String[] args) {
			
			//we created an object of SUperHero class
			//Why?
			//because we want to get instance variables superheroes
			//that stores array of strings with superheroes names
			SuperHero object = new SuperHero();
			//we created an array list of strings
			ArrayList<String> superheroes = new ArrayList<String>();
			//addAll method allows to add whole arrayList/list
			superheroes.addAll(Arrays.asList(object.superheroes));
		}
	}


