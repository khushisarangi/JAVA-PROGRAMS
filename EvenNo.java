import java.util.* ;
public class EvenNo {
    public static void main(String args[]) {
        System.out.print("Enter n no.");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        while(i<=n){
            if (i%2==0){
                 System.out.println(i);

            }  
            i++ ;
        }
    }
    
}
