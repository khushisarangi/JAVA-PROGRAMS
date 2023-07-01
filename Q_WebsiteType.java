import java.util.*;
public class Q_WebsiteType {
    public static void main(String args[]){
        System.out.print("Enter website: ");
        Scanner sc= new Scanner(System.in);
        String web= sc.nextLine();
        if(web.endsWith(".com")){
            System.out.println("It's commercial website");
        }
        else if(web.endsWith(".org")){
            System.out.println("It's a organisation website");
        }
        else if(web.endsWith(".in")){
            System.out.println("It's a Indian website");          
        }
        else{
            System.out.print("Enter valid website");

        }

    }
    
}
