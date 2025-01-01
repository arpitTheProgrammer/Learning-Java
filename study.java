public class study {

    //Print sum of N natural number

    public static int printFact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int fact_Nm1 = printFact(n-1);
        int fact_N = n * fact_Nm1;
        return fact_N;
    }

    public static void main(String[] args){
        System.out.println(printFact(5));
    }
}
