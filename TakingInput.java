import java.util.Scanner;
public class TakingInput {
    public static void main(String args[]){
        System.out.println("Taking input from user");
        System.out.print("Enter the first number: ");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.print("Enter the second number: ");
        int b= sc.nextInt();
        int sum = a+b;
        System.out.println("the sum = "+ sum);
        System.out.print("enter a number to check if it is integer: ");
        boolean b1= sc.hasNextInt();  //checks weather the input i valid integer
        System.out.println(b1);
        System.out.println("Enter a line: ");
        String str = sc.nextLine();
        System.out.print(str);

    }
    
}



