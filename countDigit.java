public class countDigit {

    // Check the number is armsStrongNumber

    public static void armsStrongNumber(int num){
        int solveAns = 0;
        int copy = num;
        while(num > 0){
            int digit = num%10; // Extract last digi
            solveAns += (int)Math.pow(digit, 3); // Cube 
            num/=10; // remove last digit
        }
        if( copy == solveAns){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
        // System.out.println(solveAns);
    }

    // Count the Number
    public static void digitCounter(int num){
        if(num == 0){
            System.out.println("Digits are : 1");
        }
        int count = 0;
        while(num > 0){
            num/=10;
            count++;
        }
        // int count = (int)((int)Math.log(num)/ Math.log(10))-1; 
        System.out.println("Digits are : " + count);
    }
    public static void main(String[] args){ 

        armsStrongNumber(153);


        int counter = 0;
        digitCounter(2340);
        int arr[] = {12, 32, 43, 34, 65};
        for(int i = 0; i < arr.length; i++){
            counter++;
        } 
        System.out.println(counter);
    }
    
}
