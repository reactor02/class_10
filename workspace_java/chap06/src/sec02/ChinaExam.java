package sec02;

public class ChinaExam {

	public static void main(String[] args) {
		
		China store = new China();
		China store2 = new China();
		
		System.out.println(store.address);
		System.out.println(store.name);
		System.out.println(store.menus[0]);
		System.out.println(store.menus[1]);
		
		store.address = "서북구";
		store.name = "짬뽕천국";
		store.menus[0] = "왕짬뽕";
		store.menus[1] = "황제짬뽕";
		
		System.out.println(store.address);
		System.out.println(store.name);
		System.out.println(store.menus[0]);
		System.out.println(store.menus[1]);
		
		System.out.println(store2.address);
		System.out.println(store2.name);
		System.out.println(store2.menus[0]);
		System.out.println(store2.menus[1]);
		
		store2.address = "동남구";
		store2.name = "용상각";
		store2.menus[0] = "짜장면";
		store2.menus[1] = "탕수육";
		System.out.println(store2.address);
		System.out.println(store2.name);
		System.out.println(store2.menus[0]);
		System.out.println(store2.menus[1]);
		
	}

}
