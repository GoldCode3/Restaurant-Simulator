import java.util.Scanner;

public class CodeFood
{
  public static void main(String[] args)
  {
	//Welcoming guests to the restaurant  
    System.out.println("");
    System.out.println("Welcome to the Code Food Restaurant "
    		+ "where you'll be served the codiest of food");
    System.out.println("");
    System.out.println("This is where you will be sitting today");
    System.out.println("");
    System.out.println("---------------------------------------------------");
    System.out.println("|                                                 |");
    System.out.println("|                                                 |");
    System.out.println("|                                                 |");
    System.out.println("|                                                 |");
    System.out.println("|                                X                |");
    System.out.println("|                                                 |");
    System.out.println("|                                                 |");
    System.out.println("|                                                 |");
    System.out.println("|                                                 |");
    System.out.println("|                                                 |");
    System.out.println("|                                                 |");
    System.out.println("|                                                 |");
    System.out.println("|                                                 |");
    System.out.println("----------------------------------------------------");
    System.out.println("My name is Java and I'll be your server for today");
    System.out.println("");
    System.out.println("How may I help you?");
    System.out.println("");
    System.out.println("Please choose from one of the following "
    		+ "delicious meals:");
    System.out.println("Kindly order by letter");
    System.out.println("");
    //Listing the options of food
    System.out.println("-A- Cheesy Cheeseburger");
    System.out.println("-B- Super Hot Dog");
    System.out.println("-C- Crispiest Chicken Tenders");
    System.out.println("-D- Three Footlong Pizza");
    Scanner sc= new Scanner(System.in); //Creating a new scanner
    char s= sc.next().charAt(0); //Storing the user's choice of food by letter
    System.out.println("Would you like to add a scrumptious basket "
    		+ "of the most French French Fries to your meal? Please select Y for Yes and N for no");
    char f= sc.next().charAt(0); //Storing choice of fries or not
    double subTotal= 0;
    double A= 13.50;
    double B= 7.50;
    double C= 10.00;
    double D= 11.75;
    double frenchFries= 4.50;
    if (s== 'A')
    {
    	subTotal+= A;
    }
    else if (s== 'B')
    {
    	subTotal+= B;
    }
    else if (s== 'C')
    {
    	subTotal+= C;
    }
    else if (s== 'D')
    {
    	subTotal+= D;
    }
    else
    {
    	System.out.println("Sorry that item is not on the menu, please try again!");
    	char sAgain= sc.next().charAt(0);
    }
    if (f== 'Y')
    {
    	subTotal+= frenchFries;
    	System.out.println("Ok no problem!");
    }
    else if (f== 'N')
    {
    	System.out.println("No problem, your order will be out shortly");
    }
    else
    {
    	System.out.println("Sorry I did not understand whether or not you wanted fries");
    	System.out.println("Select Y for Yes or N for No");
    	char friesAgain= sc.next().charAt(0);
    }
    System.out.println("--------------------------------------------------");
    System.out.println("Sub Total: " + subTotal);
    //Calculate subtotal and and gratuity charge
    System.out.println("Please enter the percentage gratuity you would like to pay:");
    System.out.println("Ex. If 5%, please input 0.05");
    double y = sc.nextDouble(); //Storing the desired gratuity rate
	double z = subTotal*y; //Taking that percentage from the subtotal of the meal
	double grandTotal = subTotal+z; //Adding the tip to the subtotal
	//Displaying the gratuity price and the grand total
	System.out.println("The amount of tip that you should pay is $" + z);
	System.out.println("The total price of your meal including tip is $" + grandTotal); 
    System.out.println("------------------------------------------------");
	System.out.println("Thank for dining at Code Food!");
    System.out.println("We hope to see you again soon!");
    System.out.println("Enjoy the rest of your day!");

  }
}
