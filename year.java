import java.util.Scanner;
public class year{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int days=sc.nextInt();
        int years=0;
        int months=0;
        int remainingdays=days;
        while(remainingdays>=365){
            years++;
            remainingdays-=365;
        }
        while(remainingdays>=30){
            months++;
            remainingdays-=30;
        }
    System.out.println("years:" +years);
    System.out.println("months:" +months);
    System.out.println("days:" +remainingdays); 
        }
}