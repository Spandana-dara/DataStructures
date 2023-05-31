public class SearchInRotatedSubArray {

  public static void main(String[] args){
    int[] arr={20,30,40,50,60,5, 10};
    int n=arr.length;
    int index =search(arr, 0,n-1,60);
    System.out.println(index);
  }

  public static int search(int[] arr, int low, int end, int key){
    while(low<=end){
      int mid = low + (end-low)/2;
      if(arr[mid]==key){
        return mid;
      }
      if(arr[low]<arr[mid]){
         if(key>=arr[low] && key<arr[mid]){
           end=mid-1;
         }
         else{
           low=mid+1;
         }
      }
      else{
          if(key>arr[mid] && key<=arr[end]){
            low=mid+1;
          }
          else{
            end=mid-1;
          }
      }

    }
    return -1;
  }

}
