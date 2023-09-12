import java.util.Scanner;

public class Assign1_1 {

	public static void main(String[] args) {
	
		int a;
		
		System.out.println("enter no. to be converted");
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      System.out.println("Entered no="+a);
      
     System.out.println("binary of entered no. is =  " +Integer.toBinaryString(a)); // converted to binary
    
     System.out.println("octal of entered no.= "+Integer.toOctalString(a));    // converted to octal
     
     String hex;
     hex=Integer.toHexString(a);
     System.out.println("hexadecimal of entered no.=  "+hex);   // converted to hex
	}

}
