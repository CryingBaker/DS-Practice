import java.util.*;
public class largestnumber{
    public static int findLargest(int array[]){
        int maximum = array[0];
        for(int i = 1;i<array.length; i++){
            if(maximum<array[i]){
                maximum = array[i];
            }
        }
        return maximum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        System.out.println("Enter elements of the array:");
        for(int i = 0 ; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("The largest number in the array is: "+findLargest(array));
    }
}
