
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Statistics stat = new Statistics();
		//μπορει να χειριζεται φοιτητες και τραπεζικους λογαριασμους
		BankAccount ba1 = new BankAccount(1500);
		BankAccount ba2 = new BankAccount(2700);
		BankAccount ba3 = new BankAccount(900);
		
		stat.add(ba1);
		stat.add(ba2);
		stat.add(ba3);
		
		System.out.println("Average: "+stat.getAverage());
		System.out.println("Maximum: "+stat.getMaximum().getMeasure());
		System.out.println("Minimum: "+ stat.getMinimum().getMeasure());
		
		
		
	}

}
