import java.util.*;/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        int number,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
         number=sc.nextInt();
        
        for(int i=0;i<=number;i++)
        {
        sum=i+sum;
    }
    System.out.println("The sum of numbers"+ sum);
        

    }
}
