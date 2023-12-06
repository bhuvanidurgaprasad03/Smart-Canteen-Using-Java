import java.util.Scanner;
import java.util.Random;
import java.lang.Thread;
import menu.menulist;
class details
{
int a[]={80,50,60,90,70,70};
int n,t,g,f,k,i,id,pass,x;
int b[]={120,80,90,80,70,150,70,90};
}
class payment
{
	Scanner s=new Scanner(System.in);
	void paymt()
	{
		try
		{
			System.out.println("");
			System.out.println("	-> REDIRECTING TO PAYMENT: ");
			Thread.sleep(1000);
			System.out.println("");
			System.out.println("	-> ENTER THE BELOW HUMAN CAPTCHA CORRECTLY: ");
			int rand=0;
			Random random=new Random();
			while(true)
			{
				rand=random.nextInt(1000);
				if(rand>=101)
				break;
			}
			System.out.println("		"+rand);
			int dp=s.nextInt();
			while(dp!=rand)
			{
				System.out.println("INCORRECT HUMAN CAPTCHA.ENTER AGAIN");
			}
			Thread.sleep(1000);
			System.out.println("	-> PAYMENT DONE");
			System.out.println("");
			Thread.sleep(1000);
			System.out.println("	-> (: THANKS FOR USING OUR SERVICE :)");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class bill extends details
{
void epsil()
{
Scanner s=new Scanner(System.in);
details d=new details();
System.out.println("");
System.out.println("	-> ENTER YOUR FOOD ITEM NUMBER:=");
d.n=s.nextInt();
d.t=d.a[d.n-1];
System.out.println("	-> TOTAL BILL = "+d.t);
System.out.println(" ");
System.out.println("	-> ENTER YOUR TABLE NUMBER: ");
int num=s.nextInt();
System.out.println(" -> THANK YOU FOR USING OUR SERVICES WITHIN SHORT TIME YOUR ORDER WILL BE PALCED AT TABLE = "+num);
}
void epsor()
{
Scanner s=new Scanner(System.in);
details d=new details();
System.out.println("");
System.out.println("	-> ENTER YOUR FOOD ITEM NUMBER:=");
d.n=s.nextInt();
d.t=d.b[d.n-1];
System.out.println("	-> TOTAL BILL = "+d.t);
System.out.println(" ");
System.out.println("	-> ENTER YOUR TABLE NUMBER: ");
int num=s.nextInt();
System.out.println(" -> THANK YOU FOR USING OUR SERVICES WITHIN SHORT TIME YOUR ORDER WILL BE PALCED AT TABLE = "+num);
}

}
class Smartcanteen
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	details d=new details();
	bill b=new bill();
	payment pt=new payment();
   	menulist m=new menulist();
	System.out.println("");
   	System.out.println("	******** WELCOME TO SMART CANTEEN *******");
   	System.out.println("");
	int x=1;
	while(x==1)
	{
   		System.out.println(" -> Enter 1 if you are FACULTY (or) Enter 2 for STUDENT");
   		d.x=s.nextInt();
   		System.out.println(" ");
   		if(d.x==1)
   		{
			try
   	 		{
				System.out.println(" -> ENTER COLLEGE ID NUMBER:= ");
				d.id=s.nextInt();
				System.out.println(" -> ENTER PASSCODE:=");
				d.pass=s.nextInt();
				System.out.println("	*** MENU LIST ***");
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("  -> SELECT THE FOOD DOMAIN:");
				System.out.println("");
				System.out.println("	  1)VEG    2)NON-VEG");
			}
			catch(Exception e)
        		{
        			  System.out.println(e);
        		}
			System.out.println("");
			d.i=s.nextInt();
			System.out.println("");
  			if(d.i==1) 
			{	
				m.print();
				b.epsil();
				pt.paymt();
			}	
			else if(d.i==2)
			{
				m.show();
				b.epsor();
				pt.paymt();
			}	
			else
			{
				System.out.println(" ): INVALID FOOD DOMAIN :(");
			}
		}		 
		else if(d.x==2)
    		{
        		System.out.println(" -> ENTER HALLTICKET:= ");
        		d.id=s.nextInt();
        		System.out.println(" -> ENTER PASSCODE:= ");
        		d.pass=s.nextInt();
			if(d.id==d.pass)
      			{
				try
           			{
        				System.out.println("	*** MENU LIST ***");
        				Thread.sleep(1000); 
        				System.out.println("	-> SELECT THE FOOD DOMAIN:");
 					System.out.println(" ");
					System.out.println("	    1)VEG    2)NON-VEG");
				}
          			catch(Exception e)
	  			{
					System.out.println(e);
	  			}
				System.out.println(" ");
				d.i=s.nextInt();
	  			if(d.i==1) 
	  			{	
					m.print();
					b.epsil();
					pt.paymt();
				}
				else if(d.i==2)
				{
					m.show();
					System.out.println(" ");
					b.epsor();
					pt.paymt();
				}	
				else
				{
					System.out.println("	): INVALID FOOD DOMAIN :(");
	                	}
			}
			else
			{
				System.out.println(" ): INVALID DETAILS :(");
			}
		
		}
    		else
    		{ 
			System.out.println(" ): INVALI LOGIN :(");
		}
		System.out.println(" ");
		System.out.println("	-> If you want to order again then press 1 if not press 0");
		System.out.println(" ");
		x=s.nextInt();
       	}
			
}
}



