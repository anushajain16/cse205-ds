public class Q2706 {
    public int buyChoco(int[] prices, int money) {
        sort(prices,0,prices.length-1);
        int sum=prices[0]+prices[1];
        if(sum<=money){
            return money-sum;
        }
        else{
            return money;
        }
    }

    public void merge(int [] arr ,int l , int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for(int i=0;i<n1;++i){
            L[i]=arr[l+i];
        }
        for(int j=0;j<n2;++j){
            R[j]=arr[m+1+j];
        }

        int i=0; int j=0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int l, int r)
    {
        if (l < r) {

            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
}
