package denominationCalculator;

public class Main {

	public static void main(String[] args) {
		
		calculateDenomination calculator = new calculateDenomination();
	
		calculator.collectDenominations();
		
		calculator.collectPaymentAmount();
		
		calculator.calculate();
		
	}

}
