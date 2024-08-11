class Zepto
{
	public static double takeOrder(String foodname)
	{
		if(foodname=="Dairy & Eggs")
		{
			return 305.00;
		}
		if(foodname=="Bakery & Bread")
		{
			return 179.00;
		}if(foodname=="Snacks & Packaged Food")
		{
			return 59.00;
		}
		if(foodname.equalsIgnoreCase("Beverages"))
		{
			return 185.00;
		}
		if(foodname=="Breakfast & Cereals")
		{
			return 265.00;
		}if(foodname=="Cooking Essentials & Oil")
		{
			return 265.00;
		}if(foodname=="Meat, Fish & Poultry")
		{
			return 365.00;
		}if(foodname=="Frozen Food")
		{
			return 255.00;
		}if(foodname=="Personal Care")
		{
			return 315.00;
		}if(foodname=="Keema Do Pyaza Pizza")
		{
			return 255.00;
		}if(foodname=="Household & Cleaning Supplies")
		{
			return 339.00;
		}if(foodname=="Health & Wellness")
		{
			return 129.00;
		}if(foodname=="Baby Care")
		{
			return 99.00;
		}if(foodname=="Paneer pizza")
		{
			return 229.00;
		}if(foodname=="Mexican Green Wave")
		{
			return 166.00;
		}
		else{
			System.out.println(foodname +"Not found");
		}return 0.0;
	}
}