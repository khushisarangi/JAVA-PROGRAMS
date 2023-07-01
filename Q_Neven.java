import java.util.* ;
public class Q_Neven {
    public static void main(String args[]) {
        System.out.print("Enter n no.");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        int sum =0;
        while(i<n){
            sum= sum + (2*i);
            
            i++ ;
        }
        System.out.println("Sum of n even no: "+sum);
    }
    
}
