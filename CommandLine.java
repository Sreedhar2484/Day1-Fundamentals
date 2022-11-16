
import java.util.Scanner;
//1.4 To find the sum of command-line arguments and count the invalid integers entered.

public class CommandLine
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num : ");
        int num;
        int count=0, sum=0;
        for(int i=0;i<args.length;i++){
            try{
                num=Integer.parseInt(args[i]);
                sum=sum+num;
            }
            catch(NumberFormatException e){
                count++;

            }
        }
        System.out.println("Sum of only valid integers is= "+sum);
        System.out.println("Invalid integers are: "+count);
    }
}
