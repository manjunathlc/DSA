package Numbers;

public class CheckPrimeNumber {
    public static boolean isPrime(int number) {
        if(number==2 || number==3) {
            return true;
        }
        if(number%2==0 || number<=1 ||number%3==0) {
            return false;
        }

        for(int i=5; i<Math.sqrt(number); i=i+6) {
            if(number%i==0 || number%(i+2)==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 13;
        if(isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
