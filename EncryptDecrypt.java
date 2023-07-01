public class EncryptDecrypt {
    public static void main(String args[]){
        char grade= 'B' ;
        grade = (char)(grade + 8) ; //Manual casting
        System.out.println(grade);

        //Decrypting the value
        grade = (char)(grade - 8) ; //Manual casting
        System.out.println(grade);



    }
    
}
