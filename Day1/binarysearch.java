import java.util.*;
public class binarysearch {
    public static void sort(int array[], int arrayLength){
        int temp;
        for(int i = 0 ; i<arrayLength; i++){
            for(int j = 0 ; j<arrayLength-1; j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static int search(int toSearch, int array[], int arrayLength){
        sort(array,arrayLength);
        System.out.println("Sorted Array:");
        for(int i = 0 ; i<arrayLength; i++){
            System.out.print(array[i] +"  ");
        }
        int beg = 0;
        int end = arrayLength-1;
        int mid;
        while(beg<=end){
            mid = (beg+end)/2;
            if(toSearch<array[mid]){
                end = mid-1;
            }else if(toSearch>array[mid]){
                beg = mid+1;
            }else if(toSearch==array[mid]){
                return mid;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        System.out.print("Enter the length of the array:");
        int arrayLength = sc.nextInt();
        for(int i = 0 ; i<arrayLength; i++){
            System.out.print("Element no."+(i+1)+":");
            array[i] = sc.nextInt();
        }
        System.out.println("Enter element to search:");
        int toSearch = sc.nextInt();
        int position = search(toSearch,array,arrayLength);
        System.out.println();
        if(position != -1){
            System.out.println("Element found at position:"+position);
        }else{
            System.out.println("Element not found");
        }
    }
}
