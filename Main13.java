import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int arraySize = scan.nextInt();
	    int[] myIntArray = new int [arraySize];
	    
	    for (int i = 0; i < myIntArray.length; i++){
	        myIntArray[i] = scan.nextInt();
	    }
	    int sum = 0;
		for (int i = 0; i < myIntArray.length; i++){
		    if (myIntArray[i] > 0){
		        sum ++;
		        
		    }
	}
	    System.out.println(sum);
}
}
