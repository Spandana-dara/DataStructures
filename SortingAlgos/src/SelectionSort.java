public class SelectionSort {

  public static void main(String[] args){
    int[] arr ={5,9,3,2,1};
    int n= arr.length;
    int i,j,temp,minIndex;
    for(i=0;i<n-1;i++){
      minIndex = i;
      for(j=i+1;j<n;j++){
        if(arr[j]<arr[minIndex]){
          minIndex = j;
        }
      }
      temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex]= temp;
    }
    for(i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }

}
