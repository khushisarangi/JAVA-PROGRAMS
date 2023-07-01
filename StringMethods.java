public class StringMethods {
    public static void main(String args[]){
        String name= "Khushi";
        int value= name.length();
        System.out.println("The length of the the string is: " + value);
        String name1= "KHUSHI";
        System.out.println("string in lowercase: " + name1.toLowerCase());
        String name2= "Khushi";
        System.out.println("string in uppercase: " + name2.toUpperCase());
        String name3= "     khushi";
        System.out.println("after using trim: " + name3.trim());
        String name4= "Khushi";
        System.out.println("after using substring " + name4.substring(3,5));
        String name5= "Khushi";
        System.out.println("after using substring " + name5.replace('i','e'));
        System.out.println(name.startsWith("K"));
        System.out.println(name.endsWith("i"));
        System.out.println(name.charAt(0));
        System.out.println(name.startsWith("K"));
        System.out.println(name.indexOf("i"));
        System.out.println(name.lastIndexOf("h"));
        System.out.println(name.equals("Khushi"));
        System.out.println(name.equalsIgnoreCase("KHUSHI"));
        System.out.println("I am escape sequence \"double qoute\" ");
        System.out.println("\t hi");
    }    
}


