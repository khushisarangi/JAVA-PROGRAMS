import java.util.Scanner;
public class Km_To_Miles {
    public static void main(String args[]){
        System.out.print("enter km: ");
        Scanner sc= new Scanner(System.in);
        float km= sc.nextFloat();
        float miles= (float)(km * 0.621371) ; //we have to write (float) to make the whole quantity a float because the variable is defined in float
        System.out.println("miles= " +miles);


    }
} 
