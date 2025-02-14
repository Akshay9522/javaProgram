import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ArraysproblemWithCollections {

    public static void main(String[] args) {
        characterOccurence("jhffggkg".toCharArray());
        int[] number = {2,3,2,3,3,3,55,55,3,2,6666,74,23};
        removeDuplicat(number);
        printDuplicate(number);
        sortingArray(number);

    }

    public static void characterOccurence(char[] arr){

       HashMap<Character, Integer> CharacterCount = new HashMap<>();

       for(char c: arr ){
           if (CharacterCount.containsKey(c)){
               CharacterCount.put(c,CharacterCount.get(c)+1 );
           }else {
               CharacterCount.put(c,1 );
           }
       }

       System.out.println(CharacterCount);
    }

    public static void removeDuplicat(int[] arr){
        HashSet<Integer> hs = new HashSet<>();

        for(int a: arr){
            hs.add(a);
        }
        System.out.println(hs);
    }

    public static void printDuplicate(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        for(int a: arr){
            if(!hs.add(a)){
                lhs.add(a);
        }
    }
        System.out.println(lhs);

    }

    public static void sortingArray(int[] num){
        for (int i=0; i< num.length; i++){
            for (int j=i+1; j<num.length; j++){
                if (num[i]>num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for(int k :num){
            System.out.println(k);
        }
     }
}
