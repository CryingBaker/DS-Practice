public class bfmaxsubarray {
    public static void findMaxSubArray(int array[]){
        int sum = 0, maxsum = 0;
        for(int j = 0 ; j<array.length; j++){
            for(int i = j + 1 ; i<array.length; i++){
                for(int k = j; k<= i; k++){
                    sum += array[k];
                }
                if(sum > maxsum){
                    maxsum = sum;
                }
                sum = 0;
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String args[]){
        int array[] = {1,-2,6,-1,3};
        findMaxSubArray(array);
    }
}
