import java.util.Scanner;
public class product{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num=sc.nextInt();
        int product=1;
        int temp=num;
        while(temp>0){
            int digit=temp%10;
            product*=digit;
            temp/=10;
        }
        System.out.println("product of digits in"+num+"="+product);
        sc.close();
    }
}
