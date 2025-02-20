// why string is not array in of character in java
public class Str {
    public static void main(String[] args) {
        String s= "Rakesh";
        // System.out.println(s);
        // // System.out.println(s[2]);error
        // System.out.println(s.charAt(2));
        String str = s.substring(0,2)+ "j"+s.substring(3);
    System.out.println(str);
    
    }
}
