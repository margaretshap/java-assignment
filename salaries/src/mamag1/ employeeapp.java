package mamag1;

import java.util.Scanner;

class employee {
	public static int grosssalary;
	public static int wages;
	public static int netsalary;
	public  static int hour;
	public static int tax;
	public static int RSSB;
	public static int deduction;
	public static int hours;
	public static int extrahour;
	public static int rate;
	public static int grosssalaryweek;
	public static void main(String args[])
 {
System.out.println("enter the wages amount");
	Scanner in = new Scanner(System.in);
	System.out.println("enter worked hours in one week");
	int wages = in.nextInt();
	
	
int hours = in.nextInt();
extrahour = hours - 40;
rate = extrahour * 10 *wages/100;

if (hours > 40)
	grosssalaryweek = (wages * 40) + rate ;
else
	grosssalaryweek = hours * wages ;

tax=(25*wages)/100;
RSSB=(5*wages)/100;
deduction=tax-RSSB;

grosssalary=wages*160;
netsalary=grosssalary-deduction;
System.out.println("extra hours for 40 hours " +extrahour);
System.out.println("rate addition:" +rate);
System.out.println("hourly salary " +wages*8);
System.out.println("weekly salary:" +grosssalaryweek);
System.out.println("monthly salary: "+netsalary);
}
		
}
class hourlyemployee extends employee{

	public  int hoursalary( ) {
		System.out.println("enter the wages amount");
		Scanner in = new Scanner(System.in);
	int wages = in.nextInt();

	return wages*8;		
	
	}

	class weeklyemployee extends employee{
public  int weeklysalary()

{
	System.out.println("enter the salary amount");
	Scanner in = new Scanner(System.in);
int wages = in.nextInt();
	grosssalary = wages*40;

	return grosssalary;
	
}
	}
	
	class monthlyemployee extends employee{

		public  int monthlysalary() {
			System.out.println("enter the salary amount");
			Scanner in = new Scanner(System.in);
		int wages = in.nextInt();
			tax=(25*wages)/100;
			RSSB=(5*wages)/100;
			deduction=tax-RSSB;
			grosssalary=wages*160;
			netsalary=grosssalary-deduction;
		return  netsalary;
		}		
	}


public static void main(String args[]){
	
	System.out.println("enter the salary amount");
	Scanner in = new Scanner(System.in);
int wages = in.nextInt();
int grossalary = in.nextInt();
int netsalary = in.nextInt();
	System.out.println("grosssalary:"+ grosssalary);
	System.out.println("netsalary:"+ netsalary);
	System.out.println("salary" +wages*8);
}
}


 





