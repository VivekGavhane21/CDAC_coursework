import java.util.Scanner;

public class Assign1_2 {

	public static void main(String[] args) {
		double avg;
		double d1;
		double d2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no ");
		
    	
		
        if(sc.hasNextDouble()) {
        	d1=sc.nextDouble();
    		System.out.println("1st no is ="+d1);
    		System.out.println("Enter second no. ");
    		
    		if(sc.hasNextDouble()) 
    		{
    		
    		d2=sc.nextDouble();
            System.out.println("2nd no. is="+d2);
            
        	avg=(d1+ d2)/2;
        	System.out.println("avg of no. is= "+avg);}
        	
        	else {System.out.println("no. is not double");
        	
        }
    		}
        else {
        	System.out.println("no.s are not double");
             }
	
	}
}
