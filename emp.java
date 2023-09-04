class Main
{
	public static void main(String[] args)
	{
		String name="VAMSHI";
		int basicsal=25000;
		double fa=15/100.0*basicsal;
		double da=12/100.0*basicsal;
		double hra=19/100.0*basicsal;
		double pf,tax,grosssal;
		double totalsal=basicsal+fa+da+hra;
		if(totalsal>400000)
		{
		pf=7/100.0*basicsal;
		tax=2.5/100.0*basicsal;
		}
		else
		{
		pf=7/100.0*basicsal;
		tax=2.5/100.0*basicsal;
		}
		grosssal=totalsal-pf-tax;
		System.out.println(grosssal);
		System.out.println(fa);
	}
}
