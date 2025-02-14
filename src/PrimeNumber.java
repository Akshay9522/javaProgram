public class PrimeNumber {
    public static void main(String[] args) {
        checkGivenNumber(5);
        findprimeNumberinRange(10,100);
    }

    public static void checkGivenNumber(int num){
        boolean isPrime= true;
        for (int i=2; i<num; i++){
            isPrime= true;
            if (num%i==0){
                isPrime= false;
                break;
            } else if ((num==0) || (num==1)) {
                System.out.println("number 0, 1 are neither prime nor composite");
            } else if (num<0) {
                System.out.println("please enter number greater than 0");
            }

        }
        if (isPrime){
            System.out.println(num+" is prime number");
        }
    }
    public static void findprimeNumberinRange(int num1, int num2) {
       int count = 0;
        for (int i = num1; i < num2; i++) {
            count = 0;
            for(int j=2; j<=num1; j++ ){
                if(i%j==0){
                    count++;
                    if (count>1){
                        break;
                    }
                }
            }
            if(!(count>=1)){
                System.out.println(i+" is prime number");
            }
        }
    }
}
