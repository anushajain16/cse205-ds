public class Q1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int pos = 0;
        for(int j=0;j<arr2.length;j++)
        {
            for(int i=pos;i<arr1.length;i++)
            {
                if(arr1[i]==arr2[j])
                {
                    int temp = arr1[i];
                    arr1[i] = arr1[pos];
                    arr1[pos] = temp;
                    pos++;
                }
            }
        } 
        mergesort(arr1,pos,arr1.length-1);
        return arr1;
      }
       public void mergesort(int[] arr , int si , int ei)
      {
          if(si>=ei)
          {
              return;
          }
          int mid = si + (ei-si)/2;
          mergesort(arr,si,mid);
          mergesort(arr,mid+1,ei);
          conquer(arr,si,mid,ei);
      }
      public void conquer(int[] arr , int si , int mid , int ei)
      {
          int[] merge = new int[ei-si+1];
          int idx1 = si;
          int idx2 = mid+1;
          int x = 0;
          while(idx1<=mid && idx2<=ei)
          {
              if(arr[idx1]<=arr[idx2])
              {
                  merge[x++] = arr[idx1++];
              }else{
                  merge[x++] = arr[idx2++];
              }
          }
          while(idx1<=mid)
          {
              merge[x++] = arr[idx1++];
          }
          while(idx2<=ei)
          {
             merge[x++] = arr[idx2++]; 
          }
          for(int i=0,j=si;i<merge.length;i++ , j++)
          {
              arr[j] = merge[i];
          }
      }
}
