public class MethodStringClass {
    public static void main(String[] args) {
        String s= "RajaRamMohanRoy";
        System.out.println(s);
        System.out.println(s.charAt(6));
        System.out.println(s.length());
       System.out.println( s.indexOf("j"));
       System.out.println(s.lastIndexOf("R"));
       System.out.println(s.toUpperCase());
       System.out.println(s.toLowerCase());
       System.out.println(s.substring(0,10));
System.out.println(s.substring(8));
for(char x:s.toCharArray()){
    System.out.println(x);
}
    }
}
