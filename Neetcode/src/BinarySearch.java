public class BinarySearch {

  public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 5};
    int n = 2;
    int index =binarySearch(arr,0, arr.length-1, n);
    System.out.println(index);
    int indexWithoutRecursion =binarySearchWithoutRecursion(arr,0, arr.length-1, n);
    System.out.println(indexWithoutRecursion);
  }

  public static int binarySearch(int[] arr, int low, int high, int n){
    if(low<=high){
      int mid = low+ (high-low)/2;
      if(n<arr[mid]){
        return binarySearch(arr, low, mid-1, n);
      }
      else if(n>arr[mid]){
        return binarySearch(arr, mid+1, high, n);
      }
      else{
        return mid;
      }
    }
    return -1;
  }

  public static int binarySearchWithoutRecursion(int[] arr, int low, int high, int n){
    while(low<=high){
      int mid = low+ (high-low)/2;
      if(n<arr[mid]){
        high = mid-1;
      }
      else if(n>arr[mid]){
        low= mid+1;
      }
      else{
        return mid;
      }
    }
    return -1;
  }
}
