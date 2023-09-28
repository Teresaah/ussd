package studentmarklist;
import java.util.Scanner;
public class marklist2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Num of students:");
		int numstud = input.nextInt();
		int i=0,y,z,x,j;
		int []roll = {101,102,103,104};
			System.out.println("Enter names:");
			String []name = new String[5];
		    for(j=0; j<5; j++) {
		    	name[j] = input.nextLine();
			}
			System.out.println("Mark1 for students:");
			int []mark1 = new int[numstud];
			while (i<numstud) {
				mark1[i] = input.nextInt();
				i++;
			}
			System.out.println("Mark2 for students:");
			int []mark2 = new int[numstud];
			for( y=0; y<numstud; y++) {
				mark2[y] = input.nextInt();
			}
			System.out.println("Mark3 for students:");
			int []mark3 = new int[numstud];
			for( z=0; z<numstud; z++) {
				mark3[z] = input.nextInt();
			}
			int []total = new int[numstud];
			double []avg = new double[numstud];
			String []grade = new String[numstud];
			for( x=0; x<numstud; x++) {
			total[x] =mark1[x]+mark2[x]+mark3[x];
		    avg[x]= total[x]/3;
		
		if (avg[x]>=80&&avg[x]<=100){
			grade[x] = "A";
		}
		else if (avg[x]>=75) {
			grade[x] = "B+";
		}
		else if (avg[x]>=65) {
			grade[x] = "B";
		}
		else if (avg[x]>=55) {
			grade[x] = "C+";
		}
		else if (avg[x]>=50) {
			grade[x] = "C";
		}
		else if (avg[x]>=40) {
			grade[x] = "D";
		}
		else {grade[x] = "F";
		}
		}
		System.out.println("******************************************************************");
		System.out.println("\t\t\t\tSTUDENT MARKLIST");
		System.out.println("******************************************************************");
		System.out.println("ROLL\tNAME\tMARK1 MARK2 MARK3 TOTAL RESULT Average GRADE");
		System.out.println(+roll[0]+"\t"+name[0]+"\t  "+mark1[0]+"\t"+mark2[0]+"    "+mark3[0]+"    "+total[0]+"\t  P\t"+avg[0]+"\t "+grade[0]);
		System.out.println(+roll[1]+"\t"+name[1]+"\t  "+mark1[1]+"\t"+mark2[1]+"    "+mark3[1]+"    "+total[1]+"\t  P\t"+avg[1]+"\t "+grade[1]);
		System.out.println(+roll[2]+"\t"+name[2]+"\t  "+mark1[2]+"\t"+mark2[2]+"    "+mark3[2]+"    "+total[2]+"\t  P\t"+avg[2]+"\t "+grade[2]);
		System.out.println(+roll[3]+"\t"+name[3]+"\t  "+mark1[3]+"\t"+mark2[3]+"    "+mark3[3]+"    "+total[3]+"\t  P\t"+avg[3]+"\t "+grade[3]);
	}
}
