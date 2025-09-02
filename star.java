import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int s=obj.nextInt();
		for(int row=1;row<=s;row++) {
			for(int col=1;col<=s;col++) {
				if(row==1||row==s||col==1||col==s)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}
