import java.util.Scanner;
public class ElseIf {
    public static void main(String args[]){
        System.out.print("Enter age: ");
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        if(age>56){
            System.out.print("Experienced");
        }
         else if (age>25){
            System.out.print("Semi experienced");

         }

         else{
            System.out.print("Fresher");

         }


    }
    
}
