import java.util.Arrays;
import java.util.Collections;

public class Advanceprogram {
    public static void main(String[] args) {
//1)String test = "Ak67s*h9ay S4h5i66n7d$e@!"; o/p=akshaY shindE
       // removeExtraCharacterChangeCase("Ak67s*h9ay S4h5i66n7d$e@!");
        //2)WAP will shift 0 at the end of the given integer array. Eg; {0,4,0,1,0,4,7,8}
        //shiftZeroLast(new int[]{0,4,0,1,0,4,7,8});
        //3)WAP to find input = “Tomorrow”, Output= “T&m&&rr&&&w”
        //recReplace("Tomorrow");
        //4)Extract only numbers in the given string Sap1ent
        //extractNumber("Sap1ent");
        //5)Write a program to sort this string alphabetically. Input:
     //   String str= "My name is Rajat";
      //  sortAlphabaticalOrder(str);
        //6)Write a Java program to the right that rotates the elements of an array by N.
        //rotate(new int[]{1,2,3,4,5},2);
        //7)2,7,10 Print the values that are missing between these elements. but not input value(2,7,10)
       // printtheMissingNumber(new int[]{2,7,10});
// 8)check subset of Array
      //  checkSubsetOfArr(new int[]{2,4,6,7,8,0}, new int[]{6,12,0});
        // check muliselce complete all coding questions, Jenkins, github hashmap
        printTimesCharacter("a1b2c3");
    }

    public static void removeExtraCharacterChangeCase(String test){
        //test = "Ak67s*h9ay S4h5i66n7d$e@!"; o/p=akshaY shindE
        String res="";
        String cleanedString = test.replaceAll("[^A-Za-z ]", "");
        String[] words = cleanedString.split(" ");
        for (int i = 0; i < words.length; i++) {
            int len = words[i].length();
            words[i] = words[i].substring(0, len - 1).toLowerCase() + words[i].substring(len - 1).toUpperCase();
        }
        for(String str:words){
           res  = res+ str+" ";
        }
        System.out.println(res);
    }

    public static void shiftZeroLast(int [] arr){
        int [] resArr = new int[arr.length];
        int a =0;
        int countZero = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                resArr[a++]=arr[i];
            }else {
                countZero++;
            }
        }
        for(int j=0; j<countZero;j++){
            resArr[a++]=0;
        }
        for(int m: resArr){
            System.out.println(m);
        }
    }

    public static void recReplace(String test){
       // input = “Tomorrow”, Output= “T&m&&rr&&&w”
        int count = 0;
        StringBuilder str = new StringBuilder();
        for(int i=0; i<test.length();i++){
            if(test.charAt(i)=='o'){
                count++;
                for(int j=0;j<count; j++){
                    str.append('&');
                }
            }else {
                str.append(test.charAt(i));
            }
        }
        System.out.println(str);
    }
    public static void extractNumber(String str){
        String newStr = str.replaceAll("[A-za-z]","");
        //[^0-9]
        System.out.println(newStr);
    }
    public static void sortAlphabaticalOrder(String test){
        String[] newArr = test.split(" ");
        Arrays.sort(newArr);
        String res = "";

        for(String str : newArr){
            res = res + str+" ";
        }
        System.out.println(res);
    }

    public static void printtheMissingNumber(int[] num){
        for(int i=0; i<num.length-1; i++){
            for(int k=num[i]+1; k<num[i+1]; k++){
                System.out.println(k);
            }
        }
    }

    public static void checkSubsetOfArr(int[]arr1, int[] arr2) {
        boolean isSubset = true;
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                isSubset = false;
                break;
            }
        }

        if (isSubset) {
            System.out.println("Given array is a subset.");
        } else {
            System.out.println("Given array is NOT a subset.");
        }
    }

    public static void rotate(int [] arr, int n){
        int length=arr.length;
        n = n%arr.length;
        reverse(arr, 0, length - 1);
        reverse(arr, 0, n - 1);
        reverse(arr, n, length - 1);
        for(int a : arr){
            System.out.println(a);
        }
    }
    public static void reverse(int[] arr, int start, int end){
        while (end>start){
            int tempo = arr[start];
            arr[start] = arr[end];
            arr[end] = tempo;
            start++;
            end--;
        }
    }
    public static void printTimesCharacter(String test){
        int len = test.length();
        for(int i=0; i<len; i++){
//            if(i==len-1){
//               break;
//            }
            //If Single & used need above code
            if(Character.isLetter(test.charAt(i))&&Character.isDigit(test.charAt(i+1))){
                int printTimes = Character.getNumericValue(test.charAt(i+1));
                for(int j=1; j<=printTimes; j++){
                    System.out.print(test.charAt(i));
                }
            }
        }
    }

}
