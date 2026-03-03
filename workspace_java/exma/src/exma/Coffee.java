package exma;

import java.util.ArrayList;

public class Coffee {

	
	String name;
	int price;
	int count; 
	static int shotPrice;
	static int syrupPrice;
	boolean optionShot;
	boolean optionSyrup;
	boolean optionTempreture;
	boolean optionCupholder;
	boolean optionMilk;
	static ArrayList<Coffee> menuList = new ArrayList<>();
	static ArrayList <Coffee> bucket = new ArrayList();
	
	
	
	Coffee(String name, int price) {
	    this.price = price;
	    this.name = name;
	    this.count = 0;   // 초기 주문 수
	    menuList.add(this);
	    shotPrice = 100;
	    syrupPrice = 200;
	}

	
	static void shotPrice () {
		System.out.println("샷추가 가격: " + shotPrice);
	}
	static void syrupPrice () {
		System.out.println("시럽추가 가격: " +shotPrice);
	}
	
	static void callList() {
	    for (int i = 0; i < menuList.size(); i++) {
	        Coffee c = menuList.get(i);
	        System.out.println((i + 1) + ". " + c.name + " - " + c.price + "원");
	    }
	}
	
//	static void callBucket(Coffee m) {
//	    for (Coffee c : bucket) {
//	        if (c.name.equals(m.name)) {
//	            c.count++;
//	            return;
//	        }
//	    }
//	    m.count = 1;
//	    bucket.add(m);
//	}
	
	static void callBucket(Coffee m) {
	    for (Coffee c : bucket) {
	        if (c.name.equals(m.name)
	            && c.optionShot == m.optionShot
	            && c.optionSyrup == m.optionSyrup
	            && c.optionMilk == m.optionMilk
	            && c.optionCupholder == m.optionCupholder
	            && c.optionTempreture == m.optionTempreture) {

	            c.count += m.count;  
	            return;
	        }
	    }

	    Coffee copy = new Coffee(m.name, m.price);
	    copy.optionShot = m.optionShot;
	    copy.optionSyrup = m.optionSyrup;
	    copy.optionMilk = m.optionMilk;
	    copy.optionCupholder = m.optionCupholder;
	    copy.optionTempreture = m.optionTempreture;
	    copy.count = m.count;

	    bucket.add(copy);
	}



	
	static void callBucketList() {
	    for (Coffee c : bucket) {
	        System.out.println(c.name + " x " + c.count + "잔");
	    }
	}
	
	void ShotAdd() {
		this.optionShot = true;
	}
	void ShotNo() {
		this.optionShot = false;
	}
	void SyrupAdd() {
		this.optionSyrup = true;
	}
	void SyrupNo() {
		this.optionSyrup = false;
	}
	void hot() {
		this.optionTempreture = true;
	}
	void ice() {
		this.optionTempreture = false;
	}
	void cupholderAdd() {
		this.optionCupholder = true;
	}
	void cupholderNo() {
		this.optionCupholder = false;
	}
	
	void MilkAdd() {
		this.optionMilk = true;
	}
	void MilkNo() {
		this.optionMilk = false;
	}
	
	static int getTotalPrice() {
	    int total = 0;

	    for (Coffee a : bucket) {
	        int price = a.price * a.count;  

	        if (a.optionShot) {
	            price += shotPrice * a.count;
	        }
	        if (a.optionSyrup) {
	            price += syrupPrice * a.count;
	        }

	        total += price;
	    }

	    return total;
	}
	
}
