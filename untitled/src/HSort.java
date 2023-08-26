public class HSort {
    public static  void sortInt(int[]arr){
        for (int i= arr.length/2-1; i>=0; i--){
            heapify (arr, arr.length, i);
        for (int i= arr.length-1; i>=0; i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify (arr, i, 0);
        }
        }
    }
    private  static  void heapify(int arr, int hSize, int rootIndex){
        int largest =rootIndex;
        int lChaild=2*rootIndex+1;
        int rChaild=2*rootIndex+2;
        if (lChaild < hSize && arr[lChaild] > arr[largest]) {
            largest=lChaild;
        }
        if (rChaild < hSize && arr[rChaild] > arr[largest]) {
            largest=rChaild;
        }
        if (largest!=rootIndex){
            int temp=arr[rootIndex];
            arr[rootIndex]=arr[largest];
            arr[largest]=temp;
            heapify(arr,hSize,largest);
        }
    }
}
