import java.util.Scanner;
public class alphabets{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number Of Rows:");
        int rows=sc.nextInt();
        char ch='A';
        for(int i=1;i<=rows;i++){
            for(int j=0;j<=rows-i;j++){
                System.out.print("");
            }
        
        for(int k=1;k<=i;k++){
             System.out.print(ch+"");
            ch++;
            }
        System.out.println();
        }
    }
}
