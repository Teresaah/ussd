package ussd;
import java.util.Scanner;

public class okoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("0:Sh20(30mins,3hrs)");
				System.out.println("1:Sh10(15mins,1hr)");
				System.out.println("2:Sh20(15mins,midnight)");
				System.out.println("3:Okoa 50");
				System.out.println("4:Okoa 20");
				System.out.println("5:Okoa 10");
				System.out.println("6:Okoa 5");
				System.out.println("7:Okoa 20(900MB,1hr)");
				System.out.println("8:Okoa Internet");
				System.out.println("98:More");
				Scanner sc= new Scanner(System.in);		
				int option= sc.nextInt();
				switch(option) {
				case 0:
					System.out.println("Existing Unpaid Okoa:0");
					System.out.println("New Okoa request:20");
					System.out.println("TOTAL DEBT will be:20");
					System.out.println("1:Accept");
					System.out.println("2:Decline");
					System.out.print("0:Back");
					Scanner input= new Scanner(System.in);		
					int choice= input.nextInt();	
					if(choice==1) {
						System.out.println("You have received 30 minutes valid for 3 hours");
					}
					else if(choice==2) {
						System.out.println("Existing Unpaid Okoa:0");
						System.out.println("New Okoa request:20");
						System.out.println("TOTAL DEBT will be:20");
						System.out.println("1:Accept");
						System.out.println("2:Decline");
						System.out.println("0:Back");
					}
					else {
						System.out.println("0:Sh20(30mins,3hrs)");
						System.out.println("1:Sh10(15mins,1hr)");
						System.out.println("2:Sh20(15mins,midnight)");
						System.out.println("3:Okoa 50");
						System.out.println("4:Okoa 20");
						System.out.println("5:Okoa 10");
						System.out.println("6:Okoa 5");
						System.out.println("7:Okoa 20(900MB,1hr)");
						System.out.println("8:Okoa Internet");
						System.out.println("98:More");
					}
					break;
				case 1:
					System.out.println("You have received 15 minutes for the next 1 hour");
					break;
				case 2:
					System.out.println("You have received 15 minutes valid until midnight");
					break;
				case 3:
					System.out.println("You have received 50");
					break;
				case 4:
					System.out.println("You have received 20");
					break;
				case 5:
					System.out.println("You have received 10");
					break;
				case 6:
					System.out.println("You have received 5");
					break;
				case 7:
					System.out.println("You have received 900mb valid for the ext 1 hour");
					break;
				case 8:
					System.out.println("You have received okoa internet");
					break;
				default:
					System.out.println("Invalid choice.Try again");
				}

			}
	}

