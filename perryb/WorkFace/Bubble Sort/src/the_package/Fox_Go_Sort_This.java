package the_package;

import java.util.Random;
 
public class Fox_Go_Sort_This {
	static Random rnd = new Random();
	
	public static void generateElements (int[] array) {
		for (int i = 0; i < array.length; i++){
			array[i] = rnd.nextInt(100)+1;
		}
	}
}
