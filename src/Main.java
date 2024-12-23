import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println(swappingTwoNumwithThirdvari(10,5));
        // System.out.println(swappingTwoNumbyThirdvari(10,5));
        // System.out.println(reveseStringbyCharAtFun("test"));
        // System.out.println(reveseStringbyArray("test"));
        //System.out.println(reveseStringbyFun("test"));
        //System.out.println(isNumPrime(-10));
        //System.out.println(FactorialNum(3));
        // fabnociSeries(5);
        //System.out.println(reveseNum(1234));
        //System.out.println(pallindrom("Akshay"));
        // isAnagram("listen","silent");
       // duplicateNum1();
        //duplicateNum2();
       // ascendArray();
       // charOccurence("dghddghfhgdfdfhdhg");
        //System.out.println(findPrimeNum(10,100));
        //System.out.println(reveseStringbyFullName("Akshay Surendra Shinde"));
        //System.out.println(nameInitial("Akshay Surendra Shinde"));
       // System.out.println(reveseString("Akshay Surendra Shinde"));



    }

    public static String swappingTwoNumbyThirdvari(int a, int b) {
        System.out.println("Given number a = " + a + " Given number b= " + b);
        int c = a;
        a = b;
        b = c;
        return "After swapping number a = " + a + " Given number b= " + b;
    }

    ;

    public static String swappingTwoNumwithThirdvari(int a, int b) {
        System.out.println("Given number a = " + a + " Given number b= " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        return "After swapping number a = " + a + " Given number b= " + b;
    }

    ;

    public static String reveseStringbyCharAtFun(String test) {
        System.out.println("Given String = " + test);
        String revString = "";
        for (int i = test.length() - 1; i >= 0; i--) {
            revString = revString + test.charAt(i);
        }
        return "After reversing String = " + revString;
    }
    public static String reveseStringbyArray(String test) {
        System.out.println("Given String = " + test);
        char[] testArray = test.toCharArray();
        String revString = "";
        for (int i = testArray.length - 1; i >= 0; i--) {
            revString = revString + testArray[i];
        }
        return "After reversing String = " + revString;
    }
    public static String reveseString(String test) {
        System.out.println("Given String = " + test);
        String [] testArray = test.split(" ");
        String revString = "";
        for (int i = testArray.length - 1; i >= 0; i--) {
            revString = revString + testArray[i]+" ";
        }
        return "After reversing String = " + revString;
    }
    public static String nameInitial(String test) {
        System.out.println("Given String = " + test);
        String [] testArray = test.split(" ");
        String revString = "";
        for (int i = 0; i < testArray.length; i++) {
            if (i==0 || i==1){
                revString = revString + testArray[i].charAt(0)+". ";
            }
            if(i==2){
                revString=revString+testArray[i];
            }
        }
        return "After reversing String = " + revString;
    }
    public static String reveseStringbyFullName(String test) {
        String res = "";
        System.out.println("Given String = " + test);
        String [] testArray = test.split(" ");
for (int i=0;i<testArray.length;i++){
    StringBuilder stb = new StringBuilder(testArray[i]);
    res = res+ stb.reverse()+" ";
}

        return "After reversing String = " + res;
    }

    ;

    public static String pallindrom(String test) {
        System.out.println("Given String = " + test);
        String resu;
        char[] testArray = test.toCharArray();
        String revString = "";
        for (int i = testArray.length - 1; i >= 0; i--) {
            revString = revString + testArray[i];
        }
        if (test.equalsIgnoreCase(revString)) {
            resu = test + " is pallindrom String";
        } else {
            resu = test + " is not pallindrom String";
        }
        return resu;
    }

    ;

    public static String reveseStringbyFun(String test) {
        System.out.println("Given String = " + test);
        StringBuilder stb = new StringBuilder(test);
        return "After reversing String = " + stb.reverse();
    }

    ;

    public static String isNumPrime(int num) {
        System.out.println("Given Number = " + num);
        String result = "";
        boolean flag = false;
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                result = "Given number is " + num + " is composite number";
            } else {
                result = "Given number is " + num + " is Prime number";
            }
            return result;
        } else if (num == 0 || num == 1) {
            return "given " + num + " is nor prime nor Composite number";
        } else {
            return "Please enter positive integer";
        }
    }

    ;

    public static String FactorialNum(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return "factorial of " + num + " is " + fact;
    }

    ;

    public static void fabnociSeries(int num) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 1; i <= num - 2; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    ;

    public static int reveseNum(int num) {
        //num=1234
        int revNum = 0;
        while (num > 0) {
            revNum = revNum * 10 + num % 10;
            num = num / 10;
        }
        return revNum;
    }
    public static void isAnagram(String str1, String str2) {
        char[] strig1 = str1.toCharArray();
        char[] strig2 = str2.toCharArray();
        Arrays.sort(strig1);
        Arrays.sort(strig2);
        if (Arrays.equals(strig1, strig2)) {
            System.out.println("given strings are anagram");
        } else {
            System.out.println("given strings are not anagram");

        }
    }

    public static void duplicateNum1() {
        int[] num = {1, 2, 3, 1, 4, 5, 2};
        HashSet<Integer> seen = new HashSet<>();
        for (int i : num) {
            if (!seen.add(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void duplicateNum2() {
        int[] num = {1, 2, 3, 1, 4, 5, 2};
        HashSet<Integer> hashset = new HashSet<>();
        for (int i=0; i<num.length;i++){
            for (int j=i+1; j<num.length;j++){
                if (num[i]==num[j]){
                    hashset.add(num[i]);
                }
            }
        }
        System.out.println(hashset);
    }
    public static void ascendArray() {
        int[] num = {1, 2, 3, 1, 4, 5, 2};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<num.length;i++){
            for (int j=i+1; j<num.length;j++){
                if (num[i]>num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;

                }
            }
        }for (int k:num){
            System.out.println(k);
        }
    }
    public static void charOccurence(String test) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : test.toCharArray()){
            hm.put(c,0);
        }
        for (char c : test.toCharArray()){
            if (hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
        }
        System.out.println(hm);
    }
    public static ArrayList<Integer> findPrimeNum(int num1, int num2) {
        ArrayList<Integer> arls = new ArrayList<>();
        int count = 0;
        if (num1 > 1) {
            for (int i = num1; i <= num2; i++) {
                for (int k = 2; k < i; k++) {
                    if ((i % k == 0)) {
                        count++;

                    }
                }if (count==0){
                    arls.add(i);
                }
                count=0;
            }
        }
        return  arls;
    }
}