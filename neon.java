import java.util.Scanner;
public class neon{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int square=num*num;
        int sum=0;
        while(square>0){
            int digit=square%10;
            sum+=digit;
            square/=10;
        }
        if(sum==num){
            System.out.println(num+"is a Neon Number.");
        }
        else{
            System.out.println(num+"is a Not a Neon Number.");
        }

    }
}