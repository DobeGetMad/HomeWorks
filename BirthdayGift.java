package homeWorks;

public class BirthdayGift implements IBox, GiftBox, Package {

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String rollItUp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String unboxing() {
		// TODO Auto-generated method stub
		return null;
	}

	public String suprise(int numberOfPeople, String type) {
		System.out.println("This is special day for " + numberOfPeople + " people, my best " + type);
		return "i love java";
	}

}
