public class SumArray {
    public static void main(String[] args){

        int[] arr = {120,320,10,60,70};

        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum "+sum);
    }
}
