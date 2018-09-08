public class Transaction
{
	private String name;
	private double cost;
	private double quantity;

	public Transaction(String name, double cost,double quantity) {
		this.name = name;
		this.cost = cost;
		this.quantity = quantity; 
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	public double getCost() {
		cost = cost * (quantity); 
		quantity=1;
		
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost ;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
