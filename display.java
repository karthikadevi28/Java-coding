import java.util.Scanner;
public class display{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num=sc.nextInt();
        int temp=num;
        System.out.println("Even digits in "+num+":");
        while(temp>0){
            int digit=temp%10;
            if(digit%2==0){
                System.out.print(digit+" ");
            }
            temp/=10;
        }
        sc.close();
    }
}