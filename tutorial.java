public class tutorial {
    // Find the Divisors
    public static void findDivisor(int num){
        for(int i = 1; i < num; i++){
            if (num%i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] agrs){
        int num = 24;
        findDivisor(num);
    }
}
