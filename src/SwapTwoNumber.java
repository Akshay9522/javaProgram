public class SwapTwoNumber {
    public static void main(String[] args) {
swapTwoNumberByThird(5,6);
swipeTwoNumbeWithoutThirdVari(5,6);
    }

    public static void swapTwoNumberByThird(int a, int b){
        int tempo;
        System.out.println("given number are a="+a+" and b="+b);
        tempo = a;
        a = b;
        b = tempo;
        System.out.println("after swipe number are a="+a+" and b="+b);
    }

    public static void swipeTwoNumbeWithoutThirdVari(int a, int b){
        System.out.println("given number are a="+a+" and b="+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("given number are a="+a+" and b="+b);
    }
}
