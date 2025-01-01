import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] Args){
        Map<String, Integer> students = new HashMap<>();
        String[] str =   {"Arpit", "Aman", "Sahitya", "Shivam"};
        int[] num = {60, 43, 22, 53};

        for(int i = 0; i < str.length; i++){
            students.put(str[i], num[i]);
        }
    }
    
}
