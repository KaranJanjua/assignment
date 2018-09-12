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

		System.out.println("\t\tवूल्वोर्थ्स    ");
		System.out.println("\t    वूल्वोर्थ्स में आपका स्वागत है  ");
		System.out.println( "\t      द फ्रेश फूड पीपल \n\n");

		System.out.print("कृपया नकद रजिस्टर की राशि दर्ज करें: ₹");
		s = input.nextLine();
		balance = Double.parseDouble(s);

		System.out.print("क्या आप खरीदारी के लिये अगे बढ्ना चाह्त्ते हैन ?  [y/n]? ");;
		ch=input.nextLine();

		Double exit_balance=balance ;
		int item_count=0;

		while(ch.equalsIgnoreCase("y") ){

			System.out.print("किर्प्य वस्तु का नाम ढाले :");
			Name_item = input.nextLine();
			name[item_count]= Name_item;

			System.out.print("किर्प्य वस्तु की मूल राशि ढाले ₹: ");
			Cost_item = input.nextLine();
			cost[item_count]=Cost_item;

			String item_quantity =null;
			System.out.print("किर्प्य वस्तु की संख्या ढाल :");
			item_quantity=input.nextLine();
			quantity[item_count]=item_quantity;

			Transaction trans = new Transaction(Name_item, Double.parseDouble(Cost_item), Double.parseDouble(item_quantity));

			System.out.print("कृपया निविदा राशि दर्ज करें: ₹");
			Amount_tendered = input.nextLine();
			Purchase_balance = Double.toString(Double.parseDouble(Amount_tendered) - trans.getCost());
			Double tc = trans.getCost();
			
			System.out.println("क्रय प्रतिभार = ₹" + Purchase_balance);

			exit_balance = (exit_balance) + (trans.getCost());

			item_count=item_count+1;
			System.out.print("क्या आप खरीदारी के लिये अगे बढ्ना चाह्त्ते हैन ?  [y/n]? ");
			ch=input.nextLine();

			if (ch.equalsIgnoreCase("n")){
				System.out.print("क्या आप रसीद प्रिंट करना चाहते हैं [y/n]");
				ch=input.nextLine();

				if (ch.equalsIgnoreCase("y")){
					System.out.println("\n रसीद :" );
					System.out.print("वस्तु का नाम : " );
					for(int i=0;i<name.length;i++){
						System.out.print(" "+name[i]);
						if (name[i]==null){
							System.out.print(" ");
						}
					}
					System.out.println( );
					System.out.print("वस्तु की मूल राशि ₹ " );
					for(int i=0;i<name.length;i++){
						System.out.print(" "+cost[i]);
					}
					System.out.println( );
					System.out.print("वस्तु की संख्या्य : ");
					for(int i=0;i<name.length;i++){
						System.out.print(" "+quantity[i]);
					}
					System.out.println( "फ्रेश फूड पीपल के साथ खरीदारी के लिए धन्यवाद \n\n");

					ch="end";
				}
			}
			System.out.println("\n" );
		}
		System.out.println( );
		System.out.print("नकद रजिस्टर का संतुलन: " + exit_balance);
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
