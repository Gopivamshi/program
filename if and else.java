public class Main
{
	public static void main(String[] args) 
	{
	    String name="nike";
	    String product="shoes";
	    double code=4004;
	    double price=1800;
	    double quantity=2;
	    double total=price*quantity;
	    System.out.println(total);
	    double d1=10.0/100,d2=5.0/100;
	    if(total>2000)
	    {
	        double discount1=d1*total;
	        System.out.println("discount1="+discount1);
	        double shoes1=price-discount1;
	        System.out.println("shoes1="+shoes1);
	    }
	    else
	    {
	        double discount2=d2*total;
	        System.out.println(discount2);
	        double finaltotal=price-(d1+d2);
	        System.out.println(finaltotal);
	    }
	}
		