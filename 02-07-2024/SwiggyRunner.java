class SwiggyRunner
{
	public static void main(String []foodname)
	{
		double finalresult=Swiggy.takeOrder("pizza");
		System.out.println(finalresult);
		double finalresult1=Swiggy.takeOrder("Burger");
		System.out.println(finalresult1);
		double finalresult2=Swiggy.takeOrder("chickenrole");
		System.out.println(finalresult2);
		double finalresult3=Swiggy.takeOrder("Shawarma");
		System.out.println(finalresult3);
		double finalresult4=Swiggy.takeOrder("RedVelvetChocolate");
		System.out.println(finalresult4);
		double finalresult5=Swiggy.takeOrder("VegBiriyani");
		System.out.println(finalresult5);
		double finalresult6=Swiggy.takeOrder("xyz");
		System.out.println(finalresult6);
	}
}
		