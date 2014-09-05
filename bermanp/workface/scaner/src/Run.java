import java.util.Scanner;
 public class Run { 
 /**
 * @param args  
 */
 public static void main(String[] args) {   
   
 //declare variables 
 Scanner input = new Scanner(System.in);    
 String name;
 String friend;
 int age;
 int number;
 int weight;    
 
 //read input from console  
 System.out.println("Enter your name: ");     
 name = input.nextLine();     
 
 System.out.println("What's your Friend's name? ");    
 friend = input.nextLine();
 
 System.out.println("How old are you? ");   
 age = input.nextInt();  

 System.out.println("What's your weight? ");    
 weight = input.nextInt();   
 
 System.out.println("What's your cell phone number");
 number = input.nextInt();
 
 
 //print out to the console    
 System.out.println("My name is " + name);     
 
 System.out.println("and I am " + age);
 
 System.out.println("I weigh " + weight + " pounds.");     
 
 System.out.println("My Friend's name is " + friend);
 
 System.out.println("My Cell Phone number is " + number);
		//close the Scanner
        input.close();    
}//end of main 
}