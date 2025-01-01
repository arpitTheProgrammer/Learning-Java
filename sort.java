public class sort {

    //Bubble Sorting

    // public static void printSorted(int arr[]){
    //     for(int i = 0; i < arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }

    // Selection Sorting
    
    // public static void printSelSort(int arr[]){
    //     for(int i = 0; i < arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }


    // Insertion Sort

    public static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int currentArr = arr[i];
            int prev = i-1;

            while (prev >= 0 && arr[prev] > currentArr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] =  currentArr;
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] Args){

        //Bubble sorting

        int arr[] = {2, 4, 6, 1, 5};


        // for(int i = 0; i < arr.length-1; i++){ 
        //     for(int j = 0; j<arr.length-i-1; j++){
        //         if(arr[j] > arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // printSorted(arr);

        // Selection Sorting

        insertionSort(arr);
        printArr(arr);
        
    }
}
