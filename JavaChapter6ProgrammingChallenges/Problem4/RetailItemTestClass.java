
public class RetailItemTestClass 
{
	public static void main(String[] args)
	{
		RetailItem item1 = createMyClass();
		RetailItem item2 = createMyClass();
		RetailItem item3 = createMyClass();
		
		Description(item1, "Jacket");
		Description(item2, "Designer Jeans");
		Description(item3, "Shirt");
		
		Quantity(item1, 12);
		Quantity(item2, 40);
		Quantity(item3, 20);

		Price(item1, 59.95);
		Price(item2, 34.95);
		Price(item3, 24.95);
		
		System.out.println("\tDescription\tUnits on Hand\tPrice");
		
		System.out.println("Item#1\t" + item1);
		System.out.println("Item#2\t" + item2);
		System.out.println("Item#3\t" + item3);
	}
	
	public static RetailItem createMyClass()
	{
		return new RetailItem();
	}
	
	 public static void Description(RetailItem item, String description)
	 {
		 item.setDescription(description);
	 }
	 
	 public static void Quantity(RetailItem item, int units)
	 {
		 item.setUnitsOnHand(units);
	 }
	 
	 public static void Price(RetailItem item, double price)
	 {
		 item.setPrice(price);
	 }
}
