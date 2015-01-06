import java.util.Scanner;


public class seasonchecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		@SuppressWarnings("unused")
		String summer;
		String winter;
		@SuppressWarnings("unused")
		String fall;
		
		@SuppressWarnings("unused")
		String spring;
		
		
		System.out.println("wut is the month?");
		winter = input.nextLine();
		
		
		
		
		if(winter.equals("Febuary")  ||  winter.equals("December")  || winter.equals("january")){
		System.out.println("its teh winter");}
		
		else{
			System.out.println("it not winter yet");
		}
		
		
		}
}

