public class Q1539 {
    public int findKthPositive(int[] arr, int k) {
        int missingCount=0;
        int i=0;
        int currentNumber=1;
        while(missingCount<k){
            if(i<arr.length && arr[i] == currentNumber){
                i++;
            }else{
                missingCount++;
            }
            if(missingCount<k){
                currentNumber++;
            }
        }
        return currentNumber;
    }
}
