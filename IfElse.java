import java.util.* ;
public class IfElse {
    public static void main(String args[]){
        System.out.print("enter age: ");
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        if(age>=18){
            System.out.println("you can drive");
        }

        else{
            System.out.println("you cannot drive");
        }
    }
    
}
