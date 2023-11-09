public class psmaxsubarray {
    public static void findMaxSubArray(int array[]){
        int sum = 0, maxsum = 0;
        int prefixSum[] = new int[array.length];
        prefixSum[0] = array[0];
        for(int i = 1 ; i<array.length; i++){
            prefixSum[i] = prefixSum[i-1]+array[i];
        }
        for(int j = 1 ; j<array.length; j++){
            for(int i = j + 1 ; i<array.length; i++){
                sum = j==0 ? prefixSum[i] :prefixSum[i] - prefixSum[j-1];
            }
            if(maxsum<sum){
                maxsum = sum;
            }
            sum = 0;
        }
        System.out.println(maxsum);
    }
    public static void main(String args[]){
        int array[] = {1,-2,6,-1,3};
        findMaxSubArray(array);
    }
}