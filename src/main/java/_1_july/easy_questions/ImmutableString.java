package _1_july.easy_questions;

// Can you prove that a String object in Java is immutable programmatically?
public class ImmutableString {

    public static void main(String[] args) {

        String str1 = "Java"; // "Java" String created in the String Pool and reference assigned to str1.
        String str2 = str1; // str2 also has the same reference to "Java" in the String Pool.

        System.out.println(str1 == str2); // proof that s1 and s2 have the same reference.

        //in the below case a new String "Espresso" got created in the String Pool
        //str1 is now referring to the new String in the pool
        //BUT, the original String "Java" is still unchanged and remains in the pool
        //str2 is still referring to the original String "Java" in the String pool

        str1 = "Espresso";
        System.out.println(str1 == str2); // proof that s1 and s2 have different reference
        System.out.println(str2); // prints "Java" supporting the fact that original String value is unchanged, hence String is immutable.
    }
}
