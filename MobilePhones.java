package homeWorks;

public class MobilePhones {

	public static void main(String[] args) {
		String [] phones  = new String[5];
		phones [0] = "iphone";
		phones [1] = "samsung";
		phones [2] = "huawei";
		phones [3] = "alcatel";
		phones [4] = "xiaomi";


		System.out.println();
		if (phones[0].equals("huawei")) {	
			System.out.println("it is iphone");
		}else {
			System.out.println("it is not iphone");
		}

		System.out.println();
		switch (phones[0]) {
		case "iphone":
			System.out.println("it is iphone");
			break;
		case "samsung":
			System.out.println("it is samsung");
			break;
		case "huawei":
			System.out.println("it is huawei");
			break;
		case "alcatel":
			System.out.println("it is alcatel");
			break;
		case "xiaomi":
			System.out.println("it is xiaomi");
			break;
		default:
			System.out.println("u are not talking about phones");
			break;
		}
		System.out.println();
		for(int i = 0; i < phones.length; i++) {
			System.out.println("the phone is: " + phones[i]);
		}
		System.out.println();
		for (String phone : phones) {
			System.out.println("the phone is: " + phone);
		}
		System.out.println();
		int i = 0;
		while (i < phones.length) {
			System.out.println("the phone is: " + phones[i]);
			i++;
		}

		System.out.println();
		int p = 0;
		do {
			System.out.println("the phone is: " + phones[p]);
			p++;
		} while (p < phones.length);
	}

}

