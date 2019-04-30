package day25_Arrays;

public class Shopping {

	public static void main(String[] args) {
		String[] products = {"Timberland Shoes", "H&M shirt", "Swatch Watch", "Gucci Bag", "Adidas socks"};
		double[] prices = {120.0, 5.99, 150.50, 3000.5, 6.99};
		int[] itemsId = {1234556, 1343124, 5342534, 564253, 465434};
		
		//Print count of products:
		System.out.println("Products count: "+products.length);
		
		//check if products, prices and itemsIds have same count
		if (products.length == prices.length && products.length == itemsId.length) {
			System.out.println("Shopping list looks good");
		}else {
			System.out.println("Something is wrong with this list");
			return;
		}
		
		//loop through products and print each one in separate line
		
		for(String product: products) {
			System.out.println(product);
		}
		
		for(int i=0; i<prices.length; i++) {
			System.out.println(prices[i]);
		}
		
		System.out.println(itemsId[itemsId.length-1]);
		for(int p=itemsId.length-1; p>=0; p--) {
			System.out.println(itemsId[p]);
		}
		
		System.out.println();
		int totalPrice =0;
		for(int t=0; t<products.length; t++) {
			System.out.println("Item " + (t+1) + ": "+ itemsId[t] + " - " + products[t] + " - $"+ prices[t]);
		}
		
		System.out.println();
		double totalP =0.0;
		for(int t=0; t<products.length; t++) {
			System.out.println("Item " + (t+1) + ": "+ itemsId[t] + " - " + products[t] + " - $"+ prices[t]);
			totalP +=prices[t];
		}
		System.out.println("Total price: $" +totalP);
		
		//find the most expensive item in your list and print
		
		int maxIndex =0;
		double maxPrice = 0;
		for (int j = 0; j<prices.length; j++) {
			if(prices[j]>maxPrice) {
				maxPrice = prices[j];
				maxIndex = j;
			}
		}
			System.out.println(itemsId[maxIndex] + " - " + products[maxIndex] + " - $"+ prices[maxIndex]);
		
	}

}
