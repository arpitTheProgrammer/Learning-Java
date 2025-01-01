public class Questions {
    public static boolean checkPelindrome(int num){
        if(num < 0){
            return false;
        }
        int original = num;
        int reversed = 0;
        while(num != 0){
            int digit = num%10;
            reversed = reversed * 10 + digit;
            num = num/10;
        }
        return original == reversed;
    }
    public static void main(String[] agrs){
        int num = 12321;
        if(checkPelindrome(num)){
            System.out.println(num + " is pelindrome");
        } else {
            System.out.println(num + " is not pelindrome");
        }

    }
    
}
