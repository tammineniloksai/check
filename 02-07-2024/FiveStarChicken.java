class FiveStarChicken
{
	public static double takeOrder(String foodname){
		if(foodname=="Classic Fried Chicken")
		{
			return 750.00;
		}
		if(foodname=="Grilled Chicken")
		{
			return 3050.00;
		}if(foodname=="chicken wings")
		{
			return 1059.00;
		}
		if(foodname=="Chicken Nuggets")
		{
			return 2019.00;
		}
		if(foodname=="Chicken popcorn")
		{
			return 65.00;
		}if(foodname=="Chicken Strips")
		{
			return 169.00;
		}if(foodname=="Chicken Burgers")
		{
			return 119.00;
		}if(foodname=="Mutton pepper")
		{
			return 3859.00;
		}if(foodname=="Chiken Hakka noodles")
		{
			return 1889.00;
		}if(foodname=="Chicken Wraps")
		{
			return 225.00;
		}if(foodname=="Sweets & Confectionery")
		{
			return 1000.00;
		}if(foodname=="Chicken Sandwiches")
		{
			return 1050.00;
		}if(foodname=="Barbecue Chicken")
		{
			return 989.00;
		}if(foodname=="Spicy Chicken")
		{
			return 570.00;
		}if(foodname=="Honey Glazed Chicken")
		{
			return 1550.00;
		}
		else{
			System.out.println(foodname + " Not found");
		}return 0.0;
	}
}