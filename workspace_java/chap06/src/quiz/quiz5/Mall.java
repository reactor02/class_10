package quiz.quiz5;

public class Mall {
	public static void main(String[] args) {
		//쇼핑몰(mall)
		// 1.상품 3개 이상 진열
		// 2.회원 2명 이상
		// 3.
		Item[] item = new Item[3];
		
		item[0] = new Item("water", 1200, "물입니다");
		item[1] = new Item("cookies", 3000, "과자입니다");
		item[2] = new Item("vegetables", 5000, "채소입니다");
		
		Customer customer1 = new Customer("guest1");
		Customer customer2 = new Customer("guest2");
		
		customer1.PutIn(item[0], item[1]);
		customer1.print();
		customer2.PutIn(item[2], item[1], item[2]);
		customer2.print();
		
	}
}
