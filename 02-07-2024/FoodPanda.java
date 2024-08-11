class FoodPanda
{
	public static double takeOrder(String foodname){
		if(foodname=="Sushi")
		{
			return 2950.00;
		}
		if(foodname=="pizza")
		{
			return 3500.00;
		}if(foodname=="burger")
		{
			return 1059.00;
		}
		if(foodname=="Chinese Cuisine")
		{
			return 219.00;
		}
		if(foodname=="Thai Cuisine")
		{
			return 65.00;
		}if(foodname=="Italian Cuisine")
		{
			return 169.00;
		}if(foodname=="Mediterranean Cuisine")
		{
			return 119.00;
		}if(foodname=="Mexican Cuisine")
		{
			return 37859.00;
		}if(foodname=="Chiken Hakka noodles")
		{
			return 13689.00;
		}if(foodname=="Gulab jamoon")
		{
			return 205.00;
		}if(foodname=="Deserts")
		{
			return 1800.00;
		}if(foodname=="Desserts")
		{
			return 1500.00;
		}if(foodname=="Sandwiches")
		{
			return 959.00;
		}if(foodname=="Rasagulla")
		{
			return 5020.00;
		}if(foodname=="Breakfast Items")
		{
			return 1500.00;
		}
		else{
			System.out.println(foodname +"Not found");
		}return 0.0;
	}
}