public class Pattern {
    public static void main(String[] args){
        //Uppward right angle triangle
        int n = 6;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    // Downward right angle triangle 
    int a = 6;
    for(int i = 1; i <= a; i++){
        for(int j = a; j > i; j--){
            System.out.print("*" + " ");
        }
        System.out.println();
    }


    //  Solid Rectangle
    int b = 4; 
    for(int i = 1; i <= b; i++){
        for(int j = 1; j <= b; j++){
            System.out.print("*" + " ");
        }
        System.out.println();
        
    }


    //Hollow Rectangle
    for(int i = 1; i<=4; i++){
        for(int j = 1; j<=4; j++){
            if( i == 2 && j == 2 || i == 2 && j == 3 || i == 3 && j == 2 || i == 3 && j==3){
                System.out.print("  ");
            } else{
                 System.out.print("*" + " ");
            }
        }
        System.out.println();
    }
}
}
