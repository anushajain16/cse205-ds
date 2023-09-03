public class Q1295 {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int num:nums){
            int digitCount=countDigits(num);
            if(digitCount%2==0){
                count++;
            }
        }
        return count;
    }

    public int countDigits(int num){
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        return count;
    }
}
