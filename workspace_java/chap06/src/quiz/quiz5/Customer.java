package quiz.quiz5;

public class Customer {
	
	String ID;
	Item[] bag;
	
	Customer(String ID) {
		this.ID = ID;
		this.bag = new Item[5];
	}
	Item[] PutIn(Item item1, Item item2) {
		this.bag[0] = item1;
		this.bag[1] = item2;

		return this.bag;
	}
	Item[] PutIn(Item item1, Item item2, Item item3) {
		this.bag[0] = item1;
		this.bag[1] = item2;
		this.bag[2] = item3;

		return this.bag;
	}
	Item[] PutIn(Item item1, Item item2, Item item3, Item item4) {
		this.bag[0] = item1;
		this.bag[1] = item2;
		this.bag[2] = item3;
		this.bag[3] = item4;
		return this.bag;
	}
	Item[] PutIn(Item item1, Item item2, Item item3, Item item4, Item item5) {
		this.bag[0] = item1;
		this.bag[1] = item2;
		this.bag[2] = item3;
		this.bag[3] = item4;
		this.bag[4] = item5;
		return this.bag;
	}
	
	void print() {
		for(int i = 0; i<this.bag.length; i++) {
			if(bag[i] != null) {
				System.out.print(bag[i].itemName +",");
				System.out.print(bag[i].price+",");
				System.out.println(bag[i].detail);
			}
		}
	}
}
