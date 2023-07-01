public class UnaryOperators {
    public static void main(String args[]){
        int a=10; //pre-increment
        int b=0;
        b = ++a;
        System.out.println("pre-increment:");
        System.out.println(b);
        System.out.println(b);

        int c=10; //post-increment
        int d=0;
        d=c++;
        System.out.println("post-increment:");
        System.out.println(c);
        System.out.println(d);

        int e=10; //pre-decrement
        int f=0;
        f=--e;
        System.out.println("pre=decrement:");
        System.out.println(e);
        System.out.println(f);

        int g=10; //post-decrement
        int h=0;
        h=g--;
        System.out.println("post-decrement:");
        System.out.println(g);
        System.out.println(h);     
    }    
}



