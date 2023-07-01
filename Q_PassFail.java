import java.util.Scanner;
public class Q_PassFail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total marks:");
        float marks= sc.nextFloat();
        float m1= sc.nextFloat();
        float m2= sc.nextFloat();
        float m3= sc.nextFloat();
        float sum= m1+m2+m3;
        float per=  (sum*100)/marks;
        if(per>=40 && m1>=30 && m2>=30 && m3>=30){
            System.out.print("You have been promoted");
        }  
        else{
            System.out.print("You need to reappear of exams");
        }



    }
    
}
