import java.util.Scanner;

public class CashRegister
{
	public static void main(String[] args)
	{
		// parameter names that will be used in the program with String and double as an input
		String s, Name_item,Cost_item,Amount_tendered,Purchase_balance ;
		double balance;
		String  ch;
		String[] name,cost,quantity,rtotal;	
		Scanner input = new Scanner(System.in);
		name=new String[15];
		cost=new String[15];
		quantity=new String[15];
		rtotal=new String[15];

		//the welcome note to print on the console
		System.out.println("\t\tWOOLWORTHS");
		System.out.println("\tWelcome to the Woolworths");
		System.out.println( "\t  The fresh food people\n\n");

		//system will print message to enter the float value and user need to enter the float to procced further
		System.out.print("Please enter the cash register's float: $");
		s = input.nextLine();
		balance = Double.parseDouble(s);

		//message will appear to ask the user if he wants to proceed for the transaction and user can press y to proceed or anything else to cancel
		//user input will be stored in String name ch
		System.out.print("Would you like to process the transaction [y/n]? ");;
		ch=input.nextLine();
		Double exit_balance=balance ;
		int item_count=0;

		//while loop initiate here as long as user press y  
		while(ch.equalsIgnoreCase("y") ){

			//console display 
			//user input stored
			//input stored in an Array to be used latter
			System.out.print("Please enter the item's name: ");
			Name_item = input.nextLine();
			name[item_count]= Name_item;

			//console display 
			//user input stored
			//input stored in an Array to be used latter
			System.out.print("Please enter the item's cost: $");
			Cost_item = input.nextLine();
			cost[item_count]=Cost_item;

			//initiating the item_quantity
			String item_quantity =null;
			String Total=null;

			//console display 
			//user input stored
			//input stored in an Array to be used latter
			System.out.print("Please enter the quantity : ");
			item_quantity=input.nextLine();
			quantity[item_count]=item_quantity;

			//Transaction class is called and the parameters are provided 
			Transaction trans = new Transaction(Name_item, Double.parseDouble(Cost_item), Double.parseDouble(item_quantity));

			double x=trans.getCost();

			System.out.println("Total = $" + x);
			rtotal[item_count]=Double.toString(x);

			
			//console display 
			//user input stored
			//purchase balance calculated
			System.out.print("Please enter the cash amount tendered: $");
			Amount_tendered = input.nextLine();
			Purchase_balance = Double.toString(Double.parseDouble(Amount_tendered) - x);

			//conditional statements are used 
			//warning is printed on console if the statement is true
			if(Double.parseDouble(Purchase_balance) < 0 ){
				System.out.print("WARNING: Insufficinet Funds\n");

			}

			System.out.println("Purchase Balance = $" + Purchase_balance);

			//exit balance is calculated
			exit_balance = (exit_balance) + (trans.getCost());

			//increment of item_count by one
			//message printed on console
			//user input store d in ch
			item_count=item_count+1;
			System.out.print("Would you like to process the transaction [y/n]? ");
			ch=input.nextLine();

			//conditional statements are used 
			//message printed on console if the statement is true
			//user input store d in "ch"
			if (ch.equalsIgnoreCase("n")){
				System.out.print("Would you like to print the receipt [y/n]");
				ch=input.nextLine();

				//conditional statements are used 
				//message printed on console if the statement is true
				if (ch.equalsIgnoreCase("y")){
					System.out.println("\nRECEIPT :" );
					System.out.print("\tName"+"\tcost"+"\tquantity" +"\t Total\n");

					//for loop to go through all the items of array on by one
					//conditional loop to check the condition
					//array at position i displayed on the screen
					for(int i=0;i<name.length;i++){
						if (name[i] != null){
							System.out.print("\t"+name[i]+"\t " +cost[i]+"\t "+quantity[i]+ " \t \t"+rtotal[i]+"\n");
						}else{
							System.out.print(" ");
						}
					}
					//thank you message printed on console
					System.out.println( "\n\nThank you for shopping with The fresh food people");
					ch="end";
				}
			}
			// \n to skip a line
			System.out.print("\n" );
		}
		//end of the day balance printed on screen
		System.out.print("Balance of the Cash Register: " + exit_balance);
	}
}

