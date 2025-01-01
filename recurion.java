public class recurion {

    //Print 5 to 1 numbers
    public static void printNumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }

// Print 1 to 5 Numbers

    public static void printNum(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }

    //Print sum of N natural numbers

    public static void sumNatural(int i, int n, int sum){
        if(i == n){
            System.out.println(sum);
            return ;
        }
        sum += i;
        sumNatural(i+1, n, sum);
    }

    // Print Factorial of n

    public static int printFact( int n){
        if( n == 1 || n == 0){
            return 1;
        } 
       int fact_Nm1 = printFact(n-1);
       int fact_N = n * fact_Nm1;
    //    System.out.println(fact_N);
       return fact_N;
    }

        //Print Fibonacci Sequence of n Numbers

        public static void fibNumber(int a, int b, int n){
            if(n == 0){
                return ;
            }
            int c = a + b;
            System.out.println(c);
            fibNumber(b, c , n-1);
        }


        // Print X power N

        public static int powerOfNum(int x, int n){
            if(n == 0 ){
                return 1;
            } 
            if(x == 0){
                return 0;
            }
            
          int xPower1 = powerOfNum(x, n-1);
          int xPowern = x * xPower1;
          return xPowern;
        }


        public static int calcPower(int x, int n){
            if( n == 0){
                return 1;
            }
            if( x == 0){
                return 0;
            }
            if(n % 2 == 0){ // For n = even
                return calcPower(x, n/2) * calcPower(x, n/2);
            } else{ // For n = odd
                return calcPower(x, n/2) * calcPower(x, n/2) * x;
            }
        }

    public static void main(String[] args){
        // printNumber(5);
        // printNum(1);
        // sumNatural(1, 6, 0);
        // System.out.println(printFact(5));

        // int a = 0 , b = 1;
        // System.out.println(a);
        // System.out.println(b);
        // fibNumber(a, b, 5);

        System.out.println(powerOfNum(2, 4));

        System.out.println(calcPower(2, 4));
    }
}
