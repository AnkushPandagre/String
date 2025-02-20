public class typeOne {
    public static void main(String[] args) {
        // String s1,s2,s3,s4,s5;
        // s1 = "Java";
        // s2 = "Java";
        // s3 = "Python";
        // s4 = "Python";
        // s5 = "Java";
        // System.out.println(s1==s2);
        // System.out.println(s1==s3);
        // System.out.println(s1==s4);
        // System.out.println(s1==s5);
        // System.out.println(s2==s3);
        // System.out.println(s2==s4);
        // System.out.println(s2==s5);
        // System.out.println(s3==s4);
        // System.out.println(s3==s5);
        // System.out.println(s4==s5);
    //   Stting using type 2 decleration non constant pool
        String s1,s2,s3,s4,s5;
        s1 = new String("Java");
        s2 = new String("Java");
        s3 = new String ("Python");
        s4 = new String ("Python");
        s5 = new String("Java");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s2==s3);
        System.out.println(s2==s4);
        System.out.println(s2==s5);
        System.out.println(s3==s4);
        System.out.println(s3==s5);
        System.out.println(s4==s5);
    }
}
