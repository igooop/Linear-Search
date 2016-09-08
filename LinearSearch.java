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
        System.out.print("Enter number to find : ");
        search = input.nextInt();
        for (x = 0; x< size; x++) {
            array[c] = rand.nextInt(1000);
            if (array[x] == search)
                System.out.println("FOUND : " + search + " is at " + " array["+x+"]");
            break;
            
        }
        if (x == size)
            System.out.println("NOT FOUND : " + search + " is not in the array.");
    }
    
}
