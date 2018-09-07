import java.util.Scanner;

public class CashRegister
{
	public static void main(String[] args)
	{
		String s, Name_item,Cost_item,Amount_tendered,Purchase_balance,exit_balance=null;
		double balance;

		Scanner input = new Scanner(System.in);

		String  ch;

		System.out.print("Please enter the cash register's float: ");
		s = input.nextLine();
		balance = Double.parseDouble(s);

		System.out.print("Would you like to enter the item [y/n]? ");;
		ch=input.nextLine();

		exit_balance=Double.toString(balance);

		while(ch.equalsIgnoreCase("y") ){

			System.out.print("Please enter the item's name: ");
			Name_item = input.nextLine();

			System.out.print("Please enter the item's cost: ");
			Cost_item = input.nextLine();

			Transaction trans = new Transaction(Name_item, Double.parseDouble(Cost_item));

			System.out.print("Please enter the cash amount tendered: ");
			Amount_tendered = input.nextLine();
			Purchase_balance = Double.toString(Double.parseDouble(Amount_tendered) - trans.getCost());

			System.out.println("Purchase Balance = " + Purchase_balance);

			exit_balance = exit_balance + Double.toString(trans.getCost());



			System.out.print("Would you like to enter the item [y/n]? ");
			ch=input.nextLine();
		}



		System.out.println("Balance of the Cash Register: " + exit_balance);

	}


}

//String result;
//try{	
//	    int value = Integer.parseInt(exit_balance+trans.getCost());
//	     result = ""+value;
//	    }catch(NumberFormatException ex){
//	     result = "Invalid input";
//	    }
//	    JOptionPane.showMessageDialog(null,result);
