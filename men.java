import java.util.*;
//import java.util.Scanner.*;
/**J'erome Adonis
 * 01/27/2022
 * This program prompts the user to chose different food options from a menu
 * and prints out the receipt. 
 */

/**
 * @author adonis
 *
 */
public class men {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);//takes input from keyboard
		
		 System.out.println("\nMountain View \nConcessions Menu\n \nPizza(Cheese-"
		 		+ "Pepperoni-Sausage)--$3.25 \nHot Dog--$2.25 \nNachos(Extra Cheese)--$3.25 \nSoft Pretzel"
		 		+ "--$2.75 \nChurros--$2.00 \nCotton Candy--$2.25 \nPopcorn--$2.50 \nChips--$1.50 \nCandy(Butterfinger-"
		 		+ "M&M's-Peanut M&M's-Skittles-Snickers-Starburst-Twix)--$1.50 \n");
		 System.out.println("Ice Cream-Snow Cones \nIce Cream--$2.75 \nSnow Cone(Blue Raspberry-"
		 		+ "Cherry-Lime)--$3.00");
		 System.out.println("Beverages \n(Pepsi-Diet Pepsi-Mountain Dew-Orange Crush-"
		 		+ "Mug Root Beer-Sierra Mist-Tropicana Pink Lemonade) \n"
		 		+ "Regular $2.00-Large $2.50 \n"
		 		+ "Aquafina Water, 20oz bottle--$2.00 \n"
		 		+ "Bottled Drinks: Pure Lear Tea, Gatorade--$3.50\n");
		
		 System.out.println("Enter your food choice: ");
		 System.out.println("Enter \"quit\" when done with your selection");
		 String choice = scnr.nextLine();
		 double totCost = 0.0;
		 StringBuilder sb = new StringBuilder();
		 //String s2 = String.format("%21s\n", "$3.25");
		 
		 while(!"quit".equalsIgnoreCase(choice)) {
			 if(choice.equalsIgnoreCase("pizza")) {
				 totCost+=3.25;
				 String s2 = String.format("%21s\n", "$3.25");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("hot dog")) {
				 totCost+=2.25;
				 String s2 = String.format("%21s\n", "$3.25");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("nachos")) {
				 totCost+=3.25;
				 String s2 = String.format("%21s\n", "$3.25");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("extra cheese")) {
				 totCost+=1.00;
				 String s2 = String.format("%21s\n", "$1.00");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("soft pretzel")) {
				 totCost+=2.75;
				 String s2 = String.format("%21s\n", "$2.75");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("churros")) {
				 totCost+=2.00;
				 String s2 = String.format("%21s\n", "$2.00");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("cotton candy")) {
				 totCost+=2.25;
				 String s2 = String.format("%21s\n", "$2.25");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("popcorn")) {
				 totCost+=2.50;
				 String s2 = String.format("%21s\n", "$2.50");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("chips")) {
				 totCost+=1.50;
				 String s2 = String.format("%21s\n", "$1.50");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("candy")) {
				 totCost+=1.50;
				 String s2 = String.format("%21s\n", "$1.50");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("butterfinger")){
				 totCost+=1.50;
				 String s2 = String.format("%21s\n", "$1.50");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("M&M's")){
				 totCost+=1.50;
				 String s2 = String.format("%21s\n", "$1.50");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("peanut M&M's")){
				 totCost+=1.50;
				 String s2 = String.format("%21s\n", "$1.50");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("skittles")){
				 totCost+=1.50;
				 String s2 = String.format("%21s\n", "$1.50");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("snickers")){
				 totCost+=1.50;
				 String s2 = String.format("%21s\n", "$1.50");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("starburst")){
				 totCost+=1.50;
				 String s2 = String.format("%21s\n", "$1.50");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("twix")){
				 totCost+=1.50;
				 String s2 = String.format("%21s\n", "$1.50");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("Beverage")){
				 System.out.println("Enter Size: ");
				 if(choice.equalsIgnoreCase("regular")){
					 totCost+=2.00;
					 String s2 = String.format("%21s\n", "$2.00");
					 sb.append(choice + s2 + "\n");
					 choice = scnr.nextLine();
				 }
				 else {
					 totCost+=2.50;
					 String s2 = String.format("%21s\n", "$2.50");
					 sb.append(choice + s2 + "\n");
					 choice = scnr.nextLine();
				 }

			  }
			 if(choice.equalsIgnoreCase("ice cream")) {
				 totCost+=2.75;
				 String s2 = String.format("%21s\n", "$2.75");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("blur raspberry")) {
				 totCost+=2.00;
				 String s2 = String.format("%21s\n", "$3.00");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("cherry")) {
				 totCost+=2.00;
				 String s2 = String.format("%21s\n", "$3.00");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("lime")) {
				 totCost+=2.00;
				 String s2 = String.format("%21s\n", "$3.00");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("aquafina")) {
				 totCost+=2.00;
				 String s2 = String.format("%21s\n", "$2.00");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }
			 if(choice.equalsIgnoreCase("bottled drinks")) {
				 totCost+=2.00;
				 String s2 = String.format("%21s\n", "$2.50");
				 sb.append(choice + s2 + "\n");
				 choice = scnr.nextLine();
			 }

			  else{
				 System.out.println("Not there on menu. Try again!");
				 choice = scnr.nextLine();
			 }
		 }
		 scnr.close();
		 
		 String s = String.format("%-15s %10s\n", "Item", "Price");
		 String s1 = String.format("%-15s %10s\n", "----", "-----");
		 
		 System.out.println(s);
		 System.out.println(s1);
		 System.out.println(sb);
		 System.out.printf("SubTotal is: " + "%.2f", totCost );
		 System.out.println(" ");
		 double tax = totCost * 0.02;
		 System.out.printf("Tax is: " + "%.2f", tax );
		 System.out.println("");
		 System.out.printf("Grand total is: " + "%.2f", totCost+tax);
		 
	}
}
