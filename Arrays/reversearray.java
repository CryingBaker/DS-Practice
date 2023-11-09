public class reversearray {
    public static int[] getReverse(int array[], int arrayLength){
        int temp;
        for(int i = 0; i<=arrayLength/2; i++){
            temp = array[i];
            array[i] = array[arrayLength-i-1];
            array[arrayLength-i-1] = temp;
        }
        return array;
    }
    public static void main(String args[]){
        int array[] ={1,4,7,11};
        int reversearray[] = getReverse(array,array.length);
        for(int i = 0 ; i<reversearray.length; i++){
            System.out.print(reversearray[i]+"  ");
        }
    }
}
