package _1_july.easy_questions;

// How do you remove spaces from a string in Java?
public class RemoveSpaces {

    public static void main(String[] args) {
        System.out.println(removeAllWhiteSpaces(" H e l l o "));
        System.out.println(removeOuterSpaces(" H e l l o "));
    }

    // How do you remove spaces from a string in Java?
    public static String removeAllWhiteSpaces(String input) {
        StringBuilder sb = new StringBuilder();

        for(char c: input.toCharArray())
            if(c != ' ') sb.append(c);

        return sb.toString();
    }

    // How do you remove leading and trailing spaces from a string in Java?
    public static String removeOuterSpaces(String input){
        StringBuilder sb = new StringBuilder();

        int pointer1 = 0, pointer2 = input.length()-1;
        while(input.charAt(pointer1) == ' ') pointer1++;
        while(input.charAt(pointer2) == ' ') pointer2--;

        for (int i = pointer1; i <= pointer2 ; i++)
            sb.append(input.charAt(i));

        return sb.toString();
        // return input.strip(); // short answer
    }
}
