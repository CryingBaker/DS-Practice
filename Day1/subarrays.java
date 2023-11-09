public class subarrays {
    public static void findSubArrays(int array[]){
        for(int j = 0 ; j<array.length; j++){
            for(int i = j + 1 ; i<array.length; i++){
                System.out.print("(");
                for(int k = j; k<= i; k++){
                     System.out.print(array[k]+" ");
                }
                System.out.print(")\n");
            }
        }
    }
    public static void main(String args[]){
        int array[] = {1,4,5,6,8};
        findSubArrays(array);
    }
}
