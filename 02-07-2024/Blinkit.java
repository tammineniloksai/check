class Blinkit
{
	public static double takeOrder(String foodname){
		if(foodname=="Fruits & Vegetables")
		{
			return 750.00;
		}
		if(foodname=="Dairy & Eggs")
		{
			return 3050.00;
		}if(foodname=="Snacks & Branded Foods")
		{
			return 1059.00;
		}
		if(foodname=="Beverages")
		{
			return 2019.00;
		}
		if(foodname=="Bakery & Biscuits")
		{
			return 65.00;
		}if(foodname=="Household & Cleaning")
		{
			return 169.00;
		}if(foodname=="French fries")
		{
			return 119.00;
		}if(foodname=="Mutton pepper")
		{
			return 3859.00;
		}if(foodname=="Chiken Hakka noodles")
		{
			return 1889.00;
		}if(foodname=="Gulab jamoon")
		{
			return 225.00;
		}if(foodname=="Sweets & Confectionery")
		{
			return 1000.00;
		}if(foodname=="lassi")
		{
			return 1050.00;
		}if(foodname=="Milk shake")
		{
			return 989.00;
		}if(foodname=="Rasagulla")
		{
			return 570.00;
		}if(foodname=="Instant & Frozen Foods")
		{
			return 1550.00;
		}
		else{
			System.out.println(foodname +" Not found");
		}return 0.0;
	}
}