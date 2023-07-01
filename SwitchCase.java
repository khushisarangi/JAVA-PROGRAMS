import java.util.Scanner;
public class SwitchCase {
    public static void main(String args[]){
        System.out.print("Enter: ");
        Scanner sc= new Scanner(System.in);
        int button= sc.nextInt();
        switch(button){
            case 1:
            System.out.print("hello");
            break;
            
            case 2:
            System.out.print("namaste");
            break;

            case 3:
            System.out.print("vanakam");
            break;

            default:
            System.out.print("hii");






        }

    }
    
}
