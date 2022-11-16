import java.util.Scanner;
//1.5 To get the name using the command line.

public class CommandLineArgument{
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        System.out.println("Write any Name Here : ");
        String s=ref.nextLine();
        System.out.println("Your Given Name is : "+s);

    }
  }