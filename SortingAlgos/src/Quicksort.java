public class Quicksort {
  public static void main(String[] args){
    int[] arr= {1,2,-8,3,4};
    int n=arr.length;
    quicksort(arr, 0, n-1);
    for(int i=0;i<n;i++){
      System.out.println(arr[i]);
    }
  }

  public static void quicksort(int[] arr, int start, int end) {
    if (start < end) {
      int pIndex = partition(arr, start, end);
      quicksort(arr, start, pIndex - 1);
      quicksort(arr, pIndex + 1, end);
    }
  }

  public static int partition(int[] arr, int start , int end){
      int pIndex=start;
      int pivot = arr[end];
      for(int i=start; i<end;i++){
        if(arr[i]<=pivot){
          int temp = arr[i];
          arr[i] = arr[pIndex];
          arr[pIndex] = temp;
          pIndex++;
        }
    }
      int temp= arr[pIndex];
      arr[pIndex]=arr[end];
      arr[end] = temp;
      return pIndex;
    }
}





