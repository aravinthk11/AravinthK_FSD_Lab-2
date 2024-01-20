package dailyTarget;

import java.util.Scanner;

class TargetDeterminator 
{

	int[] transactionList;
	
	int target;
	
	Scanner input;
	
	public TargetDeterminator () 
		{
		
			input = new Scanner(System.in);
		}
	
	void collectTransactionValues() 
	{
		
		System.out.println("Enter the size of the Transaction");
		
		int transactionListSize = input.nextInt();
		
		System.out.println("Enter the values in the Transaction");
		
		transactionList = new int[transactionListSize];
		
        for (int index = 0; index < transactionListSize; index ++) 
        {
			
			transactionList[index] = input.nextInt();
        }
	}
	
	void dailytarget()
	{
	
		System.out.println("Enter the total no of target that needs to be achieved");
		
		target = input.nextInt();
		
		int i, value;
		
		for (i = 1; i <= target; i++)
		{
		
			System.out.println("Enter the value of the target");
			
			value =input.nextInt();
			
			determine(value);
			
		}
		
	}
	
	void determine(int value)
	{
		int sum = 0, transactioncount = 0;
		boolean flag = false;
		
		for (int index = 0; index < transactionList.length; index ++) 
        {
			transactioncount++;
			sum = sum + transactionList[index];
			
			if (sum >= value)
			{
				flag = true;
				break;
			}
			 
        }
		
		if (flag == true)
		
			System.out.println("Target achieved after " + transactioncount + " transactions");
		
		else
			
			System.out.println("Given target is not achieved");
			
	}
}






