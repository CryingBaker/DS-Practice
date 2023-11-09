public class arraypairs {
    public static void findArrayPairs(int array[]){
        for(int j = 0 ; j<array.length; j++){
            for(int i = j + 1 ; i<array.length; i++){
                System.out.println("("+array[j]+","+array[i]+")"); 
            }
        }
    }
    public static void main(String args[]){
        int array[] = {1,4,5,6,8};
        findArrayPairs(array);
    }
}
