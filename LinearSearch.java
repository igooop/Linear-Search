import java.util.Scanner;
import java.util.Random;


public class LinearSearch {
 
     public static void main(String[] args) {
	        int x, size, search, array[];
	        Scanner input = new Scanner(System.in);
	        Random rand = new Random ();
	       
	        System.out.print("Enter array Size : ");
	        size = input.nextInt();
	        array = new int[size];
	        
	        System.out.print("Enter number to be search :  "  );
			search = input.nextInt();
	        
	        for (x = 0; x<size; x++) {
	        	
	        	array[x] = rand.nextInt(100);
	        	if(x%10==0){
	        		System.out.print(array[x] +"\t");
	        	}
	        	else{
	        		System.out.print(array[x] +"\t");
	        	}
	        	
	        	
	        		if (array[x] == search){
	        			System.out.println("FOUND : " + search + " is at " + " array["+x+"]");
	        			break;
	            
	        		}
	        		if (array[x] != search){
	        			System.out.println("NOT FOUND : " + search + " is not in the array.");
	        			break;
	        			
	        }
	

 }
}
    
}
