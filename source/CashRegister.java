import java.util.Scanner;

public class CashRegister
{
	public static void main(String[] args)
	{
		String s, Name_item,Cost_item,Amount_tendered,Purchase_balance ;
		double balance;

		Scanner input = new Scanner(System.in);

		String  ch;
		String[] name,cost,quantity;
		name=new String[5];
		cost=new String[5];
		quantity=new String[5];

		System.out.println("\t\tWOOLWORTHS");
		System.out.println("\tWelcome to the Woolworths");
		System.out.println( "\t  The fresh food people\n\n");

		System.out.print("Please enter the cash register's float: $");
		s = input.nextLine();
		balance = Double.parseDouble(s);

		System.out.print("Would you like to process the transaction [y/n]? ");;
		ch=input.nextLine();

		Double exit_balance=balance ;
		int item_count=0;

		while(ch.equalsIgnoreCase("y") ){

			System.out.print("Please enter the item's name: ");
			Name_item = input.nextLine();
			name[item_count]= Name_item;

			System.out.print("Please enter the item's cost: $");
			Cost_item = input.nextLine();
			cost[item_count]=Cost_item;

			String item_quantity =null;
			System.out.print("Please enter the quantity :");
			item_quantity=input.nextLine();
			quantity[item_count]=item_quantity;

			Transaction trans = new Transaction(Name_item, Double.parseDouble(Cost_item), Double.parseDouble(item_quantity));

			System.out.print("Please enter the cash amount tendered: $");
			Amount_tendered = input.nextLine();
			Purchase_balance = Double.toString(Double.parseDouble(Amount_tendered) - trans.getCost());
			
			if(Double.parseDouble(Purchase_balance) < 0 ){
				System.out.print("WARNING: Insufficinet Funds\n");
		
			}
			System.out.println("Purchase Balance = $" + Purchase_balance);

			exit_balance = (exit_balance) + (trans.getCost());

			item_count=item_count+1;
			System.out.print("Would you like to process the transaction [y/n]? ");
			ch=input.nextLine();

			if (ch.equalsIgnoreCase("n")){
				System.out.print("Would you like to print the receipt [y/n]");
				ch=input.nextLine();

				if (ch.equalsIgnoreCase("y")){
					System.out.println("\nRECEIPT :" );
					System.out.print("Name of the items Purchased : " );
					for(int i=0;i<name.length;i++){
						System.out.print(" "+name[i] + "  ");
						if (name[i]==null){
							System.out.print(" ");
						}
					}
					System.out.println( );
					System.out.print("Cost of the items Purchased : $" );
					for(int i=0;i<name.length;i++){
						System.out.print(" "+cost[i]+"  ");
					}
					System.out.println( );
					System.out.print("Quantity of the items purchased : ");
					for(int i=0;i<name.length;i++){
						System.out.print(quantity[i] + "  ");
					}
					System.out.println( "\nThank you for shopping with The fresh food people\n\n");

					ch="end";
				}
			}
			System.out.println("\n" );
		}
		System.out.println( );
		System.out.print("Balance of the Cash Register: " + exit_balance);
	}
}

//String result;d
//try{	
//	    int value = Integer.parseInt(exit_balance+trans.getCost());
//	     result = ""+value;
//	    }catch(NumberFormatException ex){
//	     result = "Invalid input";
//	    }
//	    JOptionPane.showMessageDialog(null,result);
