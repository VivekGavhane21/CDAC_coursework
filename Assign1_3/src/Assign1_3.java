import java.util.Scanner;

public class Assign1_3 {

	public static void main(String[] args) {
		System.out.println("1.Pohe :20\n2.Shira:20\n3.Samosa:10\n4.Curry:30\n5.Dosa:30\n6.Idli:10\n7.Wadapaw:15"
				+ "\n8.Upama:15\n9.DalRice:50\n10.Chai:12\nto exit press=11");
         int total=0;
         int qua=1;
		int num=-1;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		
				while(num!=11)
		{
					System.out.println("enter sr. no of items");
		            num=sc.nextInt();

			switch(num)
			{
			case 1:
				System.out.println("enter quantity of pohe:");
				qua=sc.nextInt();
				sum=qua*20;
				total=total+sum;
				
				break;
				
			case 2:
				System.out.println("enter quantity of shira:");
				qua=sc.nextInt();
				sum=qua*20;
				total=total+sum;
				
			break;
			
			case 3:
				System.out.println("enter quantity of samosa:");
				qua=sc.nextInt();
				sum=qua*10;
				total=total+sum;
				
				break;
				
			case 4:
				System.out.println("enter quantity of curry:");
				qua=sc.nextInt();
				sum=qua*30;
				total=total+sum;
				
				break;
				
			case 5:
				System.out.println("enter quantity of dosa:");
				qua=sc.nextInt();
				sum=qua*30;
				total=total+sum;
				
				break;
				
			case 6:
				System.out.println("enter quantity of idli:");
				qua=sc.nextInt();
				sum=qua*10;
				total=total+sum;
				
				break;
				
			case 7:
				System.out.println("enter quantity of wadapaw:");
				qua=sc.nextInt();
				sum=qua*15;
				total=total+sum;
				
				break;
				
			case 8:
				System.out.println("enter quantity of upama:");
				qua=sc.nextInt();
			 sum=qua*15;
				total=total+sum;
				
				break;
				
			case 9:
				System.out.println("enter quantity of dalrice:");
				qua=sc.nextInt();
				sum=qua*50;
				total+=total;
				
				break;
				
			case 10:
				System.out.println("enter quantity of chi:");
				qua=sc.nextInt();
				sum=qua*12;
				total=total+ sum; 
				
				break;
			default:
		     break;			
				
				
			}
			System.out.println("final price:"+total);
		}

	}

}
