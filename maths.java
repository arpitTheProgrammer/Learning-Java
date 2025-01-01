public class maths {
    public static void printDivisor(int num){
        for(int i = 1; i <= Math.sqrt(num); i++){
            if( num % i == 0){
                int divide = num/i;
                System.out.println(i + " x " + divide + " = " + num);
            }
        }
    }
    public static void main(String[] args){
        int num = 36;
        printDivisor(num);

    }
    
}
