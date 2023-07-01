import java.util.*;
public class RockPaperScissors {
    public static void main(String args[]){
        System.out.println("Let's star the exam");
        System.out.println("1-Rock\n2-Paper\n3-Scissors");
        System.out.print("Enter your choice:");
        Scanner sc= new Scanner(System.in);
        int user= sc.nextInt();
        Random rn= new Random();
        int comp= rn.nextInt(1,4);
        System.out.println("Computer choice: "+comp);
        if(user==1 & comp==2){
            System.out.print("Computer won");
        }
        else if(user==1 & comp==3){
            System.out.print("You won");
        }
        else if(user==2 & comp==1){
            System.out.print("You won");
        }
        else if(user==2 & comp==3){
            System.out.print("Computer won");
        }
        else if(user==2 & comp==3){
            System.out.print("Computer won");
        }
        else if(user==3 & comp==1){
            System.out.print("Computer won");
        }
        else if(user==3 & comp==2){
            System.out.print("You won");
        }
        else if(user==comp){
            System.out.print("It's a tie");
        }
        else {
            System.out.print("Invalid input");
        }

    }
    
}
