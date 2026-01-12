class Solution {
    public void nextPermutation(int[] A) {
        // FAIND PIVOT
        int pivot = -1;
        int n = A.length;
        for(int i= n-2 ; i>=0 ; i--){
            if(A[i]<A[i+1]){
                pivot = i;
                break;
            }
        }
        // IN PLACE CHANGES
        if(pivot == -1){
            Arrays.sort(A);
            return;
        }
        // next largest element
        for(int i = n-1 ; i>pivot ; i--){
            if(A[i]>A[pivot]){
                int temp = A[i];
                A[i] = A[pivot];
                A[pivot] = temp;
                break;
            }
        }
        int i = pivot+1, j=n-1;
        while(i<=j){
            int temp = A[i];
            A[i]=A[j];
            A[j]=temp;
            i++;
            j--;
        }
    }

}