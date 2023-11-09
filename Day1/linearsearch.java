import java.util.*;
public class linearsearch {
    public static int search(int toSearch, int array[], int arrayLength){
        for(int i = 0 ; i<arrayLength ; i++){
            if(toSearch == array[i]){
                return i;
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
        if(position != -1){
            System.out.println("Element found at position:"+position);
        }else{
            System.out.println("Element not found");
        }
    }
}
