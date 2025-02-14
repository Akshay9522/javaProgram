import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String test1 = "listen";
        String test2 = "silent1";

        char [] arrTest1 = test1.toLowerCase().toCharArray();
        char [] arrTest2 = test2.toLowerCase().toCharArray();

        Arrays.sort(arrTest1);
        Arrays.sort(arrTest2);

        if (Arrays.equals(arrTest1, arrTest2)){
            System.out.println(" given strings are anagram");
        }else {
            System.out.println(" given string are not anagram");
        }
    }


}
