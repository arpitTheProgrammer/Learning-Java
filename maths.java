public class maths {
    // public static void printDivisor(int num){
    //     for(int i = 1; i <= Math.sqrt(num); i++){
    //         if( num % i == 0){
    //             int divide = num/i;
    //             System.out.println(i + " x " + divide + " = " + num);
    //         }
    //     }
    // }

    // Check the number is prime or not

    public static void checkPrime(int num){
        for(int i = 2; i < num; i++){
            if(num%i == 0){
                System.out.println(num + " is Not Prime Number");
                return;
            } else if(num%num == 0){
                System.out.println(num + " is Prime Number");
                return;
            }
        }
        
    }
    public static void main(String[] args){
        int num = 7;
        checkPrime(num);

    }
    
}
