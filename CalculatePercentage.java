import java.util.Scanner;
public class CalculatePercentage {
    public static void main(String args[]){    
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the total marks: ");
        int t= sc.nextInt();

        System.out.print("Enter first subject marks: ");
        float marks1= sc.nextFloat();

        System.out.print("Enter second subject marks: ");
        float marks2= sc.nextFloat() ;

        System.out.print("Enter third subject marks: ");
        float marks3= sc.nextFloat(); 

        System.out.print("Enter fourth subject marks: ");
        float marks4= sc.nextFloat() ;

        System.out.print("Enter fifth subject marks: ");
        float marks5= sc.nextFloat() ;
        
        float sum= marks1 + marks2 + marks3 + marks4 + marks5 ;
        float percentage= (sum*100)/t;
        System.out.println("percentage="+percentage+"%");
    }
    
}
