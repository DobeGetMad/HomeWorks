package homeWorks;

public class TestBox {
	public static void main(String[] args) {

		BirthdayGift[] poklon = new BirthdayGift[4];
		BirthdayGift p1 = new BirthdayGift();
		poklon[0] = poklon[1] = poklon[2] = poklon[3] =p1;

		for (BirthdayGift birthdayGift : poklon) {
			System.out.println("does it fly: " + p1.fly());
			p1.suprise(4, " friends");


		}

		IBox[] boxes = new IBox[3];
		for (int i = 0; i < boxes.length; i++) {
			boxes[i] = poklon[i];
		}

	}

}
