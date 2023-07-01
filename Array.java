public class Array {
    public static void main(String args[]){
        int [] marks= new int[5];
        marks[0]=10;
        marks[1]=8;
        marks[2]=10;
        marks[3]=9;
        marks[4]=10;
        //System.out.println(marks[4]);
        //System.out.println(marks.length);
        System.out.println("Printing using for loop");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }   

        System.out.println("Printing using for loop in reverse order");
        for(int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }
        
        String [] student ={"harry", "rashi", "pihu"};
        System.out.println(student[2]);
       


    }
    
}
