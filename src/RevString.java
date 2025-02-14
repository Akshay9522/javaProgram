public class RevString {
    public static void main(String[] args) {
        String test = "My name is Akshay";
        revStringByArray( test);
        revStringByCharAt( test);
        stringRevByBuiltIn( test);
    }

    public static void revStringByArray(String test){
        String resString="";
        for (int i=test.toCharArray().length-1;i>=0;i--){
            resString = resString + test.toCharArray()[i];
        }
        System.out.println(resString);

    }

    public static void revStringByCharAt(String test){
        String resString="";
        for (int i=test.length()-1;i>=0;i--){
            resString = resString + test.charAt(i);
        }
        System.out.println(resString);
    }

    public static void stringRevByBuiltIn(String test){
        StringBuilder stbResult = new StringBuilder();
        for (int i=0; i<test.split(" ").length; i++){
            StringBuilder stbReverse = new StringBuilder(test.split(" ")[i]);
            stbReverse.reverse();
            stbResult.append(stbReverse).append(" ");
        }
        System.out.println(stbResult);
    }

}
