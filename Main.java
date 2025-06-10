import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		//Food Delivery System.
		int amt=0,total=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to POMATO..");
	System.out.println("You can order your food here its cheap and tasty !");
	System.out.println("In Our System you can order the things which would be shown on the menu according to the seven days in a week ");
	System.out.println("This Ensures more varity in our products");
        System.out.println("Enter 1)Monday Menu");
        System.out.println("Enter 2)Tuesday Menu");
        System.out.println("Enter 3)Wednesday Menu");
        System.out.println("Enter 4)Thursday Menu");
        System.out.println("Enter 5)Friday Menu");
        System.out.println("Enter 6)Saturday Menu");
        System.out.println("Enter 7)Sunday Menu");
        
        System.out.println("Enter Your Choice :-");
        int ran=sc.nextInt();
if(ran==1){
System.out.println("..Monday Menu..");
	
System.out.println("1)BreakFast");	
System.out.println("2)Lunch");
System.out.println("3)Dinner");
System.out.println("4)Snacks");
	
	System.out.println("BreakFast Is Avaliable only from 8 A.M to 11A.M");
	System.out.println("Lunch Is Avalibale only from 13.00P.M to 16.00 P.M");
	System.out.println("Snacks Is Avaliable from 17.00 P.M to 22.00 P.M");
	System.out.println("Dinner From 19.00 P.M to 22.00 P.M");
System.out.println("Enter Which Category You Want ?(1,2,3,4)");
int c1=sc.nextInt();
System.out.println("Enter The Time (in Integers only such as 10,11 thats it(All thr time should be in 24 hr format");
int t1=sc.nextInt();

//Check BreakFast Timing
if(c1==1)
{
	if(t1>=8&&t1<=11)
	{
		//Place a menu BreakFast
		System.out.println("1)Strawberyy Pancake  Rs 50");
		System.out.println("2)Bacon And Chesse  Rs 60");
		System.out.println(" 3)French Toast  Rs 70");
	while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 50;
            } else if (choice1 == 2) {
                amt = 60;
            } else if (choice1 == 3) {
                amt = 70;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " + total); 
	
	}
	else
	{
		System.out.println("Sorry Dear Customer the breakfast time is over !");
	}
	
}
//Check Lunch Time

if(c1==2)
{
	if(t1>=13&&t1<=16)
	{
		//Place a menu Lunch
		System.out.println("1)Ice Cream Biriyani  Rs 50");
		System.out.println("2)Chicken With Curd Rice Rs 400");
		System.out.println(" 3)Mutton Biriyani  Rs 250");
		
		  while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 50;
            } else if (choice1 == 2) {
                amt = 400;
            } else if (choice1 == 3) {
                amt = 250;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " + total);
		
	}
	else
	{
		System.out.println("Sorry Dear Customer the Lunch time is over !");
	}
	
}

//Check Snack Timing

	
	if(c1==4)
{
	if(t1>=17&&t1<=19)
	{
		//Place a menu Snacks
		System.out.println("1)Veg Momo  Rs 80");
		System.out.println("2)Hakka Noddles   Rs 110");
		System.out.println("3)Pizza  Rs 100");
	
		  while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 80;
            } else if (choice1 == 2) {
                amt = 110;
            } else if (choice1 == 3) {
                amt = 100;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " + total);
	}
	else
	{
		System.out.println("Sorry Dear Customer the Snack time is over !");
	}
	
}
//Check Dinner Timing


	if(c1==3)
{
	if(t1>=20&&t1<=22)
	{
		//Place a menu Dinner
		System.out.println("1)Veg Thali  Rs 300");
		System.out.println("2)Romali Roti  Rs 120");
		System.out.println("3)Tawa Roti Rs 110");
		
		
		 while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 300;
            } else if (choice1 == 2) {
                amt = 120;
            } else if (choice1 == 3) {
                amt = 110;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " + total);
	}
	else
	{
		System.out.println("Sorry Dear Customer the Dinner time is over(And The store is closing ) !");
	}
	
}
}
if(ran==2){
	System.out.println("..Tuesday Menu..");
	System.out.println("1)BreakFast");	
System.out.println("2)Lunch");
System.out.println("3)Dinner");
System.out.println("4)Snacks");
	System.out.println("BreakFast Is Avaliable only from 8 A.M to 11.00A.M");
	System.out.println("Lunch Is Avalibale only from 13.00 P.M to 16.00 P.M");
	System.out.println("Snacks Is Avaliable from 17.00 P.M to 19.00 P.M");
	System.out.println("Dinner From 20.00 P.M to 22.00 P.M");
System.out.println("Enter Which Category You Want ?(1,2,3,4)");
	int c1=sc.nextInt();
System.out.println("Enter The Time (in Integers only such as 10,11 thats it");
int t1=sc.nextInt();

//Check BreakFast Timing
if(c1==1)
{
	if(t1>=8&&t1<=11)
	{
		//Place a menu BreakFast
		System.out.println("1)Paratha  Rs 40");
		System.out.println("2)Bread-Omletee  Rs 30");
		System.out.println(" 3)Bread-Butter    Rs-25");
		
		while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 40;
            } else if (choice1 == 2) {
                amt = 30;
            } else if (choice1 == 3) {
                amt = 25;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " +total);
	}
	else
	{
		System.out.println("Sorry Dear Customer the breakfast time is over !");
	}
	
}
//Check Lunch Time

if(c1==2)
{
	if(t1>=13&&t1<=16)
	{
		//Place a menu Lunch
		System.out.println("1)Manchurian Rice Rs 110");
		System.out.println("2)Chicken With Mixed Fried Rice Rs 250");
		System.out.println(" 3)South Indian Lunch Combo  Rs 150");

		while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 110;
            } else if (choice1 == 2) {
                amt = 250;
            } else if (choice1 == 3) {
                amt = 150;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " +total);
			
		
	}
	else
	{
		System.out.println("Sorry Dear Customer the Lunch time is over !");
	}
	
}

//Check Snack Timinng
	if(c1==4)
{
	if(t1>=17&&t1<=19)
	{
		//Place a menu Snacks
		System.out.println("1)Big Mac  Rs 160");
		System.out.println("2)Waffle  Rs 140");
		System.out.println("3)DoraCake  Rs 190");
			while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 160;
            } else if (choice1 == 2) {
                amt = 140;
            } else if (choice1 == 3) {
                amt = 190;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " +total);
		
		}
	else
	{
		System.out.println("Sorry Dear Customer the Snack time is over !");
	}
	
}
//Check Dinner Timing
	if(c1==3)
{
	if(t1>=20&&t1<=22)
	{
		//Place a menu Dinner
		System.out.println("1)Veg Thali  Rs 300");
		System.out.println("2)Tandori Roti Rs 100");
		System.out.println("3)Normal Roti Rs 30;");
			while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 300;
            } else if (choice1 == 2) {
                amt = 100;
            } else if (choice1 == 3) {
                amt = 30;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " +total);
	
	}
	else
	{
		System.out.println("Sorry Dear Customer the Dinner time is over(And The store is closing ) !");
	}
}
}
if(ran==3){
	System.out.println("..Wednesday Menu..");
	System.out.println("1)BreakFast");	
System.out.println("2)Lunch");
System.out.println("3)Dinner");
System.out.println("4)Snacks");
	
	System.out.println("BreakFast Is Avaliable only from 8 A.M to 11.00 A.M");
	System.out.println("Lunch Is Avalibale only from 13.00 P.M to 16.00 P.M");
	System.out.println("Snacks Is Avaliable from 17.00 P.M to 19.00 P.M");
	System.out.println("Dinner From 20.00 P.M to 22.00 P.M");
System.out.println("Enter Which Category You Want ?(1,2,3,4)");
int c1=sc.nextInt();
System.out.println("Enter The Time (in Integers only such as 10,11 thats it");
int t1=sc.nextInt();
//Check BreakFast Timing
if(c1==1)
{
	if(t1>=8&&t1<=11)
	{
		//Place a menu BreakFast
		System.out.println("1)Sandwitch Rs 30");
		System.out.println("2)Bread-Omletee  Rs 30");
		System.out.println(" 3)Toasted Bread  Rs 10");
			while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 30;
            } else if (choice1 == 2) {
                amt = 30;
            } else if (choice1 == 3) {
                amt = 10;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " +total);
	}
	else
	{
		System.out.println("Sorry Dear Customer the breakfast time is over !");
	}
}
//Check Lunch Time
if(c1==2)
{
	if(t1>=13&&t1<=16)
	{
		//Place a menu Lunch
		System.out.println("1)Panner Biriyani  Rs 50");
		System.out.println("2)Soyabean With Mixed Fried Rice Rs 100");
		System.out.println(" 3)Mutton Biriyani  Rs 250");
		
		while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 50;
            } else if (choice1 == 2) {
                amt = 100;
            } else if (choice1 == 3) {
                amt = 250;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " +total);
	}
	else
	{
		System.out.println("Sorry Dear Customer the Lunch time is over !");
	}
}
//Check Snack Timing
	if(c1==4)
{
	if(t1>=17&&t1<=19)
	{
		//Place a menu Snacks
		System.out.println("1)Chicken Roll Rs 120");
		System.out.println("2)Egg Roll  Rs 30");
		System.out.println("3)The Great Pizza Rs 500");
		while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 120;
            } else if (choice1 == 2) {
                amt = 30;
            } else if (choice1 == 3) {
                amt = 500;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " +total);
	}
	else
	{
		System.out.println("Sorry Dear Customer the Snack time is over !");
	}
}
//Check Dinner Timing
	if(c1==3)
{
	if(t1>=20&&t1<=22)
	{
		//Place a menu Dinner
		System.out.println("1)Veg Thali  Rs 300");
		System.out.println("2)Romali Roti  Rs 120");
		System.out.println("3)SCAM Roti Rs 69;");
			while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 300;
            } else if (choice1 == 2) {
                amt = 120;
            } else if (choice1 == 3) {
                amt = 69;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " +total);
	
	}
	else
	{
		System.out.println("Sorry Dear Customer the Dinner time is over(And The store is closing ) !");
	}
}
}
if(ran==4){
	
	System.out.println("..Thrusday Menu..");
	System.out.println("1)BreakFast");	
System.out.println("2)Lunch");
System.out.println("3)Dinner");
System.out.println("4)Snacks");
System.out.println("BreakFast Is Avaliable only from 8 A.M to 11.00 A.M");
	System.out.println("Lunch Is Avalibale only from 13.00 P.M to 16.00 P.M");
	System.out.println("Snacks Is Avaliable from 17.00 P.M to 19.00P.M");
	System.out.println("Dinner From 20.00 P.M to 22.00 P.M");
System.out.println("Enter Which Category You Want ?(1,2,3,4)");
	int c1=sc.nextInt();
System.out.println("Enter The Time (in Integers only such as 10,11 thats it");
int t1=sc.nextInt();
//Check BreakFast Timing
if(c1==1)
{
	if(t1>=8&&t1<=11)
	{
		//Place a menu BreakFast
		System.out.println("1)Lucci  Rs 20");
		System.out.println("2)Bread-Omletee  Rs 30");
		System.out.println(" 3)Aloo Paratha Rs 30");
		
			while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 20;
            } else if (choice1 == 2) {
                amt = 30;
            } else if (choice1 == 3) {
                amt = 30;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        System.out.println("Total amount: Rs " +total);
	}
	else
	{
		System.out.println("Sorry Dear Customer the breakfast time is over !");
	}
}
//Check Lunch Time
if(c1==2)
{
	if(t1>=13&&t1<=16)
	{
		//Place a menu Lunch
		System.out.println("1)Fish Thali Rs 110");
		System.out.println("2)Chicken With Mixed Fried Rice Rs 250");
		System.out.println(" 3)Duck Biriyani  Rs 250");
		
	while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 110;
            } else if (choice1 == 2) {
                amt = 250;
            } else if (choice1 == 3) {
                amt = 250;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " +total);
	}
	else
	{
		System.out.println("Sorry Dear Customer the Lunch time is over !");
	}
}
//Check Snack Timing
	if(c1==4)
{
	if(t1>=17&&t1<=19)
	{
		//Place a menu Snacks
		System.out.println("1)Sushi  Rs 160");
		System.out.println("2)Ramen  Rs 140");
		System.out.println("3)French Fries  Rs 100");
		
		while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 160;
            } else if (choice1 == 2) {
                amt = 140;
            } else if (choice1 == 3) {
                amt = 100;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " +total);
	}
	else
	{
		System.out.println("Sorry Dear Customer the Snack time is over !");
	}
}
//Check Dinner Timing

	if(c1==3)
{
	if(t1>=20&&t1<=22)
	{
		//Place a menu Dinner
		System.out.println("1)Non Veg Thali  Rs 300");
		System.out.println("2)Egg-Roti  Rs 120");
		System.out.println("3)Tawa Roti Rs 110;");
		
			while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 300;
            } else if (choice1 == 2) {
                amt = 120;
            } else if (choice1 == 3) {
                amt = 110;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " +total);
	}
	else
	{
		System.out.println("Sorry Dear Customer the Dinner time is over(And The store is closing ) !");
	}
}
}
if(ran==5){
	System.out.println("..Friday Menu..");
	System.out.println("1)BreakFast");	
System.out.println("2)Lunch");
System.out.println("3)Snacks ");
System.out.println("4)Dinner");

System.out.println("BreakFast Is Avaliable only from 8 A.M to 11.00 A.M");
	System.out.println("Lunch Is Avalibale only from 13.00 P.M to 16.00 P.M");
	System.out.println("Snacks Is Avaliable from 17.00 P.M to 19.00 P.M");
	System.out.println("Dinner From 20.00 P.M to 22.00 P.M");
System.out.println("Enter Which Category You Want ?(1,2,3,4)");
int c1=sc.nextInt();
System.out.println("Enter The Time (in Integers only such as 10,11 thats it");
int t1=sc.nextInt();
//Check BreakFast Timing
if(c1==1)
{
	if(t1>=8&&t1<=11)
	{
		//Place a menu BreakFast
		System.out.println("1)Paratha  Rs 40");
		System.out.println("2)Bread-Cream  Rs 35");
		System.out.println(" 3)Loaf Of Bread Rs 100");
	while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 40;
            } else if (choice1 == 2) {
                amt = 35;
            } else if (choice1 == 3) {
                amt = 100;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        System.out.println("Total amount: Rs " +total);
	}
	else
	{
		System.out.println("Sorry Dear Customer the breakfast time is over !");
	}
}
//Check Lunch Time

if(c1==2)
{
	if(t1>=13&&t1<=16)
	{
		//Place a menu Lunch
		System.out.println("1)Egg Biriyani  Rs 100");
		System.out.println("2)Chicken With Mixed Fried Rice Rs 250");
		System.out.println(" 3)Mutton Biriyani With Ice Cream Rs 250");
	while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 100;
            } else if (choice1 == 2) {
                amt = 250;
            } else if (choice1 == 3) {
                amt = 250;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        System.out.println("Total amount: Rs " +total);
	}
	else
	{
		System.out.println("Sorry Dear Customer the Lunch time is over !");
	}
}
//Check Snack Timing
	if(c1==3)
{
	if(t1>=17&&t1<=19)
	{
		//Place a menu Snacks
		System.out.println("1)Big Mac  Rs 160");
		System.out.println("2)Devil Burger Rs 420");
		System.out.println("3)Calamari Rs 300");
	while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 160;
            } else if (choice1 == 2) {
                amt = 420;
            } else if (choice1 == 3) {
                amt = 300;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " +total);
		
	}
	else
	{
		System.out.println("Sorry Dear Customer the Snack time is over !");
	}
}
//Check Dinner Timing
	if(c1==4)
{
	if(t1>=20&&t1<=22)
	{
		//Place a menu Dinner
		System.out.println("1)Curry Rice  Rs 300");
		System.out.println("2)Tarka-Roti  Rs 120");
		System.out.println("3)Tawa Roti Rs 110;");
	while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 300;
            } else if (choice1 == 2) {
                amt = 120;
            } else if (choice1 == 3) {
                amt = 110;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " +total);
	}
	else
	{
		System.out.println("Sorry Dear Customer the Dinner time is over(And The store is closing ) !");
	}
}
}
if(ran==6){
	System.out.println("..Saturday Menu..");
	System.out.println("1)BreakFast");	
System.out.println("2)Lunch");
System.out.println("3)Dinner");
System.out.println("4)Snacks");
System.out.println("BreakFast Is Avaliable only from 8 A.M to 11.00 A.M");
	System.out.println("Lunch Is Avalibale only from 13.00 P.M to 16.00 P.M");
	System.out.println("Snacks Is Avaliable from 17.00 P.M to 19.00 P.M");
	System.out.println("Dinner From 20.00 P.M to 22.00 P.M");
System.out.println("Enter Which Category You Want ?(1,2,3,4)");
int c1=sc.nextInt();
System.out.println("Enter The Time (in Integers only such as 10,11 thats it");
int t1=sc.nextInt();
//Check BreakFast Timing
if(c1==1)
{
	if(t1>=8&&t1<=11)
	{
		//Place a menu BreakFast
		System.out.println("1)Muffins Rs 40");
		System.out.println("2)Cream Roll  Rs 30");
		System.out.println(" 3)Onion Omlette    Rs-25");
		
	while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 40;
            } else if (choice1 == 2) {
                amt = 30;
            } else if (choice1 == 3) {
                amt = 25;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " +total);
				
		
		
		
	}
	else
	{
		System.out.println("Sorry Dear Customer the breakfast time is over !");
	}
}
//Check Lunch Time

if(c1==2)
{
	if(t1>=13&&t1<=16)
	{
		//Place a menu Lunch
		System.out.println("1)Veg Biriyani With Soda Rs 100");
		System.out.println("2)Chicken With Egg Rice Rs 250");
		System.out.println(" 3)Mutton  With Curd Rs 50");
		
			while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 100;
            } else if (choice1 == 2) {
                amt = 250;
            } else if (choice1 == 3) {
                amt = 50;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        System.out.println("Total amount: Rs " +total);
	}
	else
	{
		System.out.println("Sorry Dear Customer the Lunch time is over !");
	}
}
//Check Snack Timing
	if(c1==4)
{
	if(t1>=17&&t1<=19)
	{
		//Place a menu Snacks
		System.out.println("1)Butter Chicken  Rs 160");
		System.out.println("2)Magii With Curd and Ice Cream Rs 40");
		System.out.println("3)French Fries  Rs 100");
	while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 160;
            } else if (choice1 == 2) {
                amt = 40;
            } else if (choice1 == 3) {
                amt = 100;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " +total);
	}
	else
	{
		System.out.println("Sorry Dear Customer the Snack time is over !");
	}
}
//Check Dinner Timing
	if(c1==3)
{
	if(t1>=20&&t1<=22)
	{
		//Place a menu Dinner
		System.out.println("1)Panner Thali  Rs 300");
		System.out.println("2)Killer Roti  Rs 120");
		System.out.println("3)Tawa Roti Rs 110;");
		
		while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 300;
            } else if (choice1 == 2) {
                amt = 120;
            } else if (choice1 == 3) {
                amt = 110;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " +total);
	}
	else
	{
		System.out.println("Sorry Dear Customer the Dinner time is over(And The store is closing ) !");
	}
}	
}
if(ran==7){
	System.out.println("..Sunday Menu..");
	System.out.println("1)BreakFast");	
System.out.println("2)Lunch");
System.out.println("3)Dinner");
System.out.println("4)Snacks");
System.out.println("BreakFast Is Avaliable only from 8 A.M to 11.00 A.M");
	System.out.println("Lunch Is Avalibale only from 13.00 P.M to 16.00 P.M");
	System.out.println("Snacks Is Avaliable from 17.00 P.M to 19.00 P.M");
	System.out.println("Dinner From 20.00 P.M to 22.00 P.M");
System.out.println("Enter Which Category You Want ?(1,2,3,4)");
int c1=sc.nextInt();
System.out.println("Enter The Time (in Integers only such as 10,11 thats it");
int t1=sc.nextInt();
	//Check BreakFast Timing
if(c1==1)
{
	if(t1>=8&&t1<=11)
	{
		//Place a menu BreakFast
		System.out.println("1)Paratha  Rs 40");
		System.out.println("2)Bread-Omletee  Rs 30");
		System.out.println(" 3)Bread-Butter    Rs-25");
		while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 40;
            } else if (choice1 == 2) {
                amt = 30;
            } else if (choice1 == 3) {
                amt = 25;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " +total);
	}
	else
	{
		System.out.println("Sorry Dear Customer the breakfast time is over !");
	}
	
}
//Check Lunch Time

if(c1==2)
{
	if(t1>=13&&t1<=16)
	{
		//Place a menu Lunch
		System.out.println("1)Veg Biriyani  Rs 100");
		System.out.println("2)Chicken With Mixed Fried Rice Rs 250");
		System.out.println(" 3)Mutton Biriyani  Rs 250");
		
		while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 100;
            } else if (choice1 == 2) {
                amt = 250;
            } else if (choice1 == 3) {
                amt = 250;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " +total);
	}
	else
	{
		System.out.println("Sorry Dear Customer the Lunch time is over !");
	}
	
}

//Check Snack Timinng
	if(c1==4)
{
	if(t1>=17&&t1<=19)
	{
		//Place a menu Snacks
		System.out.println("1)Big Mac  Rs 160");
		System.out.println("2)Chicken Wings  Rs 140");
		System.out.println("3)French Fries  Rs 100");
			while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 160;
            } else if (choice1 == 2) {
                amt = 140;
            } else if (choice1 == 3) {
                amt = 100;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        

        System.out.println("Total amount: Rs " +total);
	}
	else
	{
		System.out.println("Sorry Dear Customer the Snack time is over !");
	}
}
//Check Dinner Timing
	if(c1==3)
{
	if(t1>=20&&t1<=22)
	{
		//Place a menu Dinner
		System.out.println("1)Veg Thali  Rs 300");
		System.out.println("2)Romali Roti  Rs 120");
		System.out.println("3)Tawa Roti Rs 110;");
		
	while (true) {
            System.out.println("Enter Your Choice (1, 2, 3):");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                amt = 300;
            } else if (choice1 == 2) {
                amt = 120;
            } else if (choice1 == 3) {
                amt = 110;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }
            total=total+amt;

            System.out.println("Do You Want to Continue to order? (Enter yes/no)");
            sc.nextLine();
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("no")) {
                break; 
            }
        }
        System.out.println("Total amount: Rs " +total);
		
	}
	else
	{
		System.out.println("Sorry Dear Customer the Dinner time is over(And The store is closing ) !");
	}
}
}
	}
}
