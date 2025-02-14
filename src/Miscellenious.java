public class Miscellenious {
    public static void main(String[] args) {
        characterOccurence("fhhfjfdsbbhjfdjhf");
        int[] a = {1,66,2,3,1,3,55,666,30};
        //characterOccurenceOtherWay(a);
        removeDuplicate(a);
    }

    public static void characterOccurence(String test){
        char[] arr = test.toCharArray();
        int [] charStore =  new int[256];
        for (char c : arr){
            charStore[c]++;
        }
        for (int k=0; k<256; k++){
            if (charStore[k]>0){
                System.out.print((char)k +""+charStore[k]  );
               // System.out.print(charStore[k]+(char)k);

            }
        }
    }

    public static void characterOccurenceOtherWay(int [] number){

        int count =1;

        boolean[] print = new boolean[number.length];
        for (int i=0; i<number.length; i++){
            if(print[i]){
                continue;
            }
            count =1;
            for (int k=i+1; k<number.length; k++){
                if (number[i]==number[k]){
                    count++;
                    print[k]=true;
                }
            }
            System.out.println(number[i]+"="+count);
        }
    }

    public static void removeDuplicate(int [] arr){
        int[] newArr = new int[arr.length];
        boolean[] printed = new boolean[arr.length];
        int k=0;
        boolean isDuplicate = false;

        for(int i =0; i<arr.length;i++){
            isDuplicate = false;
            if(printed[i]){
                continue;
            }
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    isDuplicate = true;
                    printed[j] = true;
                }
            }
            if(isDuplicate){
                newArr[k++]=arr[i];
            }else {
                newArr[k++]=arr[i];
            }
        }
       for(int l=0; l<k; l++){
           System.out.println(newArr[l]);
       }
    }

}
