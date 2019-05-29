package day42_CustomClasses_encapsulation;

import java.util.ArrayList;

public class DSWShoeStore {

	public static void main(String[] args) {
		shoes shoes1 = new shoes();
		shoes1.setShoeData("Aldo", 7.5);
		System.out.println(shoes1.getShoesData());
		
		shoes shoes2 = new shoes();
		shoes2.setShoeData("Allen", 8);
		System.out.println(shoes2.getShoesData());
		
		shoes shoes3 = new shoes();
		shoes3.setShoeData("Boss Hugo Boss", 7);
		System.out.println(shoes3.getShoesData());
		
		shoes[] shoesArray = new shoes[3];
		shoesArray[0] = shoes1;
		shoesArray[1] = shoes2;
		shoesArray[2] = shoes3;
		System.out.println();
		System.out.println(shoesArray[0].getShoesData());
		System.out.println(shoesArray[1].getShoesData());
		System.out.println(shoesArray[2].getShoesData());
		
		System.out.println();
		System.out.println(shoesArray[0].brand);
		System.out.println(shoesArray[1].brand);
		System.out.println(shoesArray[2].brand);
		
		
		//ArrayList of shoes
		ArrayList<shoes> myShoes = new ArrayList<>();
		myShoes.add(shoes1);
		myShoes.add(shoes2);
		myShoes.add(shoes3);
		System.out.println();
		System.out.println(myShoes.get(0).getShoesData());
		System.out.println(myShoes.get(1).getShoesData());
		System.out.println(myShoes.get(2).getShoesData());
		
		System.out.println();
		System.out.println(myShoes.get(0).size);
		System.out.println(myShoes.get(1).size);
		System.out.println(myShoes.get(2).size);

		shoes redShoes = new shoes();
		System.out.println(redShoes.getShoesData());
		
		//print name of Shoes in the list that size is more than 7
		for(shoes Shoes : myShoes) {
			if(Shoes.size > 7.0) {
				System.out.println(Shoes.brand);
			}
		}
	}

}
