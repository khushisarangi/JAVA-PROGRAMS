import java.util.*;
public class Q_day {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no. :");
        int day= sc.nextInt();
        if(day==1){
            System.out.print("Monday");
        }
        else if(day==2){
            System.out.print("Tue");

        }
        else if(day==3){
            System.out.print("Wed");

        }
        else if(day==4){
            System.out.print("Thrus");

        }
        else if(day==5){
            System.out.print("Fri");

        }
        else if(day==6){
            System.out.print("Sat");

        }
        else if(day==7){
            System.out.print("Sun");
        } 
        else{
            System.out.print("enter calid no.");
        }

    }
    
}
