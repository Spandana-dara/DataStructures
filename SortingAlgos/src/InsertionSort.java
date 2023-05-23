public class InsertionSort {

  public static void main(String[] args){
    int[] arr ={5,9,3,2,1};
    int n= arr.length;
    int i,j,key;
    for(i=0;i<n;i++){
      key= arr[i];
      j=i-1;
      while(j>=0 && arr[j]>key){
        arr[j+1]=arr[j];
        j=j-1;
      }
      arr[j+1]= key;
    }
    for(i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }

}
