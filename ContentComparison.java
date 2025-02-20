public class ContentComparison {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "java";
          if(s1.equals(s2)){
            System.out.println("content of string is same");
          }else {
            System.out.println("content of string is not same");
          }
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));


    }
}
