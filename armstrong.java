import java.util.Scanner;
public class armstrong{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();
        int original=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit*digit*digit;
            num/=10;
        }
        if(sum==original){
            System.out.println(original+"is a Armstrong Number.");
        }
        else{
            System.out.println(original+"is Not a Armstrong Number.");
        }
 }
}