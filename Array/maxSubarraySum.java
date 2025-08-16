// return the subarray with maximum sum

public class maxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        mssBruteForce(arr);
        mssOptimized(arr);
    }
    
    public static void mssBruteForce(int[] arr){
        int finalSum = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;

        for(int i = 0; i<arr.length; i++){
            int currentSum = 0; 

            for(int j = i; j<arr.length; j++){
                currentSum += arr[j]; 
                if(currentSum > finalSum){
                    finalSum = currentSum;
                    startIndex = i;
                    endIndex = j;
                }
                // finalSum = Math.max(currentSum, finalSum);
            }
        }
        // return finalSum; 
        for(int k = startIndex; k<= endIndex; k++){
            System.out.print(arr[k] + " ");
        }
    }

    public static int mssOptimized(int[] arr){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            currentSum += arr[i];
            maxSum = Math.max(currentSum, maxSum);
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
