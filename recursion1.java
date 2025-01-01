import java.util.HashSet;

public class recursion1 {

    //Tower Of hanoi

    public static void towerOfHanoi(int n, String source, String helper, String dest){
        if(n == 1){
            System.out.println("Transfer Disk " + n + " From " + source + " to " + dest);
            return ;
        }
        towerOfHanoi(n-1, source, dest, helper);
        System.out.println("Transfer Disk " + n + " From " + source + " to " + dest);
        towerOfHanoi(n-1, helper, source, dest);
    }

    // Reverse String

    public static void reverseString(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseString(str, idx-1);
    }

    //Find first and last occurence of string

   public static int first = -1;
   public static int last = -1;
    public static void findChar(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            System.err.println(last);
            return;
        }
        char currentChar = str.charAt(idx);
        if(currentChar == element){
            if(first == -1){
                first = idx;
            } else {
                last = idx;
            }
        }
        findChar(str, idx+1, element);    
    }

    // Check the array is Strictly Increasing

    public static boolean checkArr(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            // System.out.println("Shorted Array");
            return checkArr(arr, idx+1);
        }   else{
            System.out.println("Unshorted Array");
            return false;
        }
    }

    // Move all x to the end of the string

    public static void moveAllx(String str, int idx, int count, String newStr){
        if(idx == str.length()){
            for(int i=0; i<=count; i++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(idx);
        if(currentChar == 'x'){
            count++;
            moveAllx(str, idx+1, count, newStr);
        } else {
            newStr += currentChar;
            moveAllx(str, idx+1, count, newStr);
        }
    }


    // Remove Duplicate in String

    public static void removeDuplicate(String str, int idx, String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(idx);
        if(idx + 1 < str.length() && currentChar != str.charAt(idx+1)){
            newStr += currentChar;
            removeDuplicate(str, idx+1, newStr);
        } else if(idx+1 == str.length() || currentChar != str.charAt(idx+1)){
            newStr += currentChar;
            removeDuplicate(str, idx+1, newStr);
        }
         else {
            removeDuplicate(str, idx+1, newStr);
        }
    }

    // Subsequences of String

    public static void printSubsequence(String str, int idx, String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(idx);
        printSubsequence(str, idx+1, newStr + currentChar);
        printSubsequence(str, idx+1, newStr);
    }

    //Print All the unique Subsequences of String

    public static void AlltheSubsequence(String Str, int idx, String newStr, HashSet<String> set){
        if(idx == Str.length()){
            if(set.contains(newStr)){
                return;
            } else {
            System.out.println(newStr);
            set.add(newStr);
            return;
            }
        }
     char currentChar = Str.charAt(idx);

     AlltheSubsequence(Str, idx+1, newStr + currentChar, set);
     AlltheSubsequence(Str, idx+1, newStr, set);
    }

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz"};

    public static void printParameters(String Str, int idx, String Combination){
        if(idx == Str.length()){
            System.out.println(Combination);
            return;
        }

        char currentChar = Str.charAt(idx);
        String mapping = keypad[currentChar - '0'];
        for(int i = 0; i<mapping.length(); i++){
            printParameters(Str, idx+1, Combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args){
        // towerOfHanoi(3, "S", "H", "D");
        // String str = "ABCD";
        // reverseString(str, str.length()-1);

        // String str = "abaacdaefaah";
        // findChar(str, 0, 'a');

        //  int arr[] = {1, 2, 3, 4, 5};
        //  System.out.println(checkArr(arr, 0));

        // String str = "axbcxxbd";
        // moveAllx(str, 0, 0, "");

        // String str = "abbcddeefghh";
        // removeDuplicate(str, 0, "");

        // String str = "abcd";
        // printSubsequence(str, 0, "");

        // String Str = "aaa";
        // HashSet<String> set = new HashSet<>();
        // AlltheSubsequence(Str, 0, "", set);

        String str = "23";
        printParameters(str, 0, "");
    }   
}
