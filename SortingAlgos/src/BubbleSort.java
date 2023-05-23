public class BubbleSort {

  public static void main(String[] args){
    int[] arr = {5,9,2,3,1};
    int n= arr.length;
    int i,j,temp;
    boolean swapped;
    for(i=0;i<n-1;i++){
      swapped=false;
      for(j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
          temp = arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
          swapped=true;
        }
      }
      if(swapped==false){
        break;
      }
    }
    for(i=0;i<n;i++){
      System.out.println(arr[i]);
    }
    
  }


}
