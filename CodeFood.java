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
	  
	  
    //Creating a new scanner object
    Scanner sc= new Scanner(System.in); 
	  
	  
    //Storing the user's choice of food by letter  
    char s= sc.next().charAt(0); 
    System.out.println("Would you like to add a scrumptious basket "
    		+ "of the most French French Fries to your meal? Please select Y for Yes and N for No");
	  
	  
    //Storing choice of fries or not
    char f= sc.next().charAt(0);
	  
    //Initializing the price of each individual item
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
    
    if (f== 'Y')
    {
    	subTotal+= frenchFries;
    	System.out.println("Ok no problem!");
    }

    else if (f== 'N')
    {
    	System.out.println("No problem, your order will be out shortly");
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
	System.out.printf("The amount of tip that you should pay is $ %.2f%n", z);
	System.out.printf("The total price of your meal including tip is $ %.2f%n", grandTotal);
    System.out.println("------------------------------------------------");
	System.out.println("Thanks for dining at Code Food!");
    System.out.println("We hope to see you again soon!");
    System.out.println("Enjoy the rest of your day!");

  }
}
