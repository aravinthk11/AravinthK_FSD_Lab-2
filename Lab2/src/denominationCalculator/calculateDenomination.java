package denominationCalculator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class calculateDenomination {

	Integer[] denominations;
	int paymentAmount;	
	Scanner input;
	
	public calculateDenomination() 
	{
		
		input = new Scanner(System.in);
	}
	
	void collectDenominations()
	{
		
		System.out.println("Enter the size of currency Denominations ");
		
		int denominationsSize = input.nextInt();
		
		denominations = new Integer[denominationsSize];
		
		System.out.println("Enter the currency denominations value");
		
		for (int index = 0; index < denominationsSize; index ++) {
			
			denominations[index] = input.nextInt();
		}
	}
	
	void collectPaymentAmount() 
	{
		
		System.out.println("Enter the amount you want to pay");
		
		paymentAmount = input.nextInt();		
	}
	
	void calculate()
	{
		Arrays.sort(denominations, Collections.reverseOrder());
		
		int payAmt = paymentAmount;
		int countOfDenomination = 0;
		boolean flag = false;
		
		for (int index=0; index<denominations.length; index++)
		{
			int denomination = denominations[index];
			
			countOfDenomination = payAmt / denomination;
			
			int balAmt = payAmt % denomination;
			
			if (countOfDenomination > 0 )
			{
				System.out.println (denomination + " : " + countOfDenomination);				
			}
			
			if (balAmt == 0)
			{
				flag = true;
				break;
			}
			
			payAmt = balAmt;
			
		}
		
		if (flag == true)
			
			System.out.println("Your payment approach in order to give min no of notes will be as shown above");
		
		else
			
			System.out.println("Cannot pay in the exact denomination");
	}

}
