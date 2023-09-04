class iphone
{
	public static void main(String[] args)
	{
	String name="iphone14";
	double totalprice=79000;
	System.out.println(totalprice);	
	int packingcharges=99;
	String offer="14%offer";
	double discount=14.0/100*79000;
	System.out.println(discount);
	double totalamount=totalprice-discount;
	System.out.println(totalamount);
	System.out.println("discount="+discount);
	double finalprice=totalamount+packingcharges;
	System.out.println(finalprice);
	String bankoffer="5%cashback";
	double withbankoffer=finalprice*5.0/100;
	System.out.println(withbankoffer);
	}
}
	
	

	
	
	