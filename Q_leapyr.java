import java.util.*;
public class Q_leapyr {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter yr: ");
        int yr= sc.nextInt();
        if((yr%4==0 && yr%100!=0) || (yr%100==0 && yr%400==0)){
            System.out.println("It's a leap year");
        }
        else{
            System.out.print("It's not a leap year");
        }

    }
    

    
}
